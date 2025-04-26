package com.rentcar.soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
    private int id;
    private String name;
    private int dni;
    private String patent;
    private String brand;
    private String model;
    private int price;

    public Car() {}

    public Car(int id, String name, int dni, String patent, String brand, String model, int price) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.patent = patent;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getPatent() { return patent; }
    public void setPatent(String patent) { this.patent = patent; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
