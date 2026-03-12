README.md
📌 API de Cadastro de Pessoas

Esta é uma API REST desenvolvida com Java e Spring Boot que permite realizar o cadastro e gerenciamento de pessoas.

A aplicação implementa operações básicas de CRUD (Create, Read, Update, Delete) e foi estruturada utilizando o padrão de camadas (Controller, Service e Model).

🚀 Funcionalidades

A API permite:

Cadastrar uma nova pessoa

Listar todas as pessoas cadastradas

Buscar pessoa pelo ID

Atualizar dados de uma pessoa

Deletar uma pessoa do sistema

🛠️ Tecnologias Utilizadas

Java

Spring Boot

API REST

JSON

Maven

Banco de dados (ex: MySQL ou PostgreSQL)

📂 Estrutura do Projeto
src
 └── main
     └── java
         └── com.projeto1.Api
             ├── controller
             │     └── PessoaController
             │
             ├── service
             │     └── PessoaService
             │
             ├── models
             │     └── Pessoa
             │
             └── repository
📡 Endpoints da API
1️⃣ Cadastrar Pessoa

POST /cadastro

Exemplo de requisição
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "idade": 30
}
2️⃣ Listar todas as pessoas

GET /cadastro

Retorna uma lista com todas as pessoas cadastradas.

3️⃣ Buscar pessoa por ID

GET /cadastro/{id}

Exemplo:

GET /cadastro/1
4️⃣ Atualizar pessoa

PUT /cadastro/{id}

Exemplo
{
  "nome": "João Silva",
  "email": "novoemail@email.com",
  "idade": 31
}
5️⃣ Deletar pessoa

DELETE /cadastro/{id}

Exemplo:

DELETE /cadastro/1
▶️ Como executar o projeto
1️⃣ Clonar o repositório
git clone https://github.com/seuusuario/api-cadastro-pessoas
2️⃣ Entrar na pasta do projeto
cd api-cadastro-pessoas
3️⃣ Executar o projeto

Se estiver usando Maven:

mvn spring-boot:run

A API ficará disponível em:

http://localhost:8080
📄 Descrição do Projeto (para GitHub)

Este projeto consiste em uma API REST para cadastro de pessoas, desenvolvida utilizando Java e Spring Boot.

A aplicação permite realizar operações de CRUD em um sistema de cadastro, possibilitando adicionar, listar, atualizar e remover pessoas do banco de dados.

O sistema foi estruturado utilizando o padrão de arquitetura em camadas:

Controller – responsável por receber as requisições HTTP

Service – responsável pela lógica de negócio

Model – representa a entidade Pessoa

Este projeto foi desenvolvido com fins educacionais e acadêmicos, servindo como exemplo de implementação de uma API REST com Java.# APi_Email
Api rest para o cadastro de pessoas e envio de email
