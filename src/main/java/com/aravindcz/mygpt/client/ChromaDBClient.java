package com.aravindcz.mygpt.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChromaDBClient {

    @Value("${chromadb.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    public String getContextData(String userChat){

        String contextData = restTemplate.getForObject(url+userChat,String.class);
        return contextData;

    }

}
