public class App {
    public static void main(String[] args) throws Exception {
        Car vehicle1 = new Car("Toyota", "Corolla", 2022, 4);
        Motorcycle vehicle2 = new Motorcycle("Honda", "CBR500R", 2023, 500.0);
        Truck vehicle3 = new Truck("Volvo", "FH16", 2021, 25000.0);
        Vehicle vehicle4 = new Car("kia","soluto",2025,4);

        vehicle1.mover();
        vehicle1.star();
        vehicle2.mover();
        vehicle2.star();
        vehicle3.mover();
        vehicle3.star();
        vehicle4.mover();

    }
}
