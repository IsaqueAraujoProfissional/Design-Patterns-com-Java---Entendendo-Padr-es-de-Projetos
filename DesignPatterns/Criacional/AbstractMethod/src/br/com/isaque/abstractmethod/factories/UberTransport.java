package br.com.isaque.abstractmethod.factories;

import br.com.isaque.abstractmethod.aircrafts.Airplane;
import br.com.isaque.abstractmethod.aircrafts.IAircraft;
import br.com.isaque.abstractmethod.landvehicles.Car;
import br.com.isaque.abstractmethod.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransporteAircraft() {
        return new Airplane();
    }
}
