public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.start();  // wywołanie przesłoniętej metody start()
        System.out.println("Liczba miejsc w samochodzie: " + car.getNumberOfSeats());
        car.stop();   // wywołanie przesłoniętej metody stop()
    }
}

//zadanie 3,4
public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal lion = new Lion();
        Animal dog = new Dog();
        Animal wolf = new Wolf();

        cat.makeNoise();   cat.roam();
        System.out.println("-----");

        lion.makeNoise();  lion.roam();
        System.out.println("-----");

        dog.makeNoise();   dog.roam();
        System.out.println("-----");

        wolf.makeNoise();  wolf.roam();
    }
}