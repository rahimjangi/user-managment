package com.raiseup.springbank.user.core.configuration;

import com.mongodb.client.MongoClient;
import org.axonframework.extensions.mongo.eventsourcing.eventstore.MongoFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Value("${spring.data.mongodb.host:127.0.0.1}")
    private String mongoHost;

    @Value("${spring.data.mongodb.port:27017}")
    private int mongoPort;

    @Value("${spring.data.mongodb.database:user}")
    private String mongoDatabase;

    @Bean
    public MongoClient mongo() {
        MongoFactory mongoFactory = new MongoFactory();
//        mongoFactory.setMongoAddresses(Collections.singletonList(new ServerAddress(mongoHost, mongoPort)));
//        mongoFactory.se
        return mongoFactory.createMongo();
    }

}
