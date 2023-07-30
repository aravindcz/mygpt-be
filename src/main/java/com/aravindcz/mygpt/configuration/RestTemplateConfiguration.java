package com.aravindcz.mygpt.configuration;

import com.aravindcz.mygpt.properties.ChatGPTConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
public class RestTemplateConfiguration
{
    @Bean
    public RestTemplate injectRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    @Autowired
    public HttpHeaders injectHttpHeaders(ChatGPTConfigurationProperties chatGPTConfigurationProperties){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.setBearerAuth(chatGPTConfigurationProperties.getKey());
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }

}
