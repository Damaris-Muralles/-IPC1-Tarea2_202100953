
import java.awt.Color;
import java.awt.Frame;

public class Login extends javax.swing.JFrame {

    int xmouse, ymouse;
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono1.jpg")));
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
        iniciarstxt = new javax.swing.JLabel();
        usuriotxt = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        contrasenatxt = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        ingresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        Cancel = new javax.swing.JPanel();
        txtcancelar = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_mLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_minimizar))
        );
        P_mLayout.setVerticalGroup(
            P_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_mLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(T_minimizar))
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

        iniciarstxt.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarstxt.setForeground(new java.awt.Color(0, 12, 23));
        iniciarstxt.setText("INICIAR SESIÓN");
        panelprincipal.add(iniciarstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 210, 40));

        usuriotxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        usuriotxt.setForeground(new java.awt.Color(0, 12, 23));
        usuriotxt.setText("USUARIO");
        panelprincipal.add(usuriotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 210, 40));

        username.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setText("Ingrese su nombre de usuario");
        username.setBorder(null);
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameMousePressed(evt);
            }
        });
        panelprincipal.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 460, 30));

        contrasenatxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenatxt.setForeground(new java.awt.Color(0, 12, 23));
        contrasenatxt.setText("CONTRASEÑA");
        panelprincipal.add(contrasenatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 250, 40));

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("**********");
        password.setBorder(null);
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        panelprincipal.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 460, 30));

        Separator2.setForeground(new java.awt.Color(0, 39, 78));
        panelprincipal.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 460, 20));

        Separator1.setForeground(new java.awt.Color(0, 39, 78));
        panelprincipal.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 460, 20));

        ingresar.setBackground(new java.awt.Color(2, 104, 111));

        txtingresar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 249, 248));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setText("INGRESAR");
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtingresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ingresarLayout = new javax.swing.GroupLayout(ingresar);
        ingresar.setLayout(ingresarLayout);
        ingresarLayout.setHorizontalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ingresarLayout.setVerticalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelprincipal.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 130, 40));

        Cancel.setBackground(new java.awt.Color(2, 104, 111));

        txtcancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtcancelar.setForeground(new java.awt.Color(255, 249, 248));
        txtcancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcancelar.setText("CANCELAR");
        txtcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CancelLayout = new javax.swing.GroupLayout(Cancel);
        Cancel.setLayout(CancelLayout);
        CancelLayout.setHorizontalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CancelLayout.setVerticalGroup(
            CancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelprincipal.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 130, 40));

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        panelprincipal.add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 310));

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

    private void T_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseEntered
        T_minimizar.setBackground(Color.orange);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconminimizar.png")));
    }//GEN-LAST:event_T_minimizarMouseEntered

    private void T_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_T_minimizarMouseClicked

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
       if(username.getText().equals("Damaris Julizza") && String.valueOf(password.getPassword()).equals("202100953")){
         usuario obj = new usuario();  
         obj.setVisible(true);
         dispose();
        }else{
          if(username.getText().equals("Ingrese su nombre de usuario") || String.valueOf(password.getPassword()).equals("**********")){
            javax.swing.JOptionPane.showMessageDialog(this,"Las casillas para usuario o contraseña estan vacias","Login",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this,"EL usuario o contraseña es incorrecto","Login",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } 
       }
        
        
       
    }//GEN-LAST:event_txtingresarMouseClicked

    private void txtcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcancelarMouseClicked
        password.setForeground(Color.gray);
        password.setText("**********");
        username.setForeground(Color.gray);
        username.setText("Ingrese su nombre de usuario");
       
    }//GEN-LAST:event_txtcancelarMouseClicked

    private void usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMousePressed
        if (username.getText().equals("Ingrese su nombre de usuario")){
            username.setText("");   
            username.setForeground(Color.black);
        }
        if(String.valueOf(password.getPassword()).isEmpty()){
          password.setText("**********");
          password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_usernameMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        if(String.valueOf(password.getPassword()).equals("**********")){
            password.setText("");
            password.setForeground(Color.black);
        }
        if (username.getText().isEmpty()){
            username.setText("Ingrese su nombre de usuario");
            username.setForeground(Color.gray);
        }
       
    }//GEN-LAST:event_passwordMousePressed

    private void T_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minimizarMouseExited
        T_minimizar.setBackground(Color.white);
        T_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_oscuro.png")));
    }//GEN-LAST:event_T_minimizarMouseExited

   
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cancel;
    private javax.swing.JPanel P_C;
    private javax.swing.JPanel P_m;
    private javax.swing.JPanel P_opciones;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_minimizar;
    private javax.swing.JLabel contrasenatxt;
    private javax.swing.JPanel ingresar;
    private javax.swing.JLabel iniciarstxt;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel txtcancelar;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JLabel usericon;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usuriotxt;
    // End of variables declaration//GEN-END:variables

}
