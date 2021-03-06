package edu.uga.cs.mobile_dev_final_project;

public class User {
    private String email;
    private String fullName;
    private int travelPoints;
    private String gender;
    private PendingPost pp;
    private Ride ride;

    public User() {}

    public User(String email, String fullName, int travelPoints, String gender, PendingPost pp, Ride ride) {

        this.email = email;
        this.fullName = fullName;
        this.travelPoints = travelPoints;
        this.gender = gender;
        this.pp = pp;
        this.ride = ride;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTravelPoints() {
        return travelPoints;
    }

    public void setTravelPoints(int travelPoints) {
        this.travelPoints = travelPoints;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PendingPost getPp() {
        return pp;
    }

    public void setPp(PendingPost pp) {
        this.pp = pp;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }
}
