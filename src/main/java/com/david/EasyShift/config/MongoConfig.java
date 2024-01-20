
package com.david.EasyShift.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "eastShiftdb";
    }

    @Override
    public boolean autoIndexCreation() {
        return true; // or false, depending on your preference
    }


}
