package com.lealceldeiro.valuedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Application
 *
 * @author Asiel Leal Celdeiro | lealceldeiro@gmail.com
 * @version 0.1
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ConfigClass config) {
        Logger log = Logger.getAnonymousLogger();
        return strings -> {
            log.log(Level.INFO, "Before: " + config.getAccessKey());
            config.setAccessKey("anotherValue");
            log.log(Level.INFO, "After: " + config.getAccessKey());
        };
    }
}
