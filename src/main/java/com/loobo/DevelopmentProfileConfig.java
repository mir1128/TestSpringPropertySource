package com.loobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
@Import(DiskConfiguration.class)
public class DevelopmentProfileConfig {

    @Autowired
    Environment env;

//    @Bean
//    public CDPlayer cdPlayer() {
//        for (String s : env.getActiveProfiles()) {
//            System.out.println(s);
//        }
//
//        return new DevelopCDPlayer(env.getProperty("disc.artist"));
//    }

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
