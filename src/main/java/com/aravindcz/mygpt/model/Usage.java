package com.aravindcz.mygpt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Usage implements Serializable {

    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;

}
