/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIELOS
 */
public class ConexionBD {

    Connection con;
    String BD = "Escuela";
    String URL = "jdbc:mysql://localhost:3306/" + BD;
    String USERNAME = "root";
    String PASSWORD = "tacos97";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("se conecto a la bases de datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR en la conexion de base de datos");
        }
        return con;
    }

    public void Desconectar() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("ERROR al tratar de cerrar la conexion");
        }
    }

}
