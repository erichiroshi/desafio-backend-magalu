<p align="center" width="100%">
    <img width="50%" src="images/logo-magalu.png"> 
</p>


<h3 align="center">
  Desafio Backend da Magalu
</h3>

<p align="center">
  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-java-green">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">
</p>

# Sumário
+ [Tecnologias utilizadas](#tecnologias-utilizadas)
+ [Entenda o desafio](#entenda-o-desafio)
+ [Como interagir com o banco de dados?](#como-interagir-com-o-banco-de-dados)
+ [Como interagir com a API?](#como-interagir-com-a-api)
+ [Desenvolvimento](#desenvolvimento)
+ [Construção](#construção)
+ [Contribuições](#contribuições)
+ [Links](#links)
+ [Exemplos de Uso](#exemplos)


## Tecnologias utilizadas
* Java 21
* Spring Boot
* Spring Data JPA
* Spring Scheduler
* Lombok
* Flyway
* Postgres
* H2
* Docker

## Entenda o desafio
Leio o [readme](PROBLEM.md) do problema.

## Como interagir com o banco de dados?
- Utilizamos o H2 para perfil de teste e o Postgres para perfil de dev.

Acesse a pasta docker, abra o prompt e digite o comando:

```
docker-compose up -d
```

Irá subir o banco de dados Postgres na porta 5432.

usuário: postgres

senha: 123456

database: magaludb

* Ao subir o projeto o flyway irá criar as tabelas no banco de dados.

Para acessar o H2: http://localhost:8080/h2-console

Para acessar o Postgres: utilizamos o Visual Studio Code com a extensão Database Client JDBC.

## Como interagir com a API?
- Utilizamos o [Postman](https://www.postman.com/) - para realizar as requisições.

## Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:

```shell
cd "diretorio de sua preferencia"
git clone https://github.com/erichiroshi/desafio-backend-magalu.git
```

## Construção
Para construir o projeto com o Maven, executar os comando abaixo:

```shell
mvn clean install
ou
.\mvnw clean install 
```

O comando irá baixar todas as dependências do projeto e criar um diretório *target* com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

## Contribuições
Contribuições são sempre bem-vindas! Para contribuir lembre-se sempre de adicionar testes unitários para as novas classes com a devida documentação.

## Links
Projeto desenvolvido seguindo o canal [Build & Run](https://www.youtube.com/watch?v=af4W9Q4vB1s)

## Exemplos
### 📨 Requisições
| Método | Url | Descrição | Corpo da requisição |
| --- | --- | --- | --- |
| POST | /notifications | Cria notificação | [JSON](#notification) |
| GET | /notifications/{id} | Busca uma notificação por id | |
| DELETE | /notifications/{id} | Apagua uma notificação por id. | |
---
### 📄 Corpo da requisição
##### <a id="notification">/notifications - Cria uma notificação.</a>

```json
{
  "dateTime": "2024-06-29T14:56:00",
  "destination": "teste@gmail.com",
  "message": "Seja bem vindo!",
  "channel": "EMAIL"
}
```

## Developed by Eric Hiroshi
