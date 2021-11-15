curl -X POST localhost:8080/api/v1/employees -H 'Content-Type:application/json' -d '{"firstName":"John"."lastName":"Cena","emailId":"jonhCena@gmail.com"}' | json_pp
curl -X POST localhost:8080/api/v1/employees -H 'Content-Type:application/json' -d '{"firstName":"Jonh","lastName":"Doe","emailId":"jonhDoe@gmail.com"}' | json_pp
curl -X POST localhost:8080/api/v1/employees -H 'Content-Type:application/json' -d '{"firstName":"Pedro","lastName":"Lopes","emailId":"pedroLopes@gmail.com"}' | json_pp
curl -X POST localhost:8080/api/v1/employees -H 'Content-Type:application/json' -d '{"firstName":"Pedro","lastName":"fontes","emailId":"fedroLopes@gmail.com"}' | json_pp
curl -X POST localhost:8080/api/v1/employees -H 'Content-Type:application/json' -d '{"firstName":"Pedro","lastName":"Lopes","emailId":"padroLopes@gmail.com"}' | json_pp

curl -X POST localhost:8080/api/v1/employees/1 -H 'Content-Type:application/json' -d '{"firstName":"aaaaedro","lastName":"Lopes","emailId":"padroLopes@gmail.com"}' | json_pp
curl -X GET localhost:8080/api/v1/employees

curl -X GET localhost:8080/api/v1/employees