package com.aravindcz.mygpt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Choice implements Serializable {

    public int index;
    public ChatGPTMessage message;
    public String finish_reason;

}
