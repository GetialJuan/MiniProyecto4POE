
package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 * MiniProyecto 4 - SuperMercado Univalle
 * @author Juan Sebastian Getial Getial <202124644>
 * @author Mauricio Muñoz Gutierrez <202123687>
 * @author Santiago Torres Carvajal <2140010>
 * @profesor Luis Yovany Romo Portilla
 * Clase VentanaCompra
 */
public class VentanaCompra extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
    
    
    public VentanaCompra() {
        cargarModeloTabla();
        cargarModeloSpinner();
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void cargarModeloTabla() {
        modeloTabla.addColumn("Produto");
        modeloTabla.addColumn("Precio (COP$)");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Subtotal");
    }
    
    public void cargarModeloSpinner(){
        modeloSpinner.setMaximum(100);
        modeloSpinner.setMinimum(1);
        modeloSpinner.setValue(1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        btnCancelarVenta = new javax.swing.JButton();
        btnAgregarACompra = new javax.swing.JButton();
        btnEliminarItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarritoCompra = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        btnFinalizar = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        cboxProductos = new javax.swing.JComboBox<>();
        lblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Compra Actual");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCategoria.setText("Categoría");

        btnCancelarVenta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCancelarVenta.setText("Cancelar Compra");

        btnAgregarACompra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAgregarACompra.setText("Agregar a Compra");

        btnEliminarItem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEliminarItem.setText("Eliminar Item Seleccionado");

        tblCarritoCompra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblCarritoCompra.setModel(modeloTabla);
        jScrollPane1.setViewportView(tblCarritoCompra);

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFinalizar.setText("Finalizar");

        lblProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblProducto.setText("Producto");

        cboxProductos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Total: $XXXXXXXX");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNombre.setText("Nombre del proveedor");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        spnCantidad.setModel(modeloSpinner);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboxProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarACompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtCategoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminarItem)
                                .addGap(33, 33, 33)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(btnAgregarACompra)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarItem)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenta)
                    .addComponent(btnFinalizar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VentanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCompra().setVisible(true);
            }
        });
    }
    
    public void agregarListenersBtns(ActionListener aL){
        btnAgregarACompra.addActionListener(aL);
        btnCancelarVenta.addActionListener(aL);
        btnEliminarItem.addActionListener(aL);
        btnFinalizar.addActionListener(aL);
    }
    
    public String getCboxProductos(){
        return (String)cboxProductos.getSelectedItem();
    }
    
    public String getTxtCategoria(){
        return txtCategoria.getText();
    }
    
    public void setLblTotal(String total){
        lblTotal.setText(total);
    }
    
    public void mostrarProveedor(String nombre, String categoria, ArrayList<String> productos){
        txtNombre.setText(nombre);
        txtCategoria.setText(categoria);
        cboxProductos.removeAllItems();
        for(String p : productos){
            cboxProductos.addItem(p);
        }
    }
    
    public void limpiarTablaProductos(){
        int filas = tblCarritoCompra.getRowCount();
        for(int i = filas -1; i >= 0; i--){
            modeloTabla.removeRow(i);
        }
    }
    
    public void setTablaCarrito(ArrayList<HashMap<String,String>> carrito){
        limpiarTablaProductos();
        for(HashMap<String,String> p : carrito){
            int cantidad = Integer.parseInt(p.get("cantidad"));
            int precio = Integer.parseInt(p.get("precio"));
            int subTotal = cantidad * precio;
            Object[] fila = {p.get("nombre"), precio, 
                cantidad, subTotal};
            
            modeloTabla.addRow(fila);
        }
    }
    
    public int getFilaTabla(){
        return tblCarritoCompra.getSelectedRow();
    }
    
    public int getSpnCantidad(){
        return (int)spnCantidad.getValue();
    }
    
    public void reiniciarSpnCantidad(){
        modeloSpinner.setValue(1);
    }
    
    public boolean advertencia(){
        boolean estado = true;
        if(tblCarritoCompra.getRowCount() == 0){
            estado = false;
            JOptionPane.showMessageDialog(null, "Agregue al menos un item");
        }
        else{
            mensajesEmergentes("Comprar");
        }
        return estado;
    }
    
    public int mensajeCancelarCompra(){
        String[] opciones = {"Si","No"};
        int i = JOptionPane.showOptionDialog(rootPane, 
                        "Esta seguro que desea cancelar la compra?",
                        "Cancelar Compra",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opciones, 0);
        return i;
    }
    
    public int mensajeEliminarProducto(){
        String[] opciones = {"Si","No"};
        int i = JOptionPane.showOptionDialog(rootPane, 
                        "Esta seguro que desea eliminar el producto marcado?",
                        "Eliminar Producto",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opciones, 0);
        return i;
    }
    
    public int mensajeRelizarCompra(){
        String[] opciones = {"Si","No"};
        int i = JOptionPane.showOptionDialog(rootPane, 
                        "Esta seguro que desea realizar la compra?",
                        "Comprar",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        opciones, 0);
        return i;
    }
    
    public void mensajesEmergentes(String identificador){
        if(identificador.equalsIgnoreCase("Eliminar")){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un producto para eliminar");
        }
        if(identificador.equalsIgnoreCase("Comprar")){
            JOptionPane.showMessageDialog(rootPane, "Se ha realizado la compra");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarACompra;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> cboxProductos;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblCarritoCompra;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
