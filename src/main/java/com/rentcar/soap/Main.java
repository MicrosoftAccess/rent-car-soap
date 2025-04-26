package com.rentcar.soap;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/soap/cars", new CarsServiceImpl());
        System.out.println("Servicio publicado en http://localhost:8080/soap/cars?wsdl");
    }
}
