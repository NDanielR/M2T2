public class Car extends Vehicle {

    public Integer numeroPuertas;

    public Car(String vehicleBrand, String model, Integer year, Integer numeroPuertas) {
        super(vehicleBrand, model, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover(){
        System.out.println("El coche se mueve por la carretera.");
    }
}
