/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tqb.quizzapp;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            
//            
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
//                
//            String sql = "SELECT * FROM category";
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.excuteQuery(sql);
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                System.out.printf("%d - %s\n", id, name);
//            }
//            
//            conn.close();
            
//        } catch (ClassNotFoundException | SQLException ex) {
//            ex.printStackTrace();
        }
    }    
    
