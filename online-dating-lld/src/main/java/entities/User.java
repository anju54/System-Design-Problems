package entities;

import java.util.List;

public class User {

    private int userId;
    private int age;
    private String gender;

    private Location location;

    private List<String> hobbies;

    private List<User> likes;

    public User(){

    }

    public User User(int userId){
        return this;
    }

    public User(int userId, int age, String gender, Location location) {
        this.userId = userId;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }
}
