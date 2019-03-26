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

    private List<Comment> comments = new ArrayList<>();

    public List<Comment> allMessages() {
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

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void setCommentRepository(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
