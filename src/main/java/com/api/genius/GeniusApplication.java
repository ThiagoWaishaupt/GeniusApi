package com.api.genius;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeniusApplication {

    public static void main(final String[] args) throws IOException, ParseException {
        SpringApplication.run(GeniusApplication.class, args);
    }

}
