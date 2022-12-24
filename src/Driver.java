import java.util.Objects;

public class Driver<T extends Transport> {
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean drivingLicense;
    private int experience;
    private T vehicle;


    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public T getVehicle() {
        return vehicle;
    }

    public Driver(String firstName, String middleName, String lastName, boolean drivingLicense, int experience,
                  T vehicle) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
        this.vehicle = vehicle;
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishMoving(){
        System.out.println("Закончить движение");
    }

    public void refuelVehicle(){
        System.out.println("Заправить транспортное средство.");
    }

    public void printDriverVehicle() {
        System.out.printf("Водитель " + getFirstName() + getMiddleName() + getLastName() +
                " управляет транспортирным средством " + getVehicle());
    }
}
