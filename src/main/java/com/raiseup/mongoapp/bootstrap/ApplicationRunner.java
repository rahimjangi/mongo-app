package com.raiseup.mongoapp.bootstrap;

import com.raiseup.mongoapp.model.FlightInformation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ApplicationRunner implements CommandLineRunner {

    private final MongoTemplate mongoTemplate;
    @Override
    public void run(String... args) throws Exception {
        log.info("Application started!");
        mongoTemplate.save(FlightInformation.builder()
                .build());
    }
}
