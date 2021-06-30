package br.com.isaque.ocp.vehicles;

public interface IVehicle {
    public void configureVehicle(String color, String year, double engine, int seats);
    public void startVehicle();
}