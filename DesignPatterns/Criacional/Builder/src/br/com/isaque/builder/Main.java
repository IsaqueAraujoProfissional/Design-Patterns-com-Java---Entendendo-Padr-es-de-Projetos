package br.com.isaque.builder;

import br.com.isaque.builder.builders.CarBuilder;
import br.com.isaque.builder.builders.TruckBuilder;
import br.com.isaque.builder.car.Car;
import br.com.isaque.builder.car.Truck;
import br.com.isaque.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //criandoo carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result() + " produzido com sucesso!");
    }
}
