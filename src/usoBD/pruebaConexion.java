/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoBD;

import javax.swing.JOptionPane;

/**
 *
 * @author fanma
 */
public class pruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (conexion.iniciar() != null){
            JOptionPane.showMessageDialog(null, "Conectado exitosamente...");
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la conexion");
        }
    }
    
}
