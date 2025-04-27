package com.rentcar.soap;

import com.rentcar.soap.CarsService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.List;

public class ClienteSOAP {

    public static void main(String[] args) throws Exception {
            URL wsdlURL = new URL("http://localhost:8080/soap/cars?wsdl"); 


            QName qname = new QName("http://soap.rentcar.com/", "CarsServiceImplService"); // identifies the service


            Service service = Service.create(wsdlURL, qname); // create the service


            CarsService port = service.getPort(CarsService.class); // obtains the endpoint of the service

            List<Car> cars = port.getCars();
            for (Car car : cars) {
                System.out.println("name: " + car.getName() + ", Model: " + car.getModel() + ", dni: " + car.getDni()); // shows the results
            }
    }
}
