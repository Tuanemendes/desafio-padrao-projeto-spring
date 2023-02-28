package one.digitalinnovation.labpadraoprojetospring.service.impl;

import one.digitalinnovation.labpadraoprojetospring.model.Cliente;
import one.digitalinnovation.labpadraoprojetospring.model.ClienteRepository;
import one.digitalinnovation.labpadraoprojetospring.model.Endereco;
import one.digitalinnovation.labpadraoprojetospring.model.EnderecoRepository;
import one.digitalinnovation.labpadraoprojetospring.service.ClienteService;
import one.digitalinnovation.labpadraoprojetospring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    private void salvarClienteComCep(Cliente cliente) {
        //verificar se o endereço do cliente já existe pelo cep
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet( () -> {
           //caso não exista , integrar com o viacep e persistir o retorno
           Endereco novoEndereco = viaCepService.consultarCep(cep);
           enderecoRepository.save(novoEndereco);
           return novoEndereco;
        });
        cliente.setEndereco(endereco);
        //inseir Cliente , vinculando o endereço novo ou existente
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //busca cleinte por id , cado exista
        Optional<Cliente> clienteId = clienteRepository.findById(id);
        if(clienteId.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        //delata cliente por id
        clienteRepository.deleteById(id);
    }
}
