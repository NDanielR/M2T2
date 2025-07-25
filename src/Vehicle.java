public abstract class Vehicle {

    private String vehicleBrand;

    private String model;

    private Integer year;

    public Vehicle(String vehicleBrand, String model, Integer year) {
        this.vehicleBrand = vehicleBrand;
        this.model = model;
        this.year = year;
    }

    public void mostrarInfo(){
        System.out.println("Brand: " + vehicleBrand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public abstract void mover();
    
}
