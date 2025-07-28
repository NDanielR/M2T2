public class Motorcycle extends Vehicle implements Startable {

    public Double cilidrada;

    public Motorcycle(String vehicleBrand, String model, Integer year, Double cilidrada) {
        super(vehicleBrand, model, year);
        this.cilidrada = cilidrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Esta moto tiene una cilindrada de: " + cilidrada);
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta acelera.");
    }

    public void star(){
        System.out.println("La moto arranca con las dos llantas en el suelo y el piloto con el casco puesto.");
    }

}
