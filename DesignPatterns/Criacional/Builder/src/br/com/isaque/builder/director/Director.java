package br.com.isaque.builder.director;

import br.com.isaque.builder.builders.IBuilder;
import br.com.isaque.builder.components.CarType;
import br.com.isaque.builder.components.Engine;
import br.com.isaque.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarYpe(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarYpe(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(3000));
    }
}
