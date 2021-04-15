## Exercici Spring Rest API & Rest Client (M14)

<p align="right">
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/spring-long.svg" title="spring-long" alt="spring-long" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/java.svg" title="java" alt="java" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/mysql.svg" title="mysql" alt="mysql" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/html-5.svg" title="html-5" alt="html-5" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/css-3.svg" title="css-3" alt="css-3" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/thymeleaf.png" alt="thymeleaf" height="35px">
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/bootstrap.svg" title="bootstrap" alt="bootstrap" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/datatables.png" title="mysql" alt="mysql" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/postman.svg" title="postman" alt="postman" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/eclipse.svg" title="eclipse" alt="eclipse" height="35px"/>
  <img src="https://github.com/GerardPuigl/TechnologyStackIcons/blob/main/Logos/visual-studio-code.svg" title="visual-studio-code" alt="visual-studio-code" height="35px"/>
</p>

## Descripció

Exercici per crear una aplicació amb Spring JPA per accés a diferents bases de dades amb vàries taules relacionades entre elles.
Projecte realitzat amb Spring i amb patró MVC aplicat. S'ha volgut aprofundir en la utilització de Thymeleaf.

Link: https://white-collar-it.herokuapp.com/index

### - Nivell 1 - (Rest API Spring)

Realització d'una Rest API per fer peticions HTTP amb un CRUD (Create, Read, Update, Delete) al complet. Per això s'ha implementat un patró d'arquitectura MVC amb repositori en memòria.

S'ha utilitzat Spring (Java) construït amb Maven amb les implementacions:
- Spring Boot DevTools.
- Spring Web.
- Thymeleaf.
- Spring Data JPA.
- Mysql database connector.
- h2 database.

Creació d'una web per una franquícia que vol vendre quadres de manera il·legal camuflat dins d'una botiga de collarets anomenada "white collar".

La Rest API ha de permetre:
- Crear botiga: li direm el nom i la capacitat (POST /shops/). 
- Llistar botigues: retorna la llista de botigues amb el seu nom i la capacitat (GET /shops/). 
- Afegir quadre: li donarem el nom del quadre i el del autor (POST /shops/{ID}/pictures) 
- Llistar els quadres de la botiga (GET /shops/{ID}/pictures). 
- Incendiar quadres: per si ve la policia, es poden eliminar tots els quadres de la botiga sense deixar rastre (DELETE /shops/{ID}/pictures). 

Durant la creació de la web s'ha completat el llistat anterior amb un CRUD complet de les dues entitats.
Implementació de base de dades persistent MySQL i creació de dos perfils de propietats per alternar entre MySQL i H2 (BD en memoria)
Comprovació de peticions amb Postman. 

### - Nivell 2 - (Rest Client Thymeleaf/HTML/CSS)

Creació d'una web amb Thymeleaf/HTML/CSS per crear una web de gestió i creació de les botigues i una taula per cada una de les botigues per gestionar el seu stock. Les botigues tenen una capacitat màxima que quan es sobrepassa llença una excepció que recondueix a una web d'error.

Tot i ser una sola aplicació s'ha volgut simular una petició a un servidor Rest Api extern i s'ha gestionat amb Spring Boot sobre plantilles thymeleaf.

S'ha utilitzat Bootstrap i s'ha modificat per donar un aspecte singular a la botiga.

### - Nivell 3 - (Creació WAR i pujada a un servidor Tomcat)

En aquest nivell s'ha configurat el projecte per exportar un arxiu war i mitjançant un servidor Tomcat s'ha provat el seu funcionament.

### - Heroku - (Pujada a un servidor al núvol)

S'ha configurat el projecte per ser accessible de manera remota des del núvol:

https://white-collar-it.herokuapp.com/index


