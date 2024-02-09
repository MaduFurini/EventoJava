# EventoJava

Evento da Rocketseat

Aprendizado de Java utilizando Postgres, Docker e springboot

# Anotações Aula 1

    Framework Spring
        - Criará o bootstrap da aplicação
        - Define os pacotes, dependências, linguagem
        - Quem será o gerenciador de pacote
        - Dependências que se auto configuram

    Jar X War
        - Jar não precisa de um servidor web para executar uma aplicação
        - War precisa de um servidor
        - Jar pode ser executado no próprio terminal

    Dependências utilizadas
        - Spring Web
            - Construção de aplicações RESTful
            - Utilizar Tomcat como servidor padrão, container
        - Spring Boot Dev Tolls
            - Live reload - toda vez que salvar ele restarta automaticamente
        - Lombok
            - Gera Getters e setters
            - Para cada item das minhas entidades que eu quiser pegar ou definir, é necessário fazer isso com funções de GET e SET, com o Lombok ele já faz isso sozinho

    Funções arquivos
        - pom.xml 
            - Configurações do springboot    
        - mvnw.cmd & mvnw
            - Rodar o maven sem necessariamente ter ele no ambiente
            - .cmd para rodar no Windows e o mvnw para Linux
        - Diretório target
            - Onde ficarão os arquivos depois de rodar a aplicação
            - Gerada pelo maven
            - Onde ficará o .jar
            - Classes e dependências compiladas
        - Diretório test
            - Testes
        - Diretório main
            - Arquivos principais
        
    CertificationNlwApplication.java
        - Classe principal onde partiremos
        - Executará a aplicação
        - Colocará um container

    Java
        - Baseado em anotations
            - Cada annotation tem a sua responsabilidade
            - Componentes que baseado em seu nome, o spring ja sabe o que tem que fazer
        - Os atributos (itens com @) são colocados conforme as classes que eu quero (logo acima delas)

    Executar aplicação
        - Classe Principal clicando em run 
        - Plugin maven - lifecycle e rodar
        - Comando mvn spring-boot:run - recomendado

    Application Properties
        - Configuração de propriedades
            "Ex: Porta de servidor, banco de dados"

    Controller
        - Colocado na mesma estrutura da application
            - Devido seu processo de varredura e gerenciamento 

    API REST
        - Métodos Comuns -> GET, POST, PATCH, PUT, DELETE
        - Tipos de parâmetros
            - Body - Corpo da requisição 
            - Query Params - Parâmetros baseados em queries
                - Chave e valor separados por &
                - http://localhost:8085/users?nome=Maria&idade=17
                - Opcionais
            - Parâmetros de rotas - Fazem parte da rota
                - Separado por barras e entre chaves 
                - http://localhost:8085/users/{nome}/{idade}

    Códigos
        - @RestController //Entende que é pra retornar em via JSON - API REST
        - @RequestMapping("/primeiraController") //Definir path

# Anotações Aula 2
    Spring Data JPA
        - Dependência que integra a aplicação com o banco de dados
        - Hibernate -> ORM 
            - Mapear os atributos e converter para que o banco de dados entenda e vice-versa
    
    Camada Repositório (Repository)
        - Interagir como banco de dados