# Clean Install
mvn clean install -U

# Compila cada dependency, uma de cada vez
mvn compile assembly:single

# Cria um jar com as dependencies do IpmaApiClient
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file   -Dfile=/home/flip/Área\ de\ Trabalho/IES_98083/lab1/lab1_5/IpmaApiClient-app/target/IpmaApiClient-app-1.1-jar-with-dependencies.jar   -DgroupId=IpmaApiCLient   -DartifactId=IpmaApiCLient-app   -Dversion=1.1   -Dpackaging=jar   -DlocalRepositoryPath=lib


## IPMA
<plugin>
  <artifactId>maven-assembly-plugin</artifactId>
  <configuration>
      <archive>
          <manifest>
              <mainClass>fully.qualified.MainClass</mainClass>
          </manifest>
      </archive>
      <descriptorRefs>
          <descriptorRef>jar-with-dependencies</descriptorRef>
      </descriptorRefs>
  </configuration>
</plugin>


## WEATHER
<dependency>
  <groupId>IpmaApiClient</groupId>
  <artifactId>IpmaApiClient-app</artifactId>
  <version>1.1</version>
</dependency>

<repositories>
    <repository>
        <id>my-local-repo</id>
        <url>file://${basedir}/lib</url>
    </repository>
</repositories>