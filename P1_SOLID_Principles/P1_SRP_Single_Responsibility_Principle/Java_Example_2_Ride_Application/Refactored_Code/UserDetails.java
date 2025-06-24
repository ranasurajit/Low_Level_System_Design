package P1_SOLID_Principles.P1_SRP_Single_Responsibility_Principle.Java_Example_2_Ride_Application.Refactored_Code;

public class UserDetails {
    private String userId;
    private String userName;
    private String email;
    private RideDetails ride;

    public UserDetails(String userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserEmail() {
        return this.email;
    }

    public void assignRide(RideDetails ride) {
        this.ride = ride;
    }

    public RideDetails getRideDetails() {
        return this.ride;
    }
}
