
public class Car extends Transport {

    public Car(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    @Override
    public void startMoving() {
        System.out.println("Начать движение легкового автомобиля");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение легкового автомобиля");
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
