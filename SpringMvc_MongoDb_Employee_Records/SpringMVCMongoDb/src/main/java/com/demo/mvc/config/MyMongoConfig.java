package com.demo.mvc.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.demo.mvc.repository")
public class MyMongoConfig {

    @Bean
    public MongoClient mongoClient()
    {
        return  MongoClients.create("mongodb://localhost:27017");
    }

    @Bean
    public MongoTemplate mongoTemplate()
    {
        return new MongoTemplate(mongoClient(),"employeeRecords");
    }
}
