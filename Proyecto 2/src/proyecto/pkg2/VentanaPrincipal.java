package proyecto.pkg2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import java.util.logging.Logger; 

public class VentanaPrincipal extends javax.swing.JFrame {

    // Atributos 
    private GestorImpresion gestor = new GestorImpresion();
    private JPanel lienzoArbol;
    // Definición del logger que pide NetBeans
    private static final Logger logger = Logger.getLogger(VentanaPrincipal.class.getName());

    // --- 2. CONSTRUCTOR ---
    public VentanaPrincipal() {
        initComponents(); 
        
        this.setTitle("Interfaz Proyecto 2");
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        configurarLienzoArbol();
        
        if (txtArea != null) {
            txtArea.setText(">>> Sistema de Impresion Iniciado\n");
        }
    }

    //CONFIGURACION DEL LIENZO(Daniel)
    private void configurarLienzoArbol() {
        lienzoArbol = new JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                // Forzamos el renderizado
                Graphics2D g2 = (Graphics2D) g;
                if (gestor != null && gestor.getCola().getTamaño() > 0) {
                    dibujarArbolGrafico(g2);
                } else {
                    g2.setColor(Color.GRAY);
                    g2.drawString("Esperando documentos...", 20, 20);
                }
            }
        };
        
        // Colores y dimensiones para que se note
        lienzoArbol.setBackground(new Color(30, 30, 30));
        lienzoArbol.setPreferredSize(new Dimension(2000, 1000)); // Tamaño grande para que el scroll (nota de Daniel)
        lienzoArbol.setMinimumSize(new Dimension(2000, 1000));
        
        // CONEXIÓN CRÍTICA:
        scrollArbol.setViewportView(lienzoArbol); 
        scrollArbol.revalidate();
        scrollArbol.repaint();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chkPrio = new javax.swing.JCheckBox();
        btnEnviar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        txtDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        scrollArbol = new javax.swing.JScrollPane();
        scrollTexto = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chkPrio.setText("¿Es prioritario?");

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

        btnCargar.setText("Cargar CVS");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Documento:");

        jLabel2.setText("Nombre de Usuario:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel3.setText("Tamaño:");

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        scrollTexto.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(txtUser)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkPrio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEnviar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollArbol)
                    .addComponent(scrollTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkPrio)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(scrollArbol)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
                                         
    try {
        String nombreDoc = txtDoc.getText().trim();
        String nombreUser = txtUser.getText().trim();
        String tamStr = txtSize.getText().trim();
        boolean esVIP = chkPrio.isSelected();

        if (nombreDoc.isEmpty() || nombreUser.isEmpty() || tamStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Campos incompletos.");
            return;
        }

        int paginas = Integer.parseInt(tamStr);
        gestor.agregarDocumento(nombreDoc, nombreUser, esVIP, paginas);

        txtArea.append("Agregado: " + nombreDoc + " - Usuario: " + nombreUser + "\n");
        actualizarVista();

        txtDoc.setText("");
        txtUser.setText("");
        txtSize.setText("");
        chkPrio.setSelected(false);
        txtDoc.requestFocus();

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Tamaño debe ser numerico.");
    }

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
                                            
   Documento proximo = gestor.imprimirSiguiente();

    if (proximo != null) {
        txtArea.append("IMPRIMIENDO: " + proximo.getNombre() + " | Prioridad: " + proximo.getEtiquetaTiempo() + "\n");
        actualizarVista();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Cola vacia.");
    }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
                                       
  javax.swing.JFileChooser selector = new javax.swing.JFileChooser();
    int res = selector.showOpenDialog(this);

    if (res == javax.swing.JFileChooser.APPROVE_OPTION) {
        try (java.util.Scanner lector = new java.util.Scanner(selector.getSelectedFile())) {
            int cont = 0;
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split("[,;]");
                if (datos.length >= 3) {
                    gestor.agregarDocumento(datos[0].trim(), datos[1].trim(), false, Integer.parseInt(datos[2].trim()));
                    cont++;
                }
            }
            txtArea.append("Carga finalizada: " + cont + " documentos.\n");
            actualizarVista();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en archivo: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnCargarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
    public void actualizarVista() {
        if (lienzoArbol != null) {
            lienzoArbol.revalidate();
            lienzoArbol.repaint();
            scrollArbol.repaint();
        }
    }

    private void dibujarArbolGrafico(Graphics2D g) {
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int centroX = lienzoArbol.getWidth() / 2;
        pintarNodoRecursivo(g, 0, centroX, 60, centroX / 4);
    }

    private void pintarNodoRecursivo(Graphics2D g, int i, int x, int y, int esp) {
        int tam = gestor.getCola().getTamaño();
        if (i >= tam) return;

        int hIzq = 2 * i + 1;
        int hDer = 2 * i + 2;

        g.setColor(Color.WHITE);
        if (hIzq < tam) {
            g.drawLine(x, y, x - esp, y + 80);
            pintarNodoRecursivo(g, hIzq, x - esp, y + 80, esp / 2);
        }
        if (hDer < tam) {
            g.drawLine(x, y, x + esp, y + 80);
            pintarNodoRecursivo(g, hDer, x + esp, y + 80, esp / 2);
        }

        g.setColor(new Color(52, 152, 219));
        g.fillOval(x - 20, y - 20, 40, 40);
        g.setColor(Color.WHITE);
        g.drawOval(x - 20, y - 20, 40, 40);

        String txt = String.valueOf(gestor.getCola().getArreglo()[i].getEtiquetaTiempo());
        g.drawString(txt, x - 7, y + 5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JCheckBox chkPrio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollArbol;
    private javax.swing.JScrollPane scrollTexto;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}


