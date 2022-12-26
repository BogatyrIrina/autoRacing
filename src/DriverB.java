public class DriverB extends Driver<Car>  {


    public DriverB(String firstName, String middleName, String lastName, boolean drivingLicense, int experience, Car vehicle) {
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
