package services;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{

    private List<User> userList;

    public UserServiceImpl(){
        userList = new ArrayList<>();
    }

    public User saveUser(User user){

        userList.add(user);
        return user;
    }
    public User getByUserId(int usedId){

        User ex = userList.stream().filter( user -> user.getUserId() == usedId).findFirst().get();
        return ex;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> findAllUser(){

        return userList;
    }
}
