#API REST Na Nuvem
API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway Bootcamp **Java Cloud Native** do Bradesco 2025

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```
## 👩‍💻 Desenvolvedora

<p>
    <img 
      align="left" 
      width="80" 
      src="https://github.com/Mirellawanessa/DIO-Trilha-Java-Basico/blob/main/GitHub/imagens/User.jpeg?raw=true"
    />
    <p>&nbsp;&nbsp;&nbsp;Mirella Wanessa<br>
    &nbsp;&nbsp;&nbsp;
    <a href="https://github.com/Mirellawanessa">GitHub</a>&nbsp;|&nbsp;
    <a href="https://www.linkedin.com/in/mirellawanessa/">LinkedIn</a>&nbsp;|&nbsp;
    <a href="https://www.instagram.com/_mirella.page/?next=%2F">Instagram</a>
    &nbsp;|&nbsp;</p>
</p>

---

⌨️ with 💜 by [Mirella Wanessa](https://github.com/Mirellawanessa)
