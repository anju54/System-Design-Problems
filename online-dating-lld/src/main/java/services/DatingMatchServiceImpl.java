package services;

import dto.UserScoreDTO;
import entities.User;

import java.util.ArrayList;
import java.util.List;

public class DatingMatchServiceImpl implements DatingMatchService{

    private UtilInterface util  = new Util();

    public List<UserScoreDTO>  findMatching(String command, User person, List<User> userList){

        List<UserScoreDTO> userScoreDTOS = new ArrayList<>();

        for (int i = 0; i < userList.size() ; i++) {

            System.out.println(userList.get(i).getUserId());
            if ( userList.get(i).getUserId() != person.getUserId()) {

                User u1 = userList.get(i);
                double score = util.calculateSimilarityScore(person, userList.get(i));
                int distance = util.calculateDistance(person.getLocation(), userList.get(i).getLocation());
                userScoreDTOS.add(new UserScoreDTO(userList.get(i).getUserId(), score, distance));
            }
        }

        List<UserScoreDTO> veryNearByUserDto = new ArrayList<>();
        List<UserScoreDTO> nearByUserDto = new ArrayList<>();
        List<UserScoreDTO> distanceDoesntMatterUserDto = new ArrayList<>();
        // if person request for very near matches

        int size = userScoreDTOS.size();
        for (int i = 0; i < size; i++) {
            UserScoreDTO userScoreDTO = userScoreDTOS.get(i);
            if (userScoreDTO.getDistance() < 25){
                veryNearByUserDto.add(new UserScoreDTO(userScoreDTO.getUserId(),userScoreDTO.getScore(),userScoreDTO.getDistance()));
            }
            else if (userScoreDTO.getDistance() > 25 && userScoreDTO.getDistance() < 50){
                nearByUserDto.add(new UserScoreDTO(userScoreDTO.getUserId(),userScoreDTO.getScore(),userScoreDTO.getDistance()));
            }
            else {
                distanceDoesntMatterUserDto.add(new UserScoreDTO(userScoreDTO.getUserId(),userScoreDTO.getScore(),userScoreDTO.getDistance()));
            }
        }
        if (command == "very_near") {
            return veryNearByUserDto;
        }
        // if person request for near matches
        else if (command == "near"){
            return nearByUserDto;
        }else if (command=="doesnot_matter"){
            return distanceDoesntMatterUserDto;
        }
        return null;
    }
}
