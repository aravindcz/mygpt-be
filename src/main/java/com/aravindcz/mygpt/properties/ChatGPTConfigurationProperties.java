package com.aravindcz.mygpt.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("chatgpt")
@Component
@Getter
@Setter
public class ChatGPTConfigurationProperties {

    private String url;
    private String key;
    private String model;
    private String systemMessage;
    private String temperature;
    private String max_tokens;


}


