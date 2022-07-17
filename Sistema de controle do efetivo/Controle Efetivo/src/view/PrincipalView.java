/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Douglas
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemCadastrarFuncionário = new javax.swing.JMenuItem();
        jMenuItemFuncao = new javax.swing.JMenuItem();
        jMenuCurso = new javax.swing.JMenu();
        jMenuItemCurso = new javax.swing.JMenuItem();
        jMenuFerias = new javax.swing.JMenu();
        jMenuItemFerias = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNovoUsuário = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de Controle de Efetivo - SCE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal.png"))); // NOI18N

        jMenuFuncionario.setText("Funcionário");

        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionários");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemFuncionario);

        jMenuItemCadastrarFuncionário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar funcionario.png"))); // NOI18N
        jMenuItemCadastrarFuncionário.setText("Cadastrar funcionário");
        jMenuItemCadastrarFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarFuncionárioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemCadastrarFuncionário);

        jMenuItemFuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcao.png"))); // NOI18N
        jMenuItemFuncao.setText("Função");
        jMenuItemFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncaoActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItemFuncao);

        jMenuBar1.add(jMenuFuncionario);

        jMenuCurso.setText("Curso");

        jMenuItemCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curso.png"))); // NOI18N
        jMenuItemCurso.setText("Curso");
        jMenuItemCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursoActionPerformed(evt);
            }
        });
        jMenuCurso.add(jMenuItemCurso);

        jMenuBar1.add(jMenuCurso);

        jMenuFerias.setText("Férias");

        jMenuItemFerias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ferias.png"))); // NOI18N
        jMenuItemFerias.setText("Férias");
        jMenuItemFerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFeriasActionPerformed(evt);
            }
        });
        jMenuFerias.add(jMenuItemFerias);

        jMenuBar1.add(jMenuFerias);

        jMenu1.setText("Usuário");

        jMenuItemNovoUsuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        jMenuItemNovoUsuário.setText("Novo Usuário");
        jMenuItemNovoUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoUsuárioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNovoUsuário);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        //abrir novo jframe
        TabelaFuncionarioView formTabelaFuncionario;
        try {
            formTabelaFuncionario = new TabelaFuncionarioView();
            formTabelaFuncionario.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncaoActionPerformed
        //abrir novo jframe
        FuncaoView formFuncao;
        try {
            formFuncao = new FuncaoView();
            formFuncao.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemFuncaoActionPerformed

    private void jMenuItemCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursoActionPerformed
        //abrir novo jframe
        CursoView formCurso;
        try {
            formCurso = new CursoView();
            formCurso.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemCursoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        //abrir novo jframe
        LoginView formLogin = new LoginView();
        formLogin.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemFeriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFeriasActionPerformed
        //abrir novo jframe
        FeriasView formFerias = new FeriasView();
        formFerias.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemFeriasActionPerformed

    private void jMenuItemCadastrarFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarFuncionárioActionPerformed
        //abrir novo jframe
        FuncionarioView formFuncionario = new FuncionarioView(null);
        formFuncionario.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemCadastrarFuncionárioActionPerformed

    private void jMenuItemNovoUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoUsuárioActionPerformed
        //abrir novo jframe
        CadastrarUsuarioView formCadastroUsuario = new CadastrarUsuarioView();
        formCadastroUsuario.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jMenuItemNovoUsuárioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCurso;
    private javax.swing.JMenu jMenuFerias;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItemCadastrarFuncionário;
    private javax.swing.JMenuItem jMenuItemCurso;
    private javax.swing.JMenuItem jMenuItemFerias;
    private javax.swing.JMenuItem jMenuItemFuncao;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemNovoUsuário;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}