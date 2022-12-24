public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada",
                "Granta",
                1.7
        );
        System.out.println("Марка автомобиля " + granta.getBrand() +
                ", модель " + granta.getModel() +
                ", объем двигателя " + granta.getEngineCapacity());



        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0
        );
        System.out.println("Марка автомобиля " + audi.getBrand() +
                ", модель " + audi.getModel() +
                ", объем двигателя " + audi.getEngineCapacity());

        Car bmw = new Car("BMW",
                "Z8",
                3.0
        );
        System.out.println("Марка автомобиля " + bmw.getBrand() +
                ", модель " + bmw.getModel() +
                ", объем двигателя " + bmw.getEngineCapacity());

        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                2.4
        );
        System.out.println("Марка автомобиля " + kia.getBrand() +
                ", модель " + kia.getModel() +
                ", объем двигателя " + kia.getEngineCapacity());


        Bus man = new Bus("MAN",
                "Lion's City",
                1.7);
        System.out.println("Марка автомобиля " + man.getBrand() +
                ", модель " + man.getModel() +
                ", объем двигателя " + man.getEngineCapacity());

        Bus citroen = new Bus("Citroen",
                "Jumper II",
                2.0
        );
        System.out.println("Марка автомобиля " + citroen.getBrand() +
                ", модель " + citroen.getModel() +
                ", объем двигателя " + citroen.getEngineCapacity());

        Bus mercedes = new Bus("Mercedes-Benz",
                "Sprinter Classic",
                1.7
        );
        System.out.println("Марка автомобиля " + mercedes.getBrand() +
                ", модель " + mercedes.getModel() +
                ", объем двигателя " + mercedes.getEngineCapacity());

        Bus toyota = new Bus("Toyota",
                "Coaster",
                2.0
        );
        System.out.println("Марка автомобиля " + toyota.getBrand() +
                ", модель " + toyota.getModel() +
                ", объем двигателя " + toyota.getEngineCapacity());

        Driver<Car> ivanov = new Driver<>("Иванов", "Иван", "Иванович",
                false, 20, granta);

        System.out.printf("Водитель " + ivanov.getFirstName() + " " + ivanov.getMiddleName() + " "
                + ivanov.getLastName()
                + " управляет автомобилем " + granta.getBrand() + " " + granta.getModel() +
                " и будет участвовать в заезде.");
    }
}