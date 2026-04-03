package com.Practise.BootToJPA.Services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public Upstox createUpstox(){
        return new Upstox();
    }
}
