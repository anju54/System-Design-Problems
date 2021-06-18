package services;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class LikeDislikeServiceImpl implements LikeDislikeService{

    public void like(User user1 , User user2){

        List<User> likes = new ArrayList<>();
        likes.add(user2);
        user1.setLikes(likes);
    }

    public void getListOfLike(int userId){

        // get user id by likes
        // first get the user by user id
        // then find the likes list of that user by using the method getLikes() present in user class
    }
}
