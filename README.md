<h1> Desafio: Padrão de projeto utilizando Spring</h1>

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)



<h2>Índice</h2>

* [Descrição do Projeto](#descrição-do-projeto)
* [Ferramentas Utilizadas](#ferramentas-utilizadas)
* [Conceitos](#conceitos)
* [Desenvolvido Por](#desenvolvido-por)


<h2>💻 Descrição do Projeto</h2>


<p>

Desafio apresentado pelo tech 

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
<strong>-Spring Web:</strong>
<br> 
<strong>-Spring Data JPA:</strong> 
<br> 
<strong>-H2 databese:</strong>  é utilizado para criar um banco em mémoria com as configurações no arquivo application.properties
### H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2

### Datasource
spring.datasource.url=jdbc:h2:file:/home/tuanemendes/Documents/bdh2
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.hibernate.ddl-auto=update
<br> 
<strong>-OpenFeign:</strong> 
<br> 
</p>

<h2>👩‍🎓 Conceitos</h2>

<p>

<strong>Spring-boot</strong> 

<strong>Anotations</strong>  

</p>


<h2> 👩‍💻 Desenvolvido Por</h2>


Realizado o desafio por [Tuane](https://www.linkedin.com/in/tuane-mendes/)
