/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import clientes.SqlUsuarios;
import clientes.Usuarios;
import conex.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmDetallesAlmacen extends javax.swing.JFrame {

    conexion cc = new conexion();
    Connection con = cc.conexion();

    /**
     * Creates new form FrmDetallesAlmacen
     */
    public FrmDetallesAlmacen() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt nombreProducto = new TextPrompt("Nombre del producto", txt_nombreProducto);
        TextPrompt marca = new TextPrompt("Marca", txt_marca);
        TextPrompt categoria = new TextPrompt("Categoria", txt_categoria);
        TextPrompt precio = new TextPrompt("Precio", txt_precio);
        TextPrompt cantidadDisponible = new TextPrompt("Cantidad disponible", txt_cantidadDisponible);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombreProducto = new javax.swing.JTextField();
        btn_insertarAlmacen = new javax.swing.JButton();
        btn_datosProducto = new javax.swing.JButton();
        txt_precio = new javax.swing.JTextField();
        txt_cantidadDisponible = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_insertarAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/??conos/Save_icon-icons.com_73702.png"))); // NOI18N
        btn_insertarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarAlmacenActionPerformed(evt);
            }
        });

        btn_datosProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/??conos/Go-back_36760.png"))); // NOI18N
        btn_datosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datosProductoActionPerformed(evt);
            }
        });

        txt_precio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_cantidadDisponible.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_categoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_marca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre producto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad disponible");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(txt_cantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_insertarAlmacen)
                        .addGap(68, 68, 68)
                        .addComponent(btn_datosProducto)
                        .addGap(11, 11, 11)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cantidadDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_insertarAlmacen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_datosProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_datosProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datosProductoActionPerformed
        irADatosProducto();
    }//GEN-LAST:event_btn_datosProductoActionPerformed

    private void btn_insertarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarAlmacenActionPerformed
        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        if (txt_nombreProducto.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (modSql.existeProducto(txt_nombreProducto.getText()) == 0) {
                insertarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe, agregue la nueva cantidad en stock");
            }
        }
    }//GEN-LAST:event_btn_insertarAlmacenActionPerformed

    public void insertarDatos() {
        try {

            String SQL = "insert into productos (NombreProducto,MarcaProducto,CategoriaProducto,PrecioProducto,StockProducto) values (?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, txt_nombreProducto.getText());
            pst.setString(2, txt_marca.getText());
            pst.setString(3, txt_categoria.getText());
            pst.setString(4, txt_precio.getText());
            pst.setString(5, txt_cantidadDisponible.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro existoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error al Registrar" + e.getMessage());
        }
    }

    public void irADatosProducto() {
        this.setVisible(false);
        FrmDatosProducto Dproducto = new FrmDatosProducto();
        Dproducto.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(FrmDetallesAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetallesAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetallesAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetallesAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDetallesAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datosProducto;
    private javax.swing.JButton btn_insertarAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cantidadDisponible;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
