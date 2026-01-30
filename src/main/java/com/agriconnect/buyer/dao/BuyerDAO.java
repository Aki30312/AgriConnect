package com.agriconnect.buyer.dao;

import com.agriconnect.buyer.model.Buyer;
import com.agriconnect.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class BuyerDAO{
    public void registrationBuyer(Buyer buyer){
        String sql = "INSERT INTO buyers(name, email, password) VALUES(?, ?, ?)";
        try(Connection conn = DBConnection.getConnection();
        PreparedStatement ps =conn.prepareStatement(sql)) {
            ps.setString(1, buyer.getName());
            ps.setString(2, buyer.getEmail());
            ps.setString(3, buyer.getPassword());
            ps.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error registering buyer: " + e.getMessage());
        }
    }
    public boolean LoginBuyer(String email, String password){
        String sql = "SELECT * FROM buyer WHERE email = ?";
        try (Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1. email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
        catch (Exception e){
            System.out.println("Login error: " + e.getMessage());
            return false;
        }
    }
}
