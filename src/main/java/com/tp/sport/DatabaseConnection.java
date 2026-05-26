package com.tp.sport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL  = "jdbc:mysql://localhost:8889/salle_de_sport";
    private static final String USER = "root";
    // Lit le mot de passe depuis une variable d'environnement
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    private DatabaseConnection() {
        throw new UnsupportedOperationException("Classe utilitaire, non instanciable");
    }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySql Driver non trouvé", e);
        }
    }
}