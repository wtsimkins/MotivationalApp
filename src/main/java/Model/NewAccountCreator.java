package Model;

import Controllers.User;

public class NewAccountCreator extends User {

    public NewAccountCreator(int id, String name, String username, String password, String email) {
        super(id, name, username, password, email);
    }

    public User createUser(){
        return null;
    }
}
