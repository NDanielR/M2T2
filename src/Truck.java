public class Truck extends Vehicle {

    Double loadCapacity;

    public Truck(String vehicleBrand, String model, Integer year, Double loadCapacity) {
        super(vehicleBrand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Este camion puede cargar un peso de: " + loadCapacity);
    }

    @Override
    public void mover() {
        System.out.println("El camión avanza lentamente.");
        
    }

    

    

}
