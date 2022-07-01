package com.example.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Loaded automatically by Spring
@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    // All command line runner beans will be run after the application context is loaded
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {  // Requests a copy of the repo
        return args -> {
            // Create two entities and store
            log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
        };
    }
}