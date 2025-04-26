package com.example.tight.couping;

public class UserManager {

    private UserData userData;

        public String getUserInfo(){
        return userData.getUserData();
    }

    public UserManager(UserData userData) {
        this.userData = userData;
    }
}
