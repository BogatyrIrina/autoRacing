public class DriverB extends Driver<Car>  {


    public DriverB(String firstName, String middleName, String lastName, boolean drivingLicense, int experience, Car vehicle) {
        super(firstName, middleName, lastName, drivingLicense, experience, vehicle);
    }

    public void printDriverVehicle(){
        System.out.printf("Водитель " + getFirstName() + getMiddleName() + getLastName() +
                " управляет транспортирным средством " + getVehicle());
    }
}
