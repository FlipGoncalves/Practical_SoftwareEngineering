curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"1","title":"title1", "quotes": [{"id":"1","quote":"quote1"}, {"id":"2","quote":"quote2"}]}' | json_pp

curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"2","title":"title2", "quotes": [{"id":"2","quote":"quote2"}, {"id":"3","quote":"quote3"}]}' | json_pp

# Docker
docker build --build-arg JAR_FILE=target/Aula3_3-0.0.1-SNAPSHOT.jar -t movieapi/mainapp .
docker run -p 8010:8010 movieapi/mainapp
