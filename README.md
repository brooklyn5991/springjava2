Spring Boot: Interface-Driven Development 

In this stage of the project, I transitioned from concrete class dependencies to **Loose Coupling** using Java Interfaces and Spring's 
Inversion of Control (IoC).

  Key Architectural Concepts
- **Abstraction:** Defined the `CarCompany` interface to serve as a "Contract" for the application.
- **Dependency Injection (DI):** Utilized `@Autowired` with **Constructor Injection** in the `DemoController`. This ensures the controller is always initialized with its required dependencies.
- **Component Scanning:** Annotated implementation classes with `@Component`, allowing the Spring Container to manage the bean lifecycle automatically.
- **Loose Coupling:** The `DemoController` interacts only with the `CarCompany` interface, making the system "Brand Agnostic" and easy to extend.

  Code Structure
- `CarCompany.java`: The Interface (The "What")
- `CarProduct.java`: The Implementation (The "How")
- `DemoController.java`: The Consumer (The "Who")

 Run the Demo
1. Start the application.
2. Navigate to `http://localhost:7070/car`
3. The API will return data from the injected `CarProduct` bean.
