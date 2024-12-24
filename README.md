### Requisiti
Maven
Docker

### Comandi per l'avvio
Posizionarsi sulla cartella di progetto ed eseguire i seguenti comandi.

mvn clean package

docker build . -t init-postgres:latest -f './docker/Dockerfile_db'

docker build . -t provatecnica-be:latest -f './docker/Dockerfile_be'

docker-compose -f './docker/docker-compose.yaml' up



