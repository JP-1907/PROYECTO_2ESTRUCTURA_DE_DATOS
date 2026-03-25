
package proyecto.pkg2;

import javax.swing.*;     
import java.awt.*;       
import java.io.*;        


public class VentanaPrincipal extends javax.swing.JFrame {
    
   
    private  GestorImpresion gestor = new GestorImpresion();
    private JPanel lienzoArbol;

    public VentanaPrincipal() {
        initComponents(); 
        

        configurarLienzoArbol(); 
        this.setTitle("Interfaz Proyecto 2"); 
    

    configurarLienzoArbol();
    this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JToggleButton();
        btnImprimir = new javax.swing.JToggleButton();
        btnCargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        chkPrio = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtDoc = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(4, 8));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(2, 2));

        jLabel1.setText("Nombre del Documento:");

        btnEnviar.setText("Enviar Documento");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar CSV");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Usuario:");

        jLabel3.setText("Tamaño(pag):");

        chkPrio.setText("¿Es prioritario?");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setMaximumSize(new java.awt.Dimension(800, 400));
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(txtUser)
                    .addComponent(txtDoc)
                    .addComponent(txtSize)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(chkPrio)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(383, 383, 383))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(chkPrio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnCargar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {

                    String[] partes = linea.split(",");
                    if (partes.length >= 2) {
                        gestor.registrarUsuario(partes[0].trim(), partes[1].trim());
                    }
                }
                JOptionPane.showMessageDialog(this, "Usuarios cargados desde el archivo.");
                actualizarVista();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Documento doc = gestor.imprimirSiguiente();
        if (doc != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Imprimiendo: " + doc.getNombre());
            actualizarVista();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay documentos en cola.");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {

            String nombreDoc = txtDoc.getText();
            String nombreUser = txtUser.getText();
            int tamaño = Integer.parseInt(txtSize.getText());
            boolean esPrioritario = chkPrio.isSelected();

            if (!nombreDoc.isEmpty() && !nombreUser.isEmpty()) {

                gestor.agregarDocumento(nombreDoc, nombreUser, esPrioritario, tamaño);

                // Refrescar
                actualizarVista();

                // Limpiamos los txt
                txtDoc.setText("");
                txtUser.setText("");
                txtSize.setText("");
                chkPrio.setSelected(false);

            } else {
                JOptionPane.showMessageDialog(this, "Por favor llena todos los campos.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El tamaño debe ser un número válido.");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            } catch (ReflectiveOperationException | UnsupportedLookAndFeelException ex) {
                System.err.println("No se pudo cargar el Look and Feel: " + ex.getMessage());
                ex.printStackTrace(); // Opcional, para ver el detalle técnico
                }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JToggleButton btnEnviar;
    private javax.swing.JToggleButton btnImprimir;
    private javax.swing.JCheckBox chkPrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables


    private void configurarLienzoArbol() {
        lienzoArbol = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarArbolGrafico(g);
            }
        };
        
        lienzoArbol.setBackground(new Color(43, 45, 49)); 
        lienzoArbol.setPreferredSize(new Dimension(1030, 1030));
        
        
        jScrollPane1.setViewportView(lienzoArbol);
    }

    public void actualizarVista() {
        if (gestor == null || gestor.getCola() == null) return;

        
        StringBuilder sb = new StringBuilder("--- COLA DE IMPRESIÓN ---\n");
        Documento[] docs = gestor.getCola().getArreglo();
        int tam = gestor.getCola().getTamaño();

        for (int i = 0; i < tam; i++) {
            if (docs[i] != null) {
                sb.append(i + 1).append(". ").append(docs[i].getNombre())
                  .append(" [Prioridad: ").append(docs[i].getEtiquetaTiempo()).append("]\n");
            }
        }
        txtArea.setText(sb.toString());

       
        if (lienzoArbol != null) {
            lienzoArbol.revalidate();
            lienzoArbol.repaint();
        }
    }

    private void dibujarArbolGrafico(Graphics g) {
        if (gestor == null || gestor.getCola().getTamaño() == 0) return;
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        
        int xRaiz = lienzoArbol.getWidth() / 2;
        pintarNodo(g2, 0, xRaiz, 50, xRaiz / 2);
    }

    private void pintarNodo(Graphics2D g, int i, int x, int y, int esp) {
        if (i >= gestor.getCola().getTamaño()) return;

        int radio = 20;
        
        
        g.setColor(Color.WHITE);
        if (2 * i + 1 < gestor.getCola().getTamaño()) {
            g.drawLine(x, y, x - esp, y + 60);
            pintarNodo(g, 2 * i + 1, x - esp, y + 60, esp / 2);
        }
        if (2 * i + 2 < gestor.getCola().getTamaño()) {
            g.drawLine(x, y, x + esp, y + 60);
            pintarNodo(g, 2 * i + 2, x + esp, y + 60, esp / 2);
        }

        
        g.setColor(new Color(114, 137, 218)); 
        g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
        g.setColor(Color.WHITE);
        g.drawOval(x - radio, y - radio, radio * 2, radio * 2);

        
        String valor = String.valueOf(gestor.getCola().getArreglo()[i].getEtiquetaTiempo());
        FontMetrics fm = g.getFontMetrics();
        int textoX = x - (fm.stringWidth(valor) / 2);
        int textoY = y + (fm.getAscent() / 2) - 2;
        g.drawString(valor, textoX, textoY);
    }
}
