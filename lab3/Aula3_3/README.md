curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"1","title":"title1"}' | json_pp
curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"2","title":"title2"}' | json_pp
curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"3","title":"title3"}' | json_pp
curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"4","title":"title4"}' | json_pp
curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"5","title":"title5"}' | json_pp

curl -X POST localhost:8080/addquote -H 'Content-Type:application/json' -d '{"id":"1","quote":"quote1", "movie_id": "1"}' | json_pp
curl -X POST localhost:8080/addquote -H 'Content-Type:application/json' -d '{"id":"2","quote":"quote2", "movie_id": "2"}' | json_pp
curl -X POST localhost:8080/addquote -H 'Content-Type:application/json' -d '{"id":"3","quote":"quote3", "movie_id": "3"}' | json_pp
curl -X POST localhost:8080/addquote -H 'Content-Type:application/json' -d '{"id":"4","quote":"quote4", "movie_id": "4"}' | json_pp
curl -X POST localhost:8080/addquote -H 'Content-Type:application/json' -d '{"id":"5","quote":"quote5", "movie_id": "5"}' | json_pp

curl -X POST localhost:8080/addshow -H 'Content-Type:application/json' -d '{"id":"1","title":"title1", "quotes": [{"id":"1","quote":"quote1"}, {"id":"2","quote":"quote2"}]}' | json_pp