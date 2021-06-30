package br.com.isaque.factorymethod;

import br.com.isaque.factorymethod.vehicles.Car;
import br.com.isaque.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
