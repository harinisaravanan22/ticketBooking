package example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    private int userId;
    private String username;
    private String movie;
    private int seatno;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMovie() {
        return movie;
    }
    public void setMovie(String movie) {
        this.movie = movie;
    }
    public int getSeatno() {
        return seatno;
    }
    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }
    public Ticket(int userId, String username, String movie, int seatno) {
        this.userId = userId;
        this.username = username;
        this.movie = movie;
        this.seatno = seatno;
    }
    public Ticket() {
    }
    
}