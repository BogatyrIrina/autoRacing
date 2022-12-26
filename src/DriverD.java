public class DriverD extends Driver<Truck> {

    public DriverD(String firstName, String middleName, String lastName, boolean drivingLicense, int experience,
                   Truck vehicle) {
        super(firstName, middleName, lastName, drivingLicense, experience, vehicle);
    }
    public void startMoving() {
        System.out.println("Начинаю движение автомобиля " + getVehicle().getBrand() +  " " + getVehicle().getModel());
    }
    public void finishMoving(){
        System.out.println("Заканчиваю движение автомобиля " + getVehicle().getBrand() +  " " + getVehicle().getModel());
    }
    public void refuelVehicle(){
        System.out.println("Заправляю транспортное средство " + getVehicle().getBrand() +  " " + getVehicle().getModel());
    }
}
