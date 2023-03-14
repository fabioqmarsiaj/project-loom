package com.fabioqmarsiaj.projectloom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLoomApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProjectLoomApplication.class, args);

        // * Virtual threads are cheap enough that a new virtual thread can be created for each task, there should never be a need to pool virtual threads.
        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Hello"));
        thread.join();
    }

}
