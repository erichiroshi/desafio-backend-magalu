# 💼 Desafio Backend - Magazine Luiza
Este documento descreve o desafio técnico proposto pelo Magazine Luiza para o cargo de Engenheiro de Software Back-end.

---

## 🎯 Objetivo
Desenvolver um serviço de notificações agendadas, permitindo o agendamento, consulta e cancelamento de notificações via API REST.
As notificações podem ser enviadas por diferentes canais, como E-MAIL, SMS ou PUSH.

---

## 🧾 Requisitos Funcionais
1. Agendar uma notificação

   - Endpoint: POST /notifications

2. Deve permitir agendar uma notificação com data, destino, mensagem e canal.

   - Retorna 202 Accepted ao agendar com sucesso.

3. Consultar uma notificação

   - Endpoint: GET /notifications/{id}

4. Retorna os dados da notificação, incluindo status e canal.

5. Cancelar uma notificação

   - Endpoint: DELETE /notifications/{id}

6. Cancela a notificação agendada e retorna 204 No Content.

---

## ⚙️ Tecnologias Recomendadas
- Java 25
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Springdoc OpenAPI
- Docker

---

## 📋 Avaliação
Serão avaliados os seguintes pontos:
- Estrutura do projeto e organização.
- Clareza e legibilidade do código.
- Tratamento de erros e boas práticas REST.
- Cobertura de testes automatizados.
- Uso de documentação via Swagger.
- Qualidade do README.md e da entrega geral.

## 🏁 Diferenciais
- Monitoramento com Spring Boot Actuator.
- Uso de Docker Compose.
- Implementação de filas (mensageria) para processamento assíncrono.
- Padrões de projeto e princípios SOLID.
- Testes unitários e de integração.

---

<p align="center"> <em>“A excelência de um software está na clareza de sua arquitetura e na simplicidade de sua execução.”</em> </p>