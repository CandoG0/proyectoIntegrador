/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    private static final String USUARIO = "root";
    private static final String PASSWORD = "cl0udprogr4m";
    private static final String BD = "usuarios";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;
    
    public static Connection Conexion;
    
    public static Connection iniciar(){
        conexion.Conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion.Conexion = (Connection) DriverManager.getConnection(
                    conexion.URL,
                    conexion.USUARIO, 
                    conexion.PASSWORD);
            System.out.println("Conectado a la base de datos exitosamente");
        } catch (SQLException | ClassNotFoundException e ){
            conexion.Conexion = null;
            System.err.println("Error de conexion: " + e.getMessage());
        }
        return conexion.Conexion;
    }
    
}
