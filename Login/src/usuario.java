
import java.awt.Color;
import java.awt.Frame;

public class usuario extends javax.swing.JFrame {

    int xmouse, ymouse;
  
    public usuario() {
        initComponents();
        initcomponents2();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        P_opciones = new javax.swing.JPanel();
        P_m = new javax.swing.JPanel();
        T_minimizar = new javax.swing.JLabel();
        P_C = new javax.swing.JPanel();
        T_cerrar = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        usericon = new javax.swing.JLabel();
        iniciarstxt = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txtcarne = new javax.swing.JLabel();
        carnet = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelprincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_opciones.setBackground(new java.awt.Color(255, 255, 255));
        P_opciones.setOpaque(false);
        P_opciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                P_opcionesMouseDragged(evt);
            }
        });
        P_opciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P_opcionesMousePressed(evt);
            }
        });
        P_opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_m.setBackground(new java.awt.Color(255, 255, 255));

        T_minimizar.setBackground(new java.awt.Color(255, 255, 255));
        T_minimizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        T_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_oscuro.png"))); // NOI18N
        T_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        T_minimizar.setOpaque(true);
        T_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_minimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout P_mLayout = new javax.swing.GroupLayout(P_m);
        P_m.setLayout(P_mLayout);
        P_mLayout.setHorizontalGroup(
            P_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_mLayout.setVerticalGroup(
            P_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(T_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P_opciones.add(P_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

        P_C.setBackground(new java.awt.Color(255, 255, 255));

        T_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        T_cerrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        T_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_cerrar.setText("X");
        T_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        T_cerrar.setOpaque(true);
        T_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout P_CLayout = new javax.swing.GroupLayout(P_C);
        P_C.setLayout(P_CLayout);
        P_CLayout.setHorizontalGroup(
            P_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_CLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_CLayout.setVerticalGroup(
            P_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_CLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        P_opciones.add(P_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 40));

        panelprincipal.add(P_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        panelprincipal.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 350, 20));

        Separator1.setForeground(new java.awt.Color(0, 39, 78));
        panelprincipal.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 340, 20));

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        panelprincipal.add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 310, 220));

        iniciarstxt.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        iniciarstxt.setForeground(new java.awt.Color(0, 12, 23));
        iniciarstxt.setText("BIENVENIDO");
        panelprincipal.add(iniciarstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 320, 40));

        txt1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 12, 23));
        txt1.setText(" INFORMACIÓN DE USUARIO");
        panelprincipal.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, 40));

        txtnombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(0, 12, 23));
        txtnombre.setText("NOMBRE:");
        panelprincipal.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, 30));

        txtapellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtapellido.setForeground(new java.awt.Color(0, 12, 23));
        txtapellido.setText("APELLIDO:");
        panelprincipal.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 80, 30));

        txtcarne.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtcarne.setForeground(new java.awt.Color(0, 12, 23));
        txtcarne.setText("CARNET:");
        panelprincipal.add(txtcarne, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 60, 30));

        carnet.setEditable(false);
        carnet.setBackground(new java.awt.Color(255, 255, 255));
        carnet.setBorder(null);
        panelprincipal.add(carnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 260, 30));

        nombre1.setEditable(false);
        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setBorder(null);
        panelprincipal.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 260, 30));

        apellido1.setEditable(false);
        apellido1.setBackground(new java.awt.Color(255, 255, 255));
        apellido1.setBorder(null);
        panelprincipal.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initcomponents2(){
        setLocationRelativeTo(null);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono1.jpg")));
        nombre1.setFont(new java.awt.Font("Roboto Light", 1, 14));
        apellido1.setFont(new java.awt.Font("Roboto Light", 1, 14));
        carnet.setFont(new java.awt.Font("Roboto Light", 1, 14));
        nombre1.setText("Damaris Julizza");
        apellido1.setText("Muralles Véliz");
        carnet.setText("202100953");
    }
    private void P_opcionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMousePressed

        xmouse =evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_P_opcionesMousePressed

    private void P_opcionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_opcionesMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x -xmouse, y - ymouse);
    }//GEN-LAST:event_P_opcionesMouseDragged

    private void T_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseExited
        T_cerrar.setBackground(Color.white);
        T_cerrar.setForeground(Color.black);
    }//GEN-LAST:event_T_cerrarMouseExited

    private void T_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseEntered
        T_cerrar.setBackground(Color.red);
        T_cerrar.setForeground(Color.white);
    }//GEN-LAST:event_T_cerrarMouseEntered

    private void T_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_T_cerrarMouseClicked

    private void T_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseExited
        T_minimizar.setBackground(Color.white);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_oscuro.png")));
    }//GEN-LAST:event_T_minimizarMouseExited

    private void T_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseEntered
        T_minimizar.setBackground(Color.orange);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconminimizar.png")));
    }//GEN-LAST:event_T_minimizarMouseEntered

    private void T_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_T_minimizarMouseClicked

   
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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField carnet;
    private javax.swing.JLabel iniciarstxt;
    private javax.swing.JTextField nombre1;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtcarne;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel usericon;
    // End of variables declaration//GEN-END:variables
}
