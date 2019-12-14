package com.hackagr1d.team4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HackaGr1dApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HackaGr1dApplication.class, args);
    }
}
