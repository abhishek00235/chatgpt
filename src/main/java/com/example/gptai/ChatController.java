package com.example.gptai;


import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/send")
public class ChatController {

    @Autowired
    private ChatClient chatClient;

    @PostMapping("")
    public String sendMessage(@RequestBody String message){
       return chatClient.call(message);
    }
}
