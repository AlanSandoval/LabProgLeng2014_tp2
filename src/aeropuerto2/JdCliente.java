package aeropuerto2;

import aeropuerto2.Controlador.ControlCliente;
import aeropuerto2.Modelo.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author AlanSandoval
 */
public class JdCliente extends javax.swing.JDialog {

    //Clase que obtiene EntityManager
    GestorEntidades ge = null;
    //Clase que contiene todas las operaciones refericada a un cliente
    ControlCliente cc = null;
    JdCRUDCliente jd = null;
    DefaultTableModel modelo = null;
    Cliente c = null;

    public JdCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      //  this.ge = GestorEntidades.GetInstance();
        this.cc = new ControlCliente();
        this.modelo = (DefaultTableModel) jtCliente.getModel();
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscarDoc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVerListado = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/magnifier.png"))); // NOI18N
        btnBuscar.setText("Filtrar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CLIENTES");

        btnVerListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/find.png"))); // NOI18N
        btnVerListado.setText("Ver Todo");
        btnVerListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListadoActionPerformed(evt);
            }
        });

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/add.png"))); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/wrench.png"))); // NOI18N
        btnModificarCliente.setText("Modicar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/delete.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerListado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCliente)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnEliminarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)
                        .addComponent(btnVerListado))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente)))
                .addGap(23, 23, 23))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/page_save.png"))); // NOI18N
        jButton1.setText("Cargar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTabla() {
        LimpiarTabla();
        List<Cliente> clientes = cc.ListarClientes();
        for (Cliente item : clientes) {
            Object[] cliente
                    = {
                        item.getId(), item.getNombre(), item.getApellido(), item.getDocumento()
                    };

            System.err.println("Para Cargar en la tabla: " + item.toString());
            this.modelo.addRow(cliente);
            this.jtCliente.setModel(modelo);
            jtCliente.repaint();

        }
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }


    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        this.jd = new JdCRUDCliente(null, true);
        this.jd.setEstadoDeVentana(true);
        jd.setCc(cc);
        jd.setGe(ge);
        this.jd.setVisible(true);
        this.c = jd.getC();
        cc.AddCliente(c);        
        LimpiarTabla();
        CargarTabla();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        long dni = Long.parseLong(txtBuscarDoc.getText().trim());
        Cliente c = this.cc.BuscarClientePorDni(dni);
        if (c != null) {
            LimpiarTabla();
            Object[] cliente = {
                c.getId(), c.getNombre(), c.getApellido(), c.getDocumento()
            };
            this.modelo.addRow(cliente);
            this.jtCliente.setModel(modelo);
            jtCliente.repaint();
        } else {

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
       Long cl = (Long) modelo.getValueAt(jtCliente.getSelectedRow(), 0);
       this.c = this.cc.BuscarCliente(cl);
    }//GEN-LAST:event_jtClienteMouseClicked

    private void btnVerListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListadoActionPerformed
        CargarTabla();
    }//GEN-LAST:event_btnVerListadoActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        Long cl = (Long) modelo.getValueAt(jtCliente.getSelectedRow(), 0);
        System.out.println("Id Seleccionado: " + cl);
        this.c = this.cc.BuscarCliente(cl);
        if (c != null) {
            jd = new JdCRUDCliente(null, true);
            jd.setC(c);
            System.err.println("Cliente Para Modificar: " + c.toString());
            jd.CargarDatos(this.c);
            jd.setVisible(true);
        } else {
            System.out.println("Dio Nulo");
        }

    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        Long cl = (Long) modelo.getValueAt(jtCliente.getSelectedRow(), 0);
        this.c = this.cc.BuscarCliente(cl);
        this.cc.EliminarCliente(c);
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void LimpiarTabla() {
        try
        {
            this.modelo.setRowCount(0);
            jtCliente.setModel(this.modelo);
            jtCliente.repaint();
        }catch(Exception e)
        {        
        }       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnVerListado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtBuscarDoc;
    // End of variables declaration//GEN-END:variables
}
