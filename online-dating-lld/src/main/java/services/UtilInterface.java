package services;

import entities.Location;
import entities.User;

import java.util.List;

public interface UtilInterface {

     double calculateSimilarityScore(User person1, User person2);
     int checkSimilarHobby(List<String> h1, List<String> h2);
     int calculateDistance(Location l1 , Location l2);
     String findDistanceType(int distance);
}
