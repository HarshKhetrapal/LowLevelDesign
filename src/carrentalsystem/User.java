package carrentalsystem;

public class User {
    String id;
    String name;
    String drivingLincense;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLincense() {
        return drivingLincense;
    }

    public void setDrivingLincense(String drivingLincense) {
        this.drivingLincense = drivingLincense;
    }
}
