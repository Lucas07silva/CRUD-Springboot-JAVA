# 🚀 Minha Primeira API com Java e Spring Boot

API REST desenvolvida com **Java, Spring Boot e MongoDB**, com o objetivo de consolidar os fundamentos do desenvolvimento backend, a criação de endpoints HTTP e a integração com um banco de dados NoSQL.

O projeto faz parte da minha jornada de aprendizado em desenvolvimento de software, aplicando conceitos fundamentais para a construção de aplicações modernas, organizadas e escaláveis.

## 🛠️ Tecnologias Utilizadas

- **Java 25** — linguagem de programação utilizada no desenvolvimento.
- **Spring Boot 4.1.1** — framework para criação e configuração da aplicação.
- **Spring Web MVC** — desenvolvimento de endpoints e requisições HTTP.
- **Spring Data MongoDB** — integração e persistência de dados no MongoDB.
- **MongoDB** — banco de dados NoSQL orientado a documentos.
- **Maven Wrapper** — gerenciamento de dependências e execução do projeto sem exigir uma instalação global do Maven.

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- [Java JDK 25](https://www.oracle.com/java/technologies/downloads/)
- [Git](https://git-scm.com/)
- [MongoDB](https://www.mongodb.com/try/download/community) ou acesso a uma instância do MongoDB Atlas.

## ⚙️ Como Executar o Projeto

### 1. Clone o repositório

Abra o terminal e execute:

```bash
git clone <URL_DO_SEU_REPOSITORIO>
```

Entre na pasta do projeto:

```bash
cd minha-primeira-api
```

### 2. Configure o MongoDB

Certifique-se de que o MongoDB esteja em execução ou que você tenha uma instância disponível no MongoDB Atlas.

Configure a conexão com o banco de dados no arquivo `src/main/resources/application.properties`, de acordo com a estrutura do seu projeto.

Exemplo de configuração:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/minha_primeira_api
```

> **Importante:** ajuste a URI conforme o ambiente utilizado. Não publique credenciais ou senhas de acesso ao banco de dados no repositório.

### 3. Execute a aplicação

**Windows:**

```powershell
.\mvnw.cmd spring-boot:run
```

**Linux ou macOS:**

```bash
./mvnw spring-boot:run
```

Se tudo estiver configurado corretamente, a aplicação será iniciada e os logs aparecerão no terminal.

Por padrão, aplicações Spring Boot utilizam a porta `8080`, salvo configuração diferente no projeto.

### 4. Acesse a API

Com a aplicação em execução, acesse:

```text
http://localhost:8080
```

Esse endereço representa a raiz da aplicação. Para testar os recursos da API, utilize os endpoints definidos nos seus controllers.

Você pode realizar requisições HTTP usando ferramentas como:

- [Postman](https://www.postman.com/)
- [Insomnia](https://insomnia.rest/)
- [cURL](https://curl.se/)

## 📁 Estrutura do Projeto

Uma estrutura típica para este projeto Spring Boot é:

```text
minha-primeira-api/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── .../
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── MinhaPrimeiraApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

*Observação: a estrutura acima é ilustrativa. Os pacotes `controller`, `model` e `repository` devem corresponder à organização real do código.*

## 🎯 Objetivos de Aprendizagem

Com este projeto, busco desenvolver e aprimorar conhecimentos em:

- Criação de APIs RESTful com Java e Spring Boot.
- Organização de aplicações backend.
- Construção de endpoints HTTP.
- Integração entre aplicações Java e bancos de dados NoSQL.
- Gerenciamento de dependências com Maven.
- Configuração e execução de aplicações Spring Boot.
- Testes e validação de requisições HTTP.

## 📚 Próximos Passos

Possíveis melhorias para a evolução do projeto:

- Implementar operações CRUD completas.
- Adicionar validação de dados de entrada.
- Padronizar o tratamento de erros e exceções.
- Criar testes automatizados.
- Documentar os endpoints com Swagger/OpenAPI.
- Implementar autenticação e autorização, caso necessário.

## 👨‍💻 Autor

**Lucas Vinicius Barbosa da Silva**

Estudante de Sistemas de Informação, interessado em desenvolvimento de software, Java, APIs RESTful e tecnologias backend.

🔗 **GitHub:** [Lucas07silva](https://github.com/Lucas07silva)

---

⭐ *Projeto desenvolvido com foco no aprendizado contínuo e na evolução em desenvolvimento backend.*
