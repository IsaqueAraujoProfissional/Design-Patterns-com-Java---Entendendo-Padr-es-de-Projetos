package br.com.isaque.factorymethod;

import br.com.isaque.factorymethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }
    protected abstract IVehicle createTransport();
}
