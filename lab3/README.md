A) The Controller is a class which is responsible for preparing a model Map with data to be displayed by the view as well as choosing the right view itself. The RestController is a Controller that directly writes into the response stream and completes the request. This behaviour is very useful for responding calls to RESTful web services because there we just return data instead of returning a view.
Some differences are:
- The @Controller is a common annotation which is used to mark a class as Spring MVC Controller while the @RestController is a special controller used in RESTFul web services and the equivalent of @Controller + @ResponseBody.
- One of the key difference between @Controler and @RestCotroller in Spring MVC is that once you mark a class as @RestController then every method is written a domain object instead of a view.
- The @Controller returns a view, while the @RestController returns data.

C) The @Id annotation defines the primary key of the Employee entity.In our case, we even use @GeneratedValue(strategy = GenerationType.AUTO) to automatically generate an id whenever a new Employee is created.
The @Table annotation is used to specify the table name. We can also use it to mention the schema. If this annotation is not used, the name of the table will be the name of the entity.
The @Column annotation is used to mention the detaiks of a column in the table, such as __name__, __length__, __nullable__ and __unique__. If we don't specify this annotation, the name of the column in the table will be the name of the field.

D) The annotation @Autowired allows Spring to resolve and inject collaborating beans into our bean.
To enable autowiring, we just need to use the @SpringBootApplication, that is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan.
We can use @Autowired in:
- Properties: Using @Autowired in a property eliminates the need for getters and setters;
- Setters: Using @Autowired on a setter makes it so that the method is called when the object that contains the setter is created;
- Constructors: Using @Autowired on a constructor makes it so that Spring injects instances of properties as arguments of the constructor;