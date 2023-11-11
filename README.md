# RestAPI Application
Simple api testing Railway platform

<p align="">
    <a alt="Ubuntu">
        <img src="https://img.shields.io/badge/Ubuntu-E95420?ubuntu&logoColor=white" />
    </a>
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-blue?logo=gradle" />
    </a>
    <a alt="Intellij">
        <img src="https://img.shields.io/badge/IntelliJ%20IDEA-deeppink.svg?logo=IntelliJ-IDEA&logoColor=white" />
    </a>
    <a alt="Railway">
        <img src="https://img.shields.io/badge/Railway-0B0D0E.svg?logo=Railway&logoColor=white" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring_Boot-3.1.5-SNAPSHOT?logo=spring-boot" />
    </a>
    <a alt="Spring Data">
        <img src="https://img.shields.io/badge/Spring_Data-gray?logo=spring" />
    </a>
    <a alt="Hibernate">
        <img src="https://img.shields.io/badge/Hibernate-59666C.svg?logo=Hibernate&logoColor=white" />
    </a>
    <a alt="Postgresql">
        <img src="https://img.shields.io/badge/PostgreSQL-316192??logoColor=white" />
    </a>
    <a alt="Swagger">
        <img src="https://img.shields.io/badge/Swagger-85EA2D?logoColor=white" />
    </a>
    <a alt="Mermaid">
        <img src="https://img.shields.io/badge/Mermaid-purple?logoColor=white" />
    </a>
</p>


## Class Diagram

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

## API Documentation
Public api is accessible at the following endpoint
[public-api](https://web-production-e701.up.railway.app/swagger-ui/index.html)