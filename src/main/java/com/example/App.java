package com.example;

// Importing packages from the SLF4J library pulled via Maven
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // Instantiate logger instance using the org.slf4j package classes
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Hello World application started!");

        String user = "Developer";
        logger.debug("Processing request for user: {}", user);

        logger.info("Hello World! Logging successfully integrated.");
    }
}
