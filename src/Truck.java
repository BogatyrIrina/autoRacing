public class Truck extends Transport {
    public Truck(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение грузового автомобиля");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение грузового автомобиля");
    }

    @Override
    public void pitStop() {

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }
}
