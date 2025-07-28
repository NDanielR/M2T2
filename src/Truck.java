public class Truck extends Vehicle {

    Double loadCapacity;

    public Truck(String vehicleBrand, String model, Integer year, Double loadCapacity) {
        super(vehicleBrand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void mostrarInfo() {
        // TODO Auto-generated method stub
        super.mostrarInfo();
    }

    @Override
    public void mover() {
        System.out.println("El camión avanza lentamente.");
        
    }

    

    

}
