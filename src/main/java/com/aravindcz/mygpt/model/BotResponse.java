package com.aravindcz.mygpt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class BotResponse implements Serializable {

    private String status;
    private int code;
    private String message;
    private String response;

}
