package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.Message;
import com.tyler.motivateme.service.InboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InboxController {
    @Autowired
    InboxService inboxService;

    @RequestMapping(method = RequestMethod.POST, value = "/inbox/")
    public void sendMessage(Message userID){
        inboxService.sendMessage(userID); }

    @RequestMapping(method = RequestMethod.GET, value = "/inbox/")
    public void viewMessage(Integer messageID){
        inboxService.getAllMessages(messageID); }


    @RequestMapping(method = RequestMethod.PUT, value = "/inbox/")
    public void updateMessage(Message messageID){
        inboxService.updateMessage(messageID); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/inbox/")
    public void deleteMessage(Message messageID){
        inboxService.deleteMessage(messageID); }


}
