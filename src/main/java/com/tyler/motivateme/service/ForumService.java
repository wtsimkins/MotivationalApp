package com.tyler.motivateme.service;

import net.anthavio.disquo.api.DisqusApi;
import net.anthavio.disquo.api.DisqusApplicationKeys;
import net.anthavio.disquo.api.response.DisqusPost;
import net.anthavio.disquo.api.response.DisqusResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumService {
    DisqusApplicationKeys keys = new DisqusApplicationKeys("...api_key...", "...secret_key...");
    DisqusApi disqus = new DisqusApi(keys);
    private int forumID;


    public ForumService (int forumID) {
        this.forumID = forumID;
    }

    public void postComment(int forumID){
        disqus.forums();
    }

    public void updateComment(int commentID) {}

    public void deleteComment(int commentID) {}
}
