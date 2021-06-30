package br.com.isaque.abstractmethod.factories;

import br.com.isaque.abstractmethod.aircrafts.IAircraft;
import br.com.isaque.abstractmethod.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransporteAircraft();
}
