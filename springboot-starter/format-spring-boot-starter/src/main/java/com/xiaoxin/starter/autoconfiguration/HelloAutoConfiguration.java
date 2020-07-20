package com.xiaoxin.starter.autoconfiguration;


import com.xiaoxin.starter.HelloFormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties) {
        return new HelloFormatTemplate(helloProperties);
    }
}
