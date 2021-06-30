package br.com.isaque.abstractmethod.factories;

import br.com.isaque.abstractmethod.aircrafts.Helicopter;
import br.com.isaque.abstractmethod.aircrafts.IAircraft;
import br.com.isaque.abstractmethod.landvehicles.ILandVehicle;
import br.com.isaque.abstractmethod.landvehicles.Motorcycle;

public class NineNineFactory implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransporteAircraft() {
        return new Helicopter();
    }
}
