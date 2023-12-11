package interfacesGUI;

import javax.swing.JOptionPane;
import usoBD.CRUD;
import usoBD.logginU;
import usoBD.sql;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import usoBD.statsUsuarios;

public class infoJugador extends javax.swing.JFrame {
    logginU Loggin;
    CRUD crud;
    statsUsuarios stats;

    /**
     * Creates new form infoJugador
     */
    public infoJugador() {
        initComponents();
        this.crud = new CRUD();
        this.mostrarRegUs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertImagen2 = new practicas.tema2.insertImagen();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));

        insertImagen2.setRutaImagen(new java.io.File("C:\\Users\\fanma\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto\\src\\ImagenProyectoTopicos\\chalkboard_by_jjplayz565_dfa9uex-fullview.png"));

        tablaRegUsuarios.setAutoCreateRowSorter(true);
        tablaRegUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        tablaRegUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaRegUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        tablaRegUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaRegUsuarios);

        javax.swing.GroupLayout insertImagen2Layout = new javax.swing.GroupLayout(insertImagen2);
        insertImagen2.setLayout(insertImagen2Layout);
        insertImagen2Layout.setHorizontalGroup(
            insertImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertImagen2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        insertImagen2Layout.setVerticalGroup(
            insertImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertImagen2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(insertImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insertImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(infoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private practicas.tema2.insertImagen insertImagen2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegUsuarios;
    // End of variables declaration//GEN-END:variables

    private void mostrarRegUs(){
        this.tablaRegUsuarios.removeAll();
        DefaultTableModel modelT = (DefaultTableModel) this.tablaRegUsuarios.getModel();
        
        modelT.addColumn("No.");
        modelT.addColumn("Usuario");
        modelT.addColumn("Progreso");
        modelT.addColumn("Horas de juego(en minutos)");
        
        try {
            ResultSet resultado = this.crud.select(sql.selectStsUsuarios());
            while(resultado.next()){
                Object[] colmStats = {resultado.getInt(1),resultado.getString(2),resultado.getString(3), resultado.getString(4)};
                modelT.addRow(colmStats);
            }//cierre while
            this.tablaRegUsuarios.setModel(modelT);
        }catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }//Cierre de metodo mostrarRegUs
}