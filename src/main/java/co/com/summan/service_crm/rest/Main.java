package co.com.summan.service_crm.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Main extends SpringBootServletInitializer{
    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
