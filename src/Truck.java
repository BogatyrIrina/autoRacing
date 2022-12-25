public class Truck extends Transport implements Competing{
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
        System.out.println("Остановиться, заправиться.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Показать лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Показать максимальную скорость.");
    }
}
