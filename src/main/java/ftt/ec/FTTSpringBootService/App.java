package ftt.ec.FTTSpringBootService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * WEB Spring Boot App!
 * 
 * https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
 * https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web/2.1.0.RELEASE
 * https://spring.io/guides/gs/actuator-service/
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( new java.util.Date() + " - WEB Spring Boot App!" );
        SpringApplication.run(App.class, args);
        
    }
}
