package com.aravindcz.mygpt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ChatGPTResponseBody implements Serializable {

    private String id;
    private String object;
    private int created;
    private ArrayList<Choice> choices;
    private Usage usage;

}
