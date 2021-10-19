# Criar Projeto de Maven (trocar os +++++ pelos nomes)
mvn archetype:generate -DgroupId=++++++.app -DartifactId=+++++-app -DarchetypeArtifactID=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# Para ver os erros no projeto ao compilar
mvn package -e

# Executar a app (trocar os +++++ pelos nomes)
java -cp target/+++++-app-1.0-SNAPSHOT.jar +++++.App
ou
mvn exec:java -Dexec.mainClass="+++++.App"
ou
mvn exec:java -Dexec.mainClass="+++++.App" -Dexec.args="++++"


-------------------------------------

# Código Utilizado:
mvn archetype:generate -DgroupId=com.lab1.app -DartifactId=lab1_2-app -DarchetypeArtifactID=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn package

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


## 1.3
# Como clonar o repositorio para o computador (trocar url pelo link ssh do repositorio)
git clone url

# Adicionar todos os ficheiros para dar commit
git add .

# Commit dos ficheiros com uma mensagem (trocar message pela descricao)
git commit -m "message"

# Push dos ficheiros
git push -u origin main

# Ve as commit messages
git logger --reverse --oneline

# Escreve o log no ficheiro em vez de na command line
git log > filename.txt
