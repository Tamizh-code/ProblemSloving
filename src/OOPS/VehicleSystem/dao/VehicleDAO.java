package VehicleSystem.dao;


import VehicleSystem.db.DBConnection;
import VehicleSystem.Model.*;

import java.sql.*;

public class VehicleDAO {

    Connection con = DBConnection.getConnection();

    // Insert
    public void save(Vehicle v) {

        try {

            String q = "INSERT INTO vehicle(type,brand,price,extra) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, v.getType());
            ps.setString(2, v.getBrand());
            ps.setDouble(3, v.getPrice());
            ps.setString(4, v.getExtra());

            ps.executeUpdate();

            System.out.println("Saved in DB!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fetch
    public void showAll() {

        try {

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM vehicle");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("type") + " " +
                                rs.getString("brand") + " " +
                                rs.getDouble("price") + " " +
                                rs.getString("extra")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
