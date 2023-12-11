/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoComponente;
import practicas.tema2.*;
import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author fanma
 */
public class insertImagen extends JPanel implements Serializable {
    
    private File RutaImagen;
    
    public insertImagen() {
    }
    
    public File getRutaImagen(){
        return RutaImagen;
    }
    
    public void setRutaImagen(File Rutaimagen){
        this.RutaImagen = Rutaimagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        if (RutaImagen!=null && RutaImagen.exists())
        {
        ImageIcon imageIcon = new ImageIcon(RutaImagen.getAbsolutePath());
            g.drawImage(imageIcon.getImage(), 0, 0, null);
        }
    }
    
}
