package com.ecommerce.ecommerce.controllers;

import com.ecommerce.ecommerce.models.Chat;
import com.ecommerce.ecommerce.responses.Message;
import com.ecommerce.ecommerce.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;
    @PostMapping("/ajouterchat")
    public Message ajouterchat(@RequestBody Chat chat)
    {
 return chatService.ajouterchat(chat);
}

}
