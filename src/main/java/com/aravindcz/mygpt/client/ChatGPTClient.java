package com.aravindcz.mygpt.client;

import com.aravindcz.mygpt.model.ChatGPTRequestBody;
import com.aravindcz.mygpt.model.ChatGPTResponseBody;
import com.aravindcz.mygpt.properties.ChatGPTConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class ChatGPTClient {

    @Autowired
    private ChatGPTConfigurationProperties chatGPTConfigurationProperties;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;


    public String getChatGPTResponse(String contextData,String userChat){

        ChatGPTRequestBody chatGPTRequestBody = new ChatGPTRequestBody(chatGPTConfigurationProperties,contextData,userChat);
        HttpEntity<ChatGPTRequestBody> httpEntity = new HttpEntity<ChatGPTRequestBody>(chatGPTRequestBody,httpHeaders);
        ChatGPTResponseBody chatGPTResponseBody = restTemplate.postForObject(chatGPTConfigurationProperties.getUrl(),httpEntity,ChatGPTResponseBody.class);

        log.error(String.valueOf(chatGPTResponseBody.getUsage().getTotal_tokens()));

        return chatGPTResponseBody.getChoices().get(0).getMessage().getContent();

    }

}
