package com.rentcar.soap;

import com.rentcar.soap.CarsService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.List;

public class ClienteSOAP {

    public static void main(String[] args) throws Exception {
            URL wsdlURL = new URL("http://localhost:8080/soap/cars?wsdl");


            QName qname = new QName("http://soap.rentcar.com/", "CarsServiceImplService");


            Service service = Service.create(wsdlURL, qname);


            CarsService port = service.getPort(CarsService.class);

            List<Car> cars = port.getCars();
            for (Car car : cars) {
                System.out.println("name: " + car.getName() + ", Model: " + car.getModel() + ", dni: " + car.getDni());
            }
    }
}
