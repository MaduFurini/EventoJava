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
        