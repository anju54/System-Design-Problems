//package main;
//
//import dto.UserScoreDTO;
//import entities.Hobby;
//import entities.Location;
//import entities.User;
//import services.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class DriverClass {
//
//    public static void main(String[] args) {
//
//        DatingMatchService datingMatchService = new DatingMatchServiceImpl();
//        LikeDislikeService likeDislikeService = new LikeDislikeServiceImpl();
//
//        UserService user = new UserServiceImpl();
//
//        Location locationForA = new Location(25,35);
//        User personA = new User(1,30,"Female",locationForA);
//        String a[] = new String[] {"Running", "Biking", "Trekking", "Reading"};
//        List<String> hobbiesOfPersonA = Arrays.asList(a);
//        personA.setHobbies(hobbiesOfPersonA);
//        user.saveUser( new User(1,30,"Female",locationForA) );
//
//        Location locationForB = new Location(32,67);
//        User personB = new User(2,30,"Female",locationForB);
//        String b[] = new String[] {"Sketching", "Music", "Painting"};
//        List<String> hobbiesOfPersonB = Arrays.asList(b);
//        personB.setHobbies(hobbiesOfPersonB);
//        user.saveUser( new User(2,30,"Female",locationForB) );
//
//        Location locationForC = new Location(12,95);
//        User personC = new User(3,30,"Female",locationForC);
//        String c[] = new String[] {"Running", "Trekking"};
//        List<String> hobbiesOfPersonC = Arrays.asList(c);
//        personC.setHobbies(hobbiesOfPersonC);
//        user.saveUser( new User(3,30,"Female",locationForC) );
//
//        Location locationForD = new Location(22,37);
//        User personD = new User(4,30,"Female",locationForD);
//        String d[] = new String[] {"Sketching", "Travelling"};
//        List<String> hobbiesOfPersonD = Arrays.asList(d);
//        personD.setHobbies(hobbiesOfPersonD);
//        user.saveUser( new User(4,30,"Female",locationForD) );
//
//        Location locationForF = new Location(24,32);
//        User personF = new User(5,30,"Male",locationForF);
//        String f[] = new String[] {"Running", "Trekking", "Travelling"};
//        List<String> hobbiesOfPersonF = Arrays.asList(f);
//        personF.setHobbies(hobbiesOfPersonF);
//        user.saveUser( new User(5,30,"Male",locationForF););
//
//        // act as User table ( in terms of database )
//        List<User> listOfUser = new ArrayList<>();
//        listOfUser.add(personA);
//        listOfUser.add(personB);
//        listOfUser.add(personC);
//        listOfUser.add(personD);
//        listOfUser.add(personF);
//
//        List<UserScoreDTO> userScoreDTOList = datingMatchService.findMatching("near",personA,listOfUser);
//
//        System.out.println("Displaying matcher for PersonA");
//        for (int i = 0; i < userScoreDTOList.size(); i++) {
//            //if (userScoreDTOList.get(i).getUserId() != personA.getUserId())
//                System.out.println("Person" +userScoreDTOList.get(i).getUserId()+ " score : "+userScoreDTOList.get(i).getScore());
//        }
//
//        //likeDislikeService.like(personA,personB);
//
//    }
//}
