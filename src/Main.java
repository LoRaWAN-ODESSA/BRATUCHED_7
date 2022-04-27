public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.name = "Tetiana Kovalenko";
        client1.age = 18;
        client1.cash = 20_000.00;
        client1.creditNeed = true;
        client1.creditWish = true;
        client1.driversLicense = true;

        Car car1 = new Car();
        car1.carBrand = "Mazda";
        car1.model = "3";
        car1.price = 30_000.00;
        car1.carYear = 2004;

        System.out.println("Client 1: " + client1.name);
        System.out.println("Car: " + car1.carBrand + " " + car1.model);
        client1.carSelling(car1.price);

    }
}