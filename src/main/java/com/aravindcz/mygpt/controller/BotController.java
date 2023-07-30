package com.aravindcz.mygpt.controller;

import com.aravindcz.mygpt.model.BotResponse;
import com.aravindcz.mygpt.service.BotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BotController {

    @Autowired
    BotService botService;



    @CrossOrigin
    @GetMapping(value = "/chat")
    public BotResponse getBotResponse(@RequestParam("query") String userChat){
        String response = botService.getBotResponse(userChat);
        BotResponse botResponse = new BotResponse();
        botResponse.setStatus("success");
        botResponse.setCode(200);
        botResponse.setMessage("Response fetched");
        botResponse.setResponse(response);
        return botResponse;
    }

}
