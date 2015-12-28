package com.loobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SystemEnvironmentPropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@Import(DiskConfiguration.class)
public class DevelopmentProfileConfig {

    @Autowired
    Environment env;

    @Bean
    public CDPlayer cdPlayer() {
        return new DevelopCDPlayer("hello");
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
