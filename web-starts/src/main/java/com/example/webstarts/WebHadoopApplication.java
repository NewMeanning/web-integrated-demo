package com.example.webstarts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class WebHadoopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebHadoopApplication.class, args);
    }

}
