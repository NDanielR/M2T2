public class Car extends Vehicle implements Startable{

    public Integer numeroPuertas;

    public Car(String vehicleBrand, String model, Integer year, Integer numeroPuertas) {
        super(vehicleBrand, model, year);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El numero de puertas es: " + numeroPuertas);
    }

    @Override
    public void mover() {
        System.out.println("El coche se mueve por la carretera.");
    }

    public void star(){
        System.out.println("El carro arranca con las cuatro llantas en el suelo y los cinturones abrochados");
    }
}
