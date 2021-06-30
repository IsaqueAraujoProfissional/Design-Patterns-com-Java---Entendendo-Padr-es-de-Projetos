package br.com.isaque.factorymethod;

import br.com.isaque.factorymethod.vehicles.IVehicle;
import br.com.isaque.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
