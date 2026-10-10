package com.mycompany.leiloesrecuperacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    public Connection connectDB() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/uc11?useSSL=false", "root", "root");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
            return null;
        }
    }
}