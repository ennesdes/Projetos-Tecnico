
package JFrames;

// @author Douglas Ennes

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JFrameSistema extends javax.swing.JFrame {


    public JFrameSistema() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonBiblioteca = new javax.swing.JButton();
        jButtonLivros = new javax.swing.JButton();
        jButtonEmprestimo = new javax.swing.JButton();
        jLabelCadastros = new javax.swing.JLabel();
        jLabelEmpréstimo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTitulo.setText("Sistema BiblioSolution 2.1");

        jButtonBiblioteca.setText("Biblioteca");
        jButtonBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBibliotecaActionPerformed(evt);
            }
        });

        jButtonLivros.setText("Livros");
        jButtonLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLivrosActionPerformed(evt);
            }
        });

        jButtonEmprestimo.setText("Empréstimo");
        jButtonEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmprestimoActionPerformed(evt);
            }
        });

        jLabelCadastros.setText("Cadastros");

        jLabelEmpréstimo.setText("Empréstimo de livro");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/texto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCadastros)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBiblioteca)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLivros)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmpréstimo)
                                    .addComponent(jButtonEmprestimo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelTitulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCadastros)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBiblioteca)
                            .addComponent(jButtonLivros))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmpréstimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEmprestimo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBibliotecaActionPerformed
        
        //abrir novo jframeCadastroBiblioteca
        JFrameCadastrosBibliotecas formCadastroBiblioteca = new JFrameCadastrosBibliotecas();
        formCadastroBiblioteca.setVisible(true);
        //fechar frame atual tela do Sistema
        this.dispose();
        
    }//GEN-LAST:event_jButtonBibliotecaActionPerformed

    private void jButtonLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLivrosActionPerformed
        
        //abrir novo jframeCadastroLivros
        JFrameCadastrosLivros formCadastroLivros = new JFrameCadastrosLivros();
        formCadastroLivros.setVisible(true);
        //fechar frame atual tela do Sistema
        this.dispose();
        
    }//GEN-LAST:event_jButtonLivrosActionPerformed

    private void jButtonEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmprestimoActionPerformed
        
        //abrir novo jframeCadastroLivros
        JFrameEmprestimoLivro formEmprestimo = null;
        try {
            formEmprestimo = new JFrameEmprestimoLivro();
        } catch (ParseException ex) {
            Logger.getLogger(JFrameSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
        formEmprestimo.setVisible(true);
        //fechar frame atual tela do Sistema
        this.dispose();
        
    }//GEN-LAST:event_jButtonEmprestimoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        //abrir novo jframeLogin
        JFrameLogin formLogin = new JFrameLogin();
        formLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_formWindowClosing

    
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
            java.util.logging.Logger.getLogger(JFrameSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBiblioteca;
    private javax.swing.JButton jButtonEmprestimo;
    private javax.swing.JButton jButtonLivros;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCadastros;
    private javax.swing.JLabel jLabelEmpréstimo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
