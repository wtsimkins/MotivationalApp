package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.service.InboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Inbox")
public class InboxController {
    @Autowired
    InboxService inboxService;

    @RequestMapping(method = RequestMethod.POST, value = "/inbox")
    public void sendMessage(int userID){
        inboxService.sendMessage(userID); }

    @RequestMapping(method = RequestMethod.GET, value = "/inbox/{id}")
    public void viewMessage(int messageID){
        inboxService.viewMessage(messageID); }


    @RequestMapping(method = RequestMethod.PUT, value = "/inbox/{id}")
    public void updateMessage(int messageID){
        inboxService.updateMessage(messageID); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/inbox/{id}")
    public void deleteMessage(int messageID){
        inboxService.deleteMessage(messageID); }


}
