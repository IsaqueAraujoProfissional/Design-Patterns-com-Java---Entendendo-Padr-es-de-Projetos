package br.com.isaque.abstractmethod.app;

import br.com.isaque.abstractmethod.aircrafts.IAircraft;
import br.com.isaque.abstractmethod.factories.ITransportFactory;
import br.com.isaque.abstractmethod.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransporteAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
