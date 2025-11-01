<p align="center">
  <img width="45%" src="images/logo-magalu.png" alt="Magazine Luiza Logo">
</p>

<h3 align="center">Desafio Backend - Magazine Luiza</h3>

<p align="center">
  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-Java%2025-blue">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">
</p>

---

## 🧭 Visão Geral
Este projeto implementa um **serviço backend de agendamento de notificações** para o desafio técnico do **Magazine Luiza**.  
A aplicação permite **agendar**, **consultar** e **cancelar** notificações via API REST, utilizando **Spring Boot 3**, **JPA**, **MySQL** e **Springdoc OpenAPI**.

---

## 📚 Sumário
- [🧭 Visão Geral](#-visão-geral)
- [📚 Sumário](#-sumário)
- [⚙️ Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [🏗️ Arquitetura da Solução](#️-arquitetura-da-solução)
- [🚀 Execução do Projeto](#-execução-do-projeto)
  - [✅ Pré-requisitos](#-pré-requisitos)
  - [📥 Clonar o repositório](#-clonar-o-repositório)
  - [🐳 Subir containers](#-subir-containers)
  - [▶️ Rodar a aplicação](#️-rodar-a-aplicação)
  - [🧩 Banco de Dados](#-banco-de-dados)
- [💬 Interagindo com a API](#-interagindo-com-a-api)
- [📬 Endpoints e Exemplos](#-endpoints-e-exemplos)
  - [1️⃣ Agendar notificação — POST `/notifications`](#1️⃣-agendar-notificação--post-notifications)
  - [2️⃣ Consultar notificação — GET `/notifications/{notificationId}`](#2️⃣-consultar-notificação--get-notificationsnotificationid)
  - [3️⃣ Cancelar notificação — DELETE `/notifications/{notificationId}`](#3️⃣-cancelar-notificação--delete-notificationsnotificationid)
- [🤝 Contribuições](#-contribuições)
- [🔗 Referências e Créditos](#-referências-e-créditos)

---

## ⚙️ Tecnologias Utilizadas
| Tecnologia | Finalidade |
|-------------|-------------|
| ☕ **Java 25** | Linguagem principal |
| 🍃 **Spring Boot 3.x** | Framework de aplicação |
| 🧩 **Spring Data JPA** | Mapeamento e persistência com MySQL |
| 🩺 **Spring Boot Actuator** | Monitoramento e métricas da aplicação |
| ⚡ **Spring Boot DevTools** | Hot reload para desenvolvimento |
| ⏰ **Spring Scheduling** | Agendamento |
| 🌐 **Spring Web (Spring MVC)** | Criação das rotas REST |
| 📘 **Springdoc OpenAPI (Swagger UI)** | Documentação interativa da API |
| ※ **RFC 9457 Problem Details** | Tratamento de erros |
| 🧰 **Lombok** | Redução de boilerplate |
| 🐬 **MySQL Connector/J** | Driver JDBC para MySQL |
| 🐳 **Docker** | Containerização do ambiente |

---

## 🏗️ Arquitetura da Solução
```bash
[Cliente / Postman]
↓
REST API (Spring Boot)
↓
[NotificationController]
├── POST /notifications → agendar notificação
├── GET /notifications/{id} → consultar notificação
└── DELETE /notifications/{id} → cancelar notificação
↓
[Serviços]
└── NotificationService (camada de negócio)
↓
[Banco de Dados MySQL]
```

---

## 🚀 Execução do Projeto
### ✅ Pré-requisitos
- **Java 25+**
- **Maven 3.9+**
- **MySQL 8+**
- **Docker (opcional)**

### 📥 Clonar o repositório
```bash
git clone https://github.com/erichiroshi/desafio-backend-magalu.git
cd desafio-backend-magalu
```

### 🐳 Subir containers
Na pasta `docker/`, execute:
```bash
docker-compose up -d
```

### ▶️ Rodar a aplicação
```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:
👉 http://localhost:8080

Acessar a documentação Swagger
👉 http://localhost:8080/swagger-ui.html

### 🧩 Banco de Dados
Por padrão, a aplicação utiliza o **mysql + phpmyadmin**.  
Para acessar o console:  
👉 [http://localhost:8081/](http://localhost:8081/)

---

## 💬 Interagindo com a API
As requisições podem ser testadas via Postman, Insomnia ou via Swagger UI.

---

## 📬 Endpoints e Exemplos
### 1️⃣ Agendar notificação — POST `/notifications`
Exemplo de Request

POST `/notifications`

Request Body

```bash
{
  "dateTime": "2024-06-29T14:56:00",
  "destination": "teste@gmail.com",
  "message": "Seja bem vindo!",
  "channel": "EMAIL"
}
```

Response

```bash
HTTP/1.1 202 Accepted
```

### 2️⃣ Consultar notificação — GET `/notifications/{notificationId}`
Exemplo de Request 

GET `/notifications/1`

```bash
{
  "notificationId": 1,
  "dateTime": "2024-06-29T14:56:00",
  "destination": "teste@gmail.com",
  "message": "Seja bem vindo!",
  "channel": {
    "channelId": 1,
    "description": "email"
  },
  "status": {
    "statusId": 2,
    "description": "success"
  }
}
```

### 3️⃣ Cancelar notificação — DELETE `/notifications/{notificationId}`
Exemplo de Request 

DELETE `/notifications/1`

Response
```bash
HTTP/1.1 204 No Content
```

---

## 🤝 Contribuições
Contribuições são sempre bem-vindas!  
Para contribuir:

1. Crie um fork do repositório.  
2. Crie uma branch de feature:  
   ```bash
   git checkout -b feature/nome-da-feature
   ```
3. Commit suas mudanças:  
   ```bash
   git commit -m "feat: nova funcionalidade"
   ```
4. Envie um Pull Request. 

📜 **Boas práticas**
- Adicione testes unitários.  
- Documente suas alterações no código.  
- Use mensagens de commit seguindo o padrão **Conventional Commits**.

---

## 🔗 Referências e Créditos
- Desafio original: [Magulu Desafio Backend](problem-magalu.md)
- Baseado no conteúdo do canal [Build & Run](https://www.youtube.com/watch?v=af4W9Q4vB1s&list=PLxCh3SsamNs7y1Y-QaVdWx0MUh0wvo7TV&index=3)

- Repositório do projeto: [desafio-backend-magalu](https://github.com/erichiroshi/desafio-backend-magalu)
- Desenvolvido por [**Eric Hiroshi**](https://github.com/erichiroshi)
- Licença: [MIT](LICENSE)

---

<p align="center"> <em>“Software limpo é aquele que expressa a ideia do domínio com clareza e simplicidade.”</em> </p>
