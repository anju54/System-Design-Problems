package services;

import dto.UserScoreDTO;
import entities.User;

import java.util.List;

public interface DatingMatchService {

    List<UserScoreDTO> findMatching(String command, User person, List<User> userList);
}
