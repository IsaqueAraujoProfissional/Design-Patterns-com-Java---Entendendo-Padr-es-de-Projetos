package br.com.isaque.ocp;

public class Vehicle {
    //Classe Vehicle mal feita, não há herança nem uso de Interface
    //Forma ruim de escrver um código
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }
    void car(){
        System.out.println("Criando um carro: "+ color + " " +
                year+ " " + engine + " com " + seats + " assentos");
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando um carro: "+ color + " " +
                year+ " " + engine + " cilindradas");
    }
    private void startVehicle() {
        System.out.println("Ligando os motores");
    }
}
