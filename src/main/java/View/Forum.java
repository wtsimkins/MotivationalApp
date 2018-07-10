package View;

import Controllers.CommentController;

public class Forum extends CommentController {
    private int forumId;

    public Forum(int forumId) {
        this.forumId = forumId;
    }

    public String postComment(int id){
        return null;
    }
}
