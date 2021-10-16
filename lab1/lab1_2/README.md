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
mvn exec:java -Dexec.mainClass=com.lab1.app.App

<dependency>
  <groupId>com.squareup.retrofit2</groupId>
  <artifactId>retrofit</artifactId>
  <version>2.9.0</version>
</dependency>
<dependency>
  <groupId>com.squareup.retrofit2</groupId>
  <artifactId>converter-gson</artifactId>
  <version>2.9.0</version>
</dependency>
<dependency>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.8.1</version>
</dependency>

mvn exec:java -Dexec.mainClass=com.lab1.app.App -Dexec.args="1010500"

<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>

<plugin>
  <artifactId>maven-surefire-plugin</artifactId>
  <version>2.19.1</version>
</plugin>
