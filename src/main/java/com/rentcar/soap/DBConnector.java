package com.rentcar.soap;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
//manages the connection to the MySQL database
public class DBConnector {
    private final String url = "jdbc:mysql://localhost:3306/cars";
    private final String user = "root";
    private final String password = "admin";

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT id, name, dni, brand, patent, model, price FROM car ORDER BY id DESC;";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Car car = new Car(rs.getInt("id"), rs.getString("name"), rs.getInt("dni"), rs.getString("brand"), rs.getString("patent"), rs.getString("model"), rs.getInt("price"));
                cars.add(car);
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
        System.out.println(cars);
        return cars;
    }
}
