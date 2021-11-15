curl -X POST localhost:8080/api/shows -H 'Content-Type:application/json' -d '{"id":"1"."title":"movie1","quote":"quote1"}' | json_pp
curl -X POST localhost:8080/api/shows -H 'Content-Type:application/json' -d '{"id":"23,"title":"movie2","quote":"quote2"}' | json_pp
curl -X POST localhost:8080/api/shows -H 'Content-Type:application/json' -d '{"id":"2","title":"movie3","quote":"quote3"}' | json_pp
curl -X POST localhost:8080/api/shows -H 'Content-Type:application/json' -d '{"id":"4","title":"movie4","quote":"quote4"}' | json_pp
curl -X POST localhost:8080/api/shows -H 'Content-Type:application/json' -d '{"id":"5","title":"movie5","quote":"quote5"}' | json_pp

curl -X PUT localhost:8080/api/quotes?show=1 -H 'Content-Type:application/json' -d '{"id":"1"."title":"movie1","quote":"quote1"}' | json_pp
curl -X GET localhost:8080/api/shows

curl -X GET localhost:8080/api/shows