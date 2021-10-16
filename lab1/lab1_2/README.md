mvn archetype:generate -DgroupId=++++++.app -DartifactId=+++++-app -DarchetypeArtifactID=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
# trocar os +++++ pelos nomes

mvn package -e      
# para ver os erros

java -cp target/+++++-app-1.0-SNAPSHOT.jar +++++.App
ou
mvn exec:java -Dexec.mainClass="+++++.App"
# trocar os +++++ pelos nomes  

-------------------------------------

mvn archetype:generate -DgroupId=com.lab1.app -DartifactId=lab1_2-app -DarchetypeArtifactID=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn package

java -cp target/lab1_2-app-1.0-SNAPSHOT.jar com.lab1.app.App
ou
mvn exec:java -Dexec.mainClass="com.lab1.app.App       

<dependency>
    <groupId>com.squareup.retrofit2</groupId>
    <artifactId>retrofit</artifactId>
    <version>2.8.0</version>
</dependency>
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>