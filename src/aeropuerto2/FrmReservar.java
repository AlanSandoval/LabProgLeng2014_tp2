/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto2;

import aeropuerto2.Controlador.ControlAirport;
import aeropuerto2.Controlador.ControlCliente;
import aeropuerto2.Controlador.ControlTicket;
import aeropuerto2.Controlador.ControlVuelo;
import aeropuerto2.Modelo.Airport;
import aeropuerto2.Modelo.Cliente;
import aeropuerto2.Modelo.Ticket;
import aeropuerto2.Modelo.Vuelo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AlanSandoval
 */
public class FrmReservar extends javax.swing.JFrame {

    GestorEntidades ge;
    ControlCliente cc;
    ControlVuelo cv;
    ControlAirport ca;
    ControlTicket ct;
    Vuelo v = null;
    Cliente c= null;
    JdCliente jdCliente = null;
    DefaultTableModel modelo = new DefaultTableModel();

    public FrmReservar() {
        initComponents();
        this.cv = new ControlVuelo();
        this.ca = new ControlAirport();
        this.cc = new ControlCliente();
        this.ct = new ControlTicket();
       CargarComponents();
        modelo = (DefaultTableModel) jtReserva.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        cmbSalida = new javax.swing.JComboBox();
        cmbEntrada = new javax.swing.JComboBox();
        btnBuscarDestino = new javax.swing.JButton();
        lbNombreCompleto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReserva = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnReservar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos Obligatorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11))); // NOI18N

        btnIngresarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/user.png"))); // NOI18N
        btnIngresarCliente.setText("Buscar");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Cliente");

        jLabel2.setText("Origen");

        lblDestino.setText("Destino");

        cmbEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbEntradaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbEntradaMousePressed(evt);
            }
        });

        btnBuscarDestino.setText("Buscar");
        btnBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDestinoActionPerformed(evt);
            }
        });

        lbNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngresarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNombreCompleto))
                    .addComponent(cmbSalida, 0, 196, Short.MAX_VALUE)
                    .addComponent(cmbEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarDestino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnIngresarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombreCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(cmbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDestino))
                .addContainerGap())
        );

        jtReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Vuelo", "Origen Vuelo", "Destino Vuelo", "Precio Final"
            }
        ));
        jtReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtReservaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtReserva);

        btnReservar.setIcon(new javax.swing.ImageIcon("C:\\Users\\AlanSandoval\\Documents\\NetBeansProjects\\Aeropuerto2\\src\\Imagenes\\Icon\\page_save.png")); // NOI18N
        btnReservar.setText("GENERAR TICKET");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/add.png"))); // NOI18N
        jMenuItem1.setText("Agregar Aeropuerto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aeropuerto2/add.png"))); // NOI18N
        jMenuItem5.setText("Agregar Vuelo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AlanSandoval\\Documents\\NetBeansProjects\\Aeropuerto2\\src\\Imagenes\\Icon\\find.png")); // NOI18N
        jMenuItem2.setText("Ver Reservas");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AlanSandoval\\Documents\\NetBeansProjects\\Aeropuerto2\\src\\Imagenes\\Icon\\cancel.png")); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        jdCliente = new JdCliente(this, true);
        jdCliente.setVisible(true);
        this.c=jdCliente.getC();
        String nombreCompleto= jdCliente.getC().getDocumento()+" "+jdCliente.getC().getApellido()+" "+jdCliente.getC().getNombre();
        lbNombreCompleto.setText(nombreCompleto);
    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        Ticket ticket = new Ticket();
        ticket.setCliente(this.c);
        ticket.setVuelo(this.v);
        ct.AddTicket(ticket);
        
        List<Ticket>tickets= ct.ListarTickets();
        for(Ticket item:tickets)
        {
            System.out.println("Ticket Generado: "+item.getId()+item.getCliente().getDocumento()+item.getVuelo().getNombreVuelo());
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void cmbEntradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEntradaMousePressed

    }//GEN-LAST:event_cmbEntradaMousePressed

    private void cmbEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEntradaMouseClicked

    }//GEN-LAST:event_cmbEntradaMouseClicked

    private void cmbEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEntradaMouseEntered

    }//GEN-LAST:event_cmbEntradaMouseEntered

    private void btnBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDestinoActionPerformed
        this.cmbEntrada.setVisible(true);
        this.cmbSalida.setVisible(true);
        Airport origen = (Airport) cmbEntrada.getSelectedItem();
        Airport destino = (Airport) cmbSalida.getSelectedItem();
        List<Vuelo> vuelos = cv.BuscarVueloPorOrigen(origen.getId(), destino.getId());
        jtReserva.setModel(modelo);
        CargarTabla(vuelos, jdCliente.getC());

    }//GEN-LAST:event_btnBuscarDestinoActionPerformed

    private void jtReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtReservaMouseClicked
       Long cl = (Long) modelo.getValueAt(jtReserva.getSelectedRow(), 0);
       this.v= cv.BuscarVuelo(cl);
    }//GEN-LAST:event_jtReservaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JdCrearAeropuerto jdAero= new JdCrearAeropuerto(this, true);
        jdAero.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JdCrearVuelo jdVuelo= new JdCrearVuelo(this, true);
        jdVuelo.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CargarTabla(List<Vuelo> vuelos, Cliente c) {
        LimpiarTabla();
        for (Vuelo item : vuelos) {
            Object[] vuelo
                    = {
                        item.getId(),item.getNombreVuelo(), item.getArribo().getCiudad(), item.getSalida().getCiudad(), item.getPrecio()
                    };

            this.modelo.addRow(vuelo);
            this.jtReserva.setModel(modelo);
            jtReserva.repaint();

        }
    }

    private void LimpiarTabla() {
        this.modelo.setRowCount(0);
        jtReserva.setModel(this.modelo);
        jtReserva.repaint();
    }

    private void CargarComponents() {
        try {

            List<Airport> entradas = new ArrayList<Airport>();
            entradas = ca.ListarAirport();

            for (Airport item : entradas) {
                cmbEntrada.addItem(item);
                cmbSalida.addItem(item);
            }

            /*
            
             Airport a= new Airport();
             a.setCiudad("Capital Federeal");
             a.setCodigo("011");
             a.setProvincia("BUENOS AIRES"); 
             ca.AddAirport(a);
            
             Airport a1= new Airport();
             a1.setCiudad("Ushuaia");
             a1.setCodigo("9410");
             a1.setProvincia("Tierra del Fuego"); 
             ca.AddAirport(a1);
            
             Vuelo v = new Vuelo();
             v.setNombreVuelo("alSur");
             v.setPrecio(1212);               
             v.setArribo(a);
             v.setSalida(a1);            
             v.setTickets(new ArrayList());
             cv.AddVuelo(v);   
            
             Vuelo v1 = new Vuelo();
             v1.setNombreVuelo("alNorte");
             v1.setPrecio(1212);               
             v1.setArribo(a1);
             v1.setSalida(a);            
             v1.setTickets(new ArrayList());
             cv.AddVuelo(v1);   
             */
        } catch (Exception e) {
            System.out.println("Error al Guardar: " + e.getLocalizedMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDestino;
    private javax.swing.JButton btnIngresarCliente;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox cmbEntrada;
    private javax.swing.JComboBox cmbSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtReserva;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JLabel lblDestino;
    // End of variables declaration//GEN-END:variables
}
