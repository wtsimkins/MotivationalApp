package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Message;
import com.tyler.motivateme.model.User;
import com.tyler.motivateme.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InboxService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> allMessages() {
        List<Message> messages = new ArrayList<>();
        messageRepository.findAll()
                .forEach(messages::add);
        return messages;
    }

    public void getAllMessages(Integer id){
        messageRepository.findById(id);
    }

    public void sendMessage(Message userID){
         messageRepository.save(userID);
    }

    public void updateMessage(Message messageID) {
        messageRepository.save(messageID);
    }

    public void deleteMessage(Message messageID) {
        messageRepository.delete(messageID);
    }
}
