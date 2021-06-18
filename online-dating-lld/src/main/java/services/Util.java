package services;

import entities.Location;
import entities.User;

import java.util.List;

public class Util implements UtilInterface{

    public double calculateSimilarityScore(User person1, User person2){

        int totalHobbyCountOfPerson1 = person1.getHobbies().size();
        int commonHobbyCount = checkSimilarHobby(person1.getHobbies(),person2.getHobbies());

        double similarityScore = commonHobbyCount / totalHobbyCountOfPerson1;

        return similarityScore;
    }

    public int checkSimilarHobby(List<String> h1, List<String> h2){

        // checking the equal string in both the list and returning its count
        return (int) h1.stream().filter( h2::contains).count();
    }

    public int calculateDistance(Location l1 , Location l2){

        int diff1 = l2.getxCoordinate() - l1.getxCoordinate();
        int diff2 = l2.getyCoordinate() - l1.getyCoordinate();

        double distance = Math.sqrt( Math.pow(diff1,2)+ Math.pow(diff2,2));

        int ans = (int) distance;

        return ans;
    }

    public String findDistanceType(int distance){

        String type = "";
        if (distance < 25)
            type = "VERY_NEAR";
        else if( distance > 25 && distance < 50)
            type = "NEAR";
        else
            type = "DOESN0T_MATTER";

        return type;
    }
}
