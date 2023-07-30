package com.aravindcz.mygpt.service;

import com.aravindcz.mygpt.client.ChromaDBClient;
import com.aravindcz.mygpt.client.ChatGPTClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BotService {

    @Autowired
    private ChatGPTClient chatGPTClient;

    @Autowired
    private ChromaDBClient chromaDBClient;


    public String getBotResponse(String userChat){
        String contextData = chromaDBClient.getContextData(userChat);
        if(contextData.equals(""))
            return "I dont know";
        String botResponse = chatGPTClient.getChatGPTResponse(contextData,userChat);
        return botResponse;
    }

}
