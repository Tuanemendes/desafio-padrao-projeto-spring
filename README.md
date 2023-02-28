<h1> Desafio: Padrão de projeto utilizando Spring</h1>

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)



<h2>Índice</h2>

* [Descrição do Projeto](#descrição-do-projeto)
* [Ferramentas Utilizadas](#ferramentas-utilizadas)
* [Conceitos](#conceitos)
* [Desenvolvido Por](#desenvolvido-por)


<h2>💻 Descrição do Projeto</h2>


<p>

Desafio apresentado pelo tech Venilton FalvoJr apresentando padrões de projetos, no qual foi escolhido o projeto como o spring boot, com os padrões sigleton injettar  os components do spring com @Autowired, Strategy implementação de métodos definidos na interface, Facade abstrair interações com subsistema, provendo  uam interface simples.
O projeto implementado foi utilizando dois models Cliente e Endereço e uma interface com o ViaCep para integrar a API de cep com o projeto 

</p>



<h2>🛠️Ferramentas Utilizadas</h2>

<p>

🟢  Sistema operacional Linux <br>
🟢  Java JDK 11<br>
🟢  IDE para desenvolvimento  IntelliJ<br>
🟢  Banco H2 <br>
🟢  Spring Initializr

</p>
<h2> ⛏️ Construção</h2>

<p>
Primeio processo foi realizar a criação do projeto pelo spring initializr onde foram implementada as seguintes dependecias:
<br> 
<strong>-Spring Web:</strong> adciona as dependências do Spring MVC
<br> 
<strong>-Spring Data JPA:</strong> Java persistence API  essa dependencia faz parte do framwork Spring Data  e tem como objetivo fazer a integração como aplicações Srping como o JPA  padronizar e facilitar o aceso de diferentes tecnologias de dados com banco relacionais e não relacionais.
<br> 
<strong>-H2 databese:</strong>  é utilizado para criar um banco em mémoria com as configurações no arquivo application.properties

```
H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2
```
```
Datasource
spring.datasource.url=jdbc:h2:file:/home/tuanemendes/Documents/bdh2
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
```
<br> 
<strong>-OpenFeign:</strong> OpenFeign é uma biblioteca em Java que simplifica a criação de clientes HTTP RESTful, lida com a comunicação HTTP subjacente, incluindo a criação de solicitações HTTP, a serialização e desserialização de dados, a interpretação de respostas HTTP e o gerenciamento de erros. 
<br> 
</p>

<h2>👩‍🎓 Conceitos</h2>

<p>

<strong>Spring-boot</strong> Spring Boot é um framework de desenvolvimento de aplicações em Java que tem como objetivo facilitar o processo de criação e configuração de projetos, permitindo que os desenvolvedores foquem mais na lógica de negócio do que nas configurações técnicas. Com o Spring Boot, é possível criar aplicações web, microserviços, aplicações para internet das coisas (IoT) e muito mais.

<strong>Anotations</strong> As annotations do Spring são recursos fornecidos pelo framework Spring para simplificar o desenvolvimento de aplicativos Java. Elas permitem a configuração de componentes da aplicação, a definição de endpoints de API REST, a implementação de segurança, entre outros recursos.
<br>
<br>
Algumas das annotations mais comuns do Spring são:
<br>
<br>
@Controller: usada para marcar classes como componentes responsáveis por receber as requisições e enviar as respostas de endpoints da aplicação.
<br>
@Service: usada para marcar classes que contêm a lógica de negócios da aplicação.
<br>
@Autowired: usada para marcar atributos, construtores ou métodos de configuração para que o Spring possa injetar automaticamente as dependências necessárias.
<br>
@RequestMapping: usada para mapear endpoints de API REST para métodos específicos em classes anotadas com @Controller.
<br>
@Configuration: usada para marcar classes que contêm configurações de beans para o Spring.
<br>
@EnableAutoConfiguration: usada para habilitar a configuração automática de beans no Spring.
<br>
@ComponentScan: usada para especificar o pacote base onde o Spring deve procurar por classes anotadas com @Component, @Service, @Controller, entre outras.
<br>
@Transactional: usada para marcar transações no banco de dados.

</p>


<h2> 👩‍💻 Desenvolvido Por</h2>

criado por [Venilton FalvoJr](https://www.linkedin.com/in/falvojr/)

Realizado o desafio por [Tuane](https://www.linkedin.com/in/tuane-mendes/)
