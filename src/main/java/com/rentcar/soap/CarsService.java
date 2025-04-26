package com.rentcar.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CarsService {
    @WebMethod
    String saludar(String nombre);
    
    @WebMethod
    List<Car> getCars();
}
