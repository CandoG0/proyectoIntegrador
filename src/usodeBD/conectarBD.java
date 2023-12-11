/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodeBD;

import usoBD.conexion;

public class conectarBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (conexion.iniciar() !=null){
            System.out.println("Conectado exitosamente");
        } else{
            System.err.println("Ocurrio un fallo en la conexion");
        }
    }
    
}
