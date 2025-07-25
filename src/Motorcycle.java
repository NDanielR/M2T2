public class Motorcycle extends Vehicle {

    public Double cilidrada;

    public Motorcycle(String vehicleBrand, String model, Integer year, Double cilidrada) {
        super(vehicleBrand, model, year);
        this.cilidrada = cilidrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta acelera.");

    }

}
