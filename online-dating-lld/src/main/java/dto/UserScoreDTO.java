package dto;

public class UserScoreDTO {

    private int userId;
    private double score;
    private int distance;

    public UserScoreDTO(int userId, double score, int distance) {
        this.userId = userId;
        this.score = score;
        this.distance = distance;
    }

    public UserScoreDTO(int userId, double score) {
        this.userId = userId;
        this.score = score;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
