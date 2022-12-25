import java.util.Arrays;

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

        Truck kamaz = new Truck( "КАМАЗ",
                "4310",
                5);
        System.out.println("Марка автомобиля " + kamaz.getBrand() +
                ", модель " + kamaz.getModel() +
                ", объем двигателя " + kamaz.getEngineCapacity());
        Truck belaz = new Truck( "БелАЗ",
                "75710",
                5.5);
        System.out.println("Марка автомобиля " + belaz.getBrand() +
                ", модель " + belaz.getModel() +
                ", объем двигателя " + belaz.getEngineCapacity());
        Truck zil = new Truck( "ЗИЛ",
                "130",
                5);
        System.out.println("Марка автомобиля " + zil.getBrand() +
                ", модель " + zil.getModel() +
                ", объем двигателя " + zil.getEngineCapacity());
        Truck maz = new Truck( "МАЗ",
                "7310",
                6);
        System.out.println("Марка автомобиля " + maz.getBrand() +
                ", модель " + maz.getModel() +
                ", объем двигателя " + maz.getEngineCapacity());


        Driver<Car> ivanov = new Driver<>("Иванов", "Иван", "Иванович",
                true, 20, granta);

        System.out.println("Водитель " + ivanov.getFirstName() + " " + ivanov.getMiddleName() + " "
                + ivanov.getLastName()
                + " управляет автомобилем " + granta.getBrand() + " " + granta.getModel() +
                " и будет участвовать в заезде.");

        Driver<Bus> petrov = new Driver<>("Петров", "Петр", "Петрович",
                true, 20, man);

        System.out.println("Водитель " + petrov.getFirstName() + " " + petrov.getMiddleName() + " "
                + petrov.getLastName()
                + " управляет автомобилем " + man.getBrand() + " " + man.getModel() +
                " и будет участвовать в заезде.");

        Driver<Truck> sidorov = new Driver<>("Сидоров", "Сидор", "Сидорович",
                true, 20, kamaz);

        System.out.println("Водитель " + sidorov.getFirstName() + " " + sidorov.getMiddleName() + " "
                + sidorov.getLastName()
                + " управляет автомобилем " + kamaz.getBrand() + " " + kamaz.getModel() +
                " и будет участвовать в заезде.");

    }

}