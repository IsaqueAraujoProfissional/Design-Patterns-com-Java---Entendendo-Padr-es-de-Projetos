package br.com.isaque.abstractmethod.aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando decolagem!");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo. Vôo autorizado!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25km, ventos ok!");
    }
}
