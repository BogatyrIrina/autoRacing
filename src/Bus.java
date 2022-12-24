public class Bus extends Transport {

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение автобуса");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение автобуса");
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
