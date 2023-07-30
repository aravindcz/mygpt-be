package com.aravindcz.mygpt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChatGPTMessage {

    private String role;
    private String content;

    ChatGPTMessage(String role,String content){
        this.role = role;
        this.content = content;
    }

}
