package com.rentcar.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CarsService {
    @WebMethod
    String saludar(String nombre);
    // Returns a list with cars
    @WebMethod
    List<Car> getCars();
}
