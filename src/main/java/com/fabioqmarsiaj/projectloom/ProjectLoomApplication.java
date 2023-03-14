package com.fabioqmarsiaj.projectloom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLoomApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProjectLoomApplication.class, args);

        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        thread.join();
    }

}
