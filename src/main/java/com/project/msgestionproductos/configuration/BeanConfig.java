package com.project.msgestionproductos.configuration;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public JsonMapper getJsonMapper(){
        return new JsonMapper();

    }
}
