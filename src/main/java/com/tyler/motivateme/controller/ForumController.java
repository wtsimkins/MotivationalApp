package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {
    @Autowired
    ForumService forumService;

    @RequestMapping(method = RequestMethod.POST, value = "/forum")
    public void PostComment(int forumID){
        forumService.postComment(forumID); }

    @RequestMapping(method = RequestMethod.PUT, value = "/forum/{id}")
    public void updateComment(int commentID){
        forumService.updateComment(commentID); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/forum/{id}")
    public void deleteComment(int commentID){
        forumService.deleteComment(commentID); }


}
