package com.aravindcz.mygpt.model;

import com.aravindcz.mygpt.properties.ChatGPTConfigurationProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ChatGPTRequestBody implements Serializable {

    private String model;
    private List<ChatGPTMessage> messages;

    private float temperature;

    private int max_tokens;

    public ChatGPTRequestBody(ChatGPTConfigurationProperties chatGPTConfigurationProperties, String contextData, String userChat){
        ChatGPTMessage chatGPTSystemMessage = new ChatGPTMessage("system",chatGPTConfigurationProperties.getSystemMessage());
        ChatGPTMessage chatGPTUserMessage = new ChatGPTMessage("user",contextData+"\n"+userChat);
        this.messages = new ArrayList<ChatGPTMessage>();
        this.messages.add(chatGPTSystemMessage);
        this.messages.add(chatGPTUserMessage);

        this.model = chatGPTConfigurationProperties.getModel();
        this.temperature = Float.parseFloat(chatGPTConfigurationProperties.getTemperature());
        this.max_tokens = Integer.parseInt(chatGPTConfigurationProperties.getMax_tokens());
    }


}
