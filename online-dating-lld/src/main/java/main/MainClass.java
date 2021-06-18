package main;

import dto.UserScoreDTO;
import entities.Location;
import entities.User;
import services.*;

import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        DatingMatchService datingMatchService = new DatingMatchServiceImpl();
        LikeDislikeService likeDislikeService = new LikeDislikeServiceImpl();

        UserService userService = new UserServiceImpl();

        Location locationForA = new Location(25,35);
        String a[] = new String[] {"Running", "Biking", "Trekking", "Reading"};
        List<String> hobbiesOfPersonA = Arrays.asList(a);
        userService.saveUser( new User(1,30,"Female",locationForA) ).setHobbies( hobbiesOfPersonA );

        Location locationForB = new Location(32,67);
        List<String> hobbiesOfPersonB = Arrays.asList( new String[] {"Sketching", "Music", "Painting"});
        userService.saveUser( new User(2,30,"Female",locationForB) ).setHobbies(hobbiesOfPersonB);

        Location locationForC = new Location(12,95);
        String c[] = new String[] {"Running", "Trekking"};
        List<String> hobbiesOfPersonC = Arrays.asList(c);
        userService.saveUser( new User(3,30,"Female",locationForC) ).setHobbies(hobbiesOfPersonC);

        Location locationForD = new Location(22,37);
        List<String> hobbiesOfPersonD = Arrays.asList(new String[] {"Sketching", "Travelling"});
        userService.saveUser( new User(4,30,"Female",locationForD) ).setHobbies(hobbiesOfPersonD);

        Location locationForF = new Location(24,32);
        List<String> hobbiesOfPersonF = Arrays.asList( new String[] {"Running", "Trekking", "Travelling"});
        userService.saveUser( new User(5,30,"Male",locationForF)).setHobbies(hobbiesOfPersonF);

        // Test for personA -> very_near
        User personA = new User(1,30,"Female",locationForA);
        personA.setHobbies(Arrays.asList(new String[] {"Running", "Biking", "Trekking", "Reading"}));
        List<UserScoreDTO> userScoreDTOList = datingMatchService.findMatching("very_near",personA,userService.getUserList());

        System.out.println("Displaying matcher for PersonA");
        for (int i = 0; i < userScoreDTOList.size(); i++) {
            //if (userScoreDTOList.get(i).getUserId() != personA.getUserId())
                System.out.println("Person" +userScoreDTOList.get(i).getUserId()+ " score : "+userScoreDTOList.get(i).getScore());
        }

        //likeDislikeService.like(personA,personB);

    }
}
