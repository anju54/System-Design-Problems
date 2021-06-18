package services;

import entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getByUserId(int usedId);
    List<User> findAllUser();

    List<User> getUserList();

    void setUserList(List<User> userList);

}
