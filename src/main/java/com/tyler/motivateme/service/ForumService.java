package com.tyler.motivateme.service;

import com.tyler.motivateme.model.Comment;
import com.tyler.motivateme.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForumService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> allMessages() {
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAll()
                .forEach(comments::add);
        return comments;
    }

    public void getAllMessages(Integer id){
        commentRepository.findById(id);
    }


    public void postComment(Comment forumID){

        commentRepository.save(forumID);
    }

    public void updateComment(Comment commentID) {
        commentRepository.save(commentID);
    }

    public void deleteComment(Comment commentID) {
        commentRepository.delete(commentID);
    }
}
