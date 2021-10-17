mvn archetype:generate -DgroupId=++++++.app -DartifactId=+++++-app -DarchetypeArtifactID=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
# trocar os +++++ pelos nomes

mvn package -e
# para ver os erros

java -cp target/+++++-app-1.0-SNAPSHOT.jar +++++.App
ou
mvn exec:java -Dexec.mainClass="+++++.App"
# trocar os +++++ pelos nomes  

mvn exec:java -Dexec.mainClass="+++++.App" -Dexec.args="++++"
# trocar os +++++ pelos argumentos de entrada