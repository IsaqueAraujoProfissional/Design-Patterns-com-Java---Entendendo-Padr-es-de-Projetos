package br.com.isaque.builder.builders;

import br.com.isaque.builder.car.Truck;
import br.com.isaque.builder.components.CarType;
import br.com.isaque.builder.components.Engine;
import br.com.isaque.builder.components.Transmission;

public class TruckBuilder implements IBuilder{
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    @Override
    public void setCarYpe(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){
        return new Truck(carType, seats, engine, transmission);
    }
}
