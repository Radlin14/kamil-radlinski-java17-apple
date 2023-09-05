package com.kodilla.patterns.strategy.social;

public class User {
    private final String userName;
    private SocialPublisher socialPublisher;


    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return "Użytkownik " + userName + ": " + socialPublisher.share();
    }
}
