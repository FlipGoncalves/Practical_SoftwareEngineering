# Problema ao correr
Quando foi feito `mvn clean install` ou `mvn package` estava a dar erro de compilação devido ao java a utilizar ser o java 11, mudando para java 8, o erro foi eliminado, estando agora a funcionar.

# Perguntas
1. The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?
`In this case the AutoWired Annotation is tryng to get the Bean for UserRepository and by doing that this class will be instantiated automatically by SpringBoot Bean Autoconfiguration`

2. List the methods invoked in the “userRepository” object by the “UserController”. Where are these methods defined?
`The annotation @Repository is the central interface in this process, since it provides a layer of abstraction. On the other hand this annotation takes knowledge on the domain of the class to manage as well as the fields and their type in order to later on capture them and provide the programmer interfaves that extend this one. The CRUDRepository provides sophiticated CRUD Functionality to the entire class that is being supervised.`

3. Where is the databeing saved?
`The database is being saved in memory more specifically in volatile memory so as soon as the application is terminated everything will be lost.`

4. Where is the rule for the "not empty" email address defined?
`The rule is defined by the annnotation @NotBlank imported from javax.validation.constraints`
