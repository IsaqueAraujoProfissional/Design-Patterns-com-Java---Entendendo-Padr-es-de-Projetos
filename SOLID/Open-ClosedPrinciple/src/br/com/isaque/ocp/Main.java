package br.com.isaque.ocp;

import br.com.isaque.ocp.vehicles.Car;
import br.com.isaque.ocp.vehicles.Motorcycle;

public class Main {
    //Implementação de Interface obriga a implementação de métodos
    //(FECHADO PRA MODIFICAÇÃO, MAS ABERTO PRA EXTENSÃO)
    //Ter a extensão e garantia de implementação
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;
        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Azul", "2022", 2.6, 4);
        } else if(typeVehicle == TypeVehicle.MOTORCYCLE){
            Motorcycle motorcycle = new Motorcycle("Verde", "2022", 150);
        }
    }
}
