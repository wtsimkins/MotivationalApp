package com.tyler.motivateme.controller;

import com.tyler.motivateme.model.Comment;
import com.tyler.motivateme.model.Topic;
import com.tyler.motivateme.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ForumController {
    @Autowired
    ForumService forumService;

    @RequestMapping(method = RequestMethod.POST, value = "/forum/{forumid}")
    public void PostComment(Comment forumID){
        forumService.postComment(forumID); }

    @RequestMapping(method = RequestMethod.PUT, value = "/forum/{commentid}")
    public void updateComment(Comment commentID){
        forumService.updateComment(commentID); }

    @RequestMapping(method = RequestMethod.DELETE, value = "/forum/{commentid}")
    public void deleteComment(Comment commentID){
        forumService.deleteComment(commentID); }


}
