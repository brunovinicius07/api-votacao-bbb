#  API Votação BBB


##  🛠️Tecnologias Utilizadas

* Java 11
* Spring Boot
* MongoDB
* Kafka
* Swagger
* Lombok
* Docker
* Angular
* Intellij

## ⚙️Funcionalidades

#### 🧑🏽Participante
   * Criar Participante
   * Consultar Participante
   * Consultar Todos Participantes
  
#### 🗳️Votação
   * Votar no Participante
    

## 👨🏽‍💻URL Local
http://localhost:8080/api/participante/    



## 🛠️Rests da API


### 🧑🏽Participante Controller


|Rest | URL                         |Função |
|------ |-----------------------------| ------- |
|POST   | /salvar | Salvar Participante |
|GET   | /consultar/{id}| Consultar Participante por ID |
|GET   | /todos | Consultar Todos Participantes |


### 🗳️Votação Controller

| Rest  | URL             |Função |
|-------|-----------------| ------- |
| POST  | /votacao     | Votar no Participante |




