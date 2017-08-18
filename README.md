# RUN Spring Application #
 mvn spring-boot:run

# API Demo #
  > List all Persons

  `curl -s -i -X GET -H "Content-Type:application/json"  http://192.168.91.11:8888/api/persons`

  > List Person by ID

  `curl -s -i -X GET -H "Content-Type:application/json" http://192.168.91.11:8888/api/persons/1`

  > Create new Person

  `curl -s -i -X POST -H "Content-Type:application/json" -d '{"firstName": "Ashwin", "lastName": "Parmar"}' http://192.168.91.11:8888/api/persons`

  > Update existing Person by ID

  `curl -s -i -X PUT -H "Content-Type:application/json" -d '{"firstName": "Ashwin2", "lastName": "Parmar2"}' http://192.168.91.11:8888/api/persons/2`

  > Delete existing Person by ID

  `curl -s -i -X DELETE -H "Content-Type:application/json" http://192.168.91.11:8888/api/persons/2`
