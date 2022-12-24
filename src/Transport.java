public abstract class Transport {
    protected String brand;
    protected String model;
    protected double engineCapacity;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public Transport(String brand, String model, double engineCapacity) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";

            if (model == null) {
                this.model = "default";
            } else {
                this.model = model;
            }

            this.engineCapacity = engineCapacity;
        }
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    void pitStop() {
        System.out.println("Остановиться, заправиться.");
    }

    void bestLapTime() {
        System.out.println("Показать лучшее время круга");
    }

    void maxSpeed() {
        System.out.println("Показать максимальную скорость.");
    }


}
