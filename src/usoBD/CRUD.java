package usoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CRUD {
    
    Statement statement = null;
    PreparedStatement pst;
    int filaAfectada;
    ResultSet rst;
    
    public CRUD(){
        this.pst = null;
        this.rst = null;
        this.statement = null;
        this.filaAfectada = Integer.MAX_VALUE;
    }//CIERRE DE CONSTRUCTOR
    
    //METODO INSERTAR
    public boolean insert(String sql){
        try {
            this.pst = (PreparedStatement) conexion.Conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.filaAfectada = this.pst.executeUpdate();
            System.out.println("Insertado correctamente");
            return true;    
        } catch (SQLException e) {
            System.err.println("Ocurrio un error al insertar" + e.getMessage());
            return false;
        }
    }
    
    //METODO SELECCIONAR
    public ResultSet select(String sql){
        
        try {
            this.statement = conexion.Conexion.createStatement();
            return this.statement.executeQuery(sql);
        } catch(SQLException | ClassCastException e) {
            System.err.println("Error al seleccionar: " + e.getMessage());
            return null;
        }
    }
}
