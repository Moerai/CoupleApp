package com.task.frien.coupleapp;

/**
 * Created by frien on 2/26/2018.
 */

public class Chat {



    public String email;

    public String text;



    public Chat() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public Chat(String text) {

        this.text = text;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

// [END comment_class]