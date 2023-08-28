package com.ecommerce.ecommerce.services;

import com.ecommerce.ecommerce.models.Chat;
import com.ecommerce.ecommerce.repositorys.ChatRepository;
import com.ecommerce.ecommerce.responses.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;

    public Message ajouterchat(Chat chat) {

        chatRepository.save(chat);
        return new Message("chat ajoutee");
    }
}

