package com.rentcar.soap;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.rentcar.soap.CarsService")
public class CarsServiceImpl implements CarsService {
    @Override
    public String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    @Override // manage the connection to the database and brings a list of cars
    public List<Car> getCars() {
        DBConnector connector = new DBConnector();
        return connector.getAllCars();
    }
}
