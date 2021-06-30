package br.com.isaque.ocp.vehicles;

public class Car implements IVehicle /*extends Vehicle*/{
    private String color;
    private String year;
    private double engine;
    private int seats;
    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }
        @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro com Interface");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores com Interface");
    }
    //Abaixo o mesmo código porém com herança da classe Vehicle
    /*private int seats;
    public Car(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        configureCar();
    }
    public void configureCar(){
        System.out.println("Criando um carro: "+ color + " " +
                year+ " " + engine + " com " + seats + " assentos");
        startVehicle();
    }*/
}
