package com.umc.mwomeokji.acceptance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AcceptanceTest {

    @Autowired
    protected WebTestClient webTestClient;

    @Autowired
    private DatabaseCleaner databaseCleaner;

    @BeforeEach
    protected void setUp(){
        databaseCleaner.afterPropertiesSet();
    }

    @AfterEach
    protected void tearDown(){
        databaseCleaner.cleanUp();
    }
}
