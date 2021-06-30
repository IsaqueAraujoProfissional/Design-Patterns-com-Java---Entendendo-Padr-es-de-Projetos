package br.com.isaque.builder.builders;

import br.com.isaque.builder.components.CarType;
import br.com.isaque.builder.components.Engine;
import br.com.isaque.builder.components.Transmission;

public interface IBuilder {

    void setCarYpe(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
