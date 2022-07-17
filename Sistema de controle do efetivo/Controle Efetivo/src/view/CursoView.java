
package view;

import controller.CursoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.bean.Curso;
import tablemodel.CursoTableModel;

/**
 *
 * @author Douglas
 */
public class CursoView extends javax.swing.JFrame {
    
    private int idCurso = 0;
    public boolean alterar = false;
    CursoController cursoController = new CursoController();
    CursoTableModel tableModelCurso;
    
    
    public CursoView() throws SQLException {
        initComponents();
    }
    
    private void getListaCurso() throws SQLException {
        tableModelCurso = new CursoTableModel(cursoController.read());
        jTableCurso.setModel(tableModelCurso);
        
        //redimencinando tamnho da largura da tabela
        jTableCurso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableCurso.getColumnModel().getColumn(0).setPreferredWidth(150); //funcionario
        jTableCurso.getColumnModel().getColumn(1).setPreferredWidth(150); //local
        jTableCurso.getColumnModel().getColumn(2).setPreferredWidth(150); //periodo
        jTableCurso.getColumnModel().getColumn(3).setPreferredWidth(150); //situação
    }
    
    private void limpaCampos() {
        jTextFieldNome.setText("");
        jTextFieldLocal.setText("");
        jFormattedTextFieldPeriodo.setText("");
        jTextFieldSituacao.setText("");
        jTextFieldNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurso = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBusca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jFormattedTextFieldPeriodo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Buscar por:");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jButtonAdicionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Período:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Local:");

        jTextFieldSituacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSituacaoKeyTyped(evt);
            }
        });

        jTableCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCurso);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Situação:");

        jButtonAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonRemover.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.setEnabled(false);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CURSO");

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Nome:");

        jTextFieldLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLocalKeyTyped(evt);
            }
        });

        try {
            jFormattedTextFieldPeriodo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### a ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldPeriodoKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curso.png"))); // NOI18N

        jComboBoxBusca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "Local", "Situação" }));
        jComboBoxBusca.setToolTipText("");
        jComboBoxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscaActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldBusca))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addGap(8, 8, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jFormattedTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRemover)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        
        try {
            if(!jTextFieldNome.getText().equals("") 
                   && !jTextFieldLocal.getText().equals("")
                   && !jFormattedTextFieldPeriodo.getText().equals("") 
                   && !jTextFieldSituacao.getText().equals("")){
            if (cursoController.update( idCurso,
                    jTextFieldNome.getText(),
                    jTextFieldLocal.getText(),
                    jFormattedTextFieldPeriodo.getText(),
                    jTextFieldSituacao.getText()
            )){
                JOptionPane.showMessageDialog(this, "Curso atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível atualizar!", "erro", JOptionPane.ERROR_MESSAGE);
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.getListaCurso();
            this.limpaCampos();
            this.alterar = false;
            jButtonAdicionar.setEnabled(true);
            jButtonAtualizar.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        try {
            if(cursoController.delete(idCurso)){
                JOptionPane.showMessageDialog(this, "Curso excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir!", "erro", JOptionPane.ERROR_MESSAGE);
            }
            this.getListaCurso();
            this.limpaCampos();
            this.alterar = false;
            jButtonAdicionar.setEnabled(true);
            jButtonAtualizar.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //abrir novo jframe
        PrincipalView formPrincipal = new PrincipalView();
        formPrincipal.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        try {
           if(!jTextFieldNome.getText().equals("") 
                   && !jTextFieldLocal.getText().equals("")
                   && !jFormattedTextFieldPeriodo.getText().equals("") 
                   && !jTextFieldSituacao.getText().equals("")){
            if(cursoController.create(jTextFieldNome.getText(),
                    jTextFieldLocal.getText(),
                    jFormattedTextFieldPeriodo.getText(),
                    jTextFieldSituacao.getText()
                    )) {
                JOptionPane.showMessageDialog(this, "Curso salvo com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível salvar o Curso", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
            this.getListaCurso();
            this.limpaCampos();
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {
            this.getListaCurso();
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscaActionPerformed

        jTextFieldBusca.setText("");
        if(jComboBoxBusca.getSelectedIndex() == 0) {
            try {
                tableModelCurso = new CursoTableModel(cursoController.read());
            } catch (SQLException ex) {
                Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTableCurso.setModel(tableModelCurso);
        }
        jTextFieldBusca.requestFocus();
    }//GEN-LAST:event_jComboBoxBuscaActionPerformed

    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        String chave = jTextFieldBusca.getText();
        if(chave.equals("")) { // se não tiver texto no campo
            chave = String.valueOf(evt.getKeyChar());
        } else  { // serve para ir pesquisando a cada tecla
            chave = chave + evt.getKeyChar();
        }
        switch (jComboBoxBusca.getSelectedIndex()) {
            case 1:
            {
                try {
                    tableModelCurso = new CursoTableModel(cursoController.getListaCursoPorNome(chave));
                    break;
                } catch (SQLException ex) {
                Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 2:
            {
                try {
                    tableModelCurso = new CursoTableModel(cursoController.getListaCursoPorLocal(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 3:
            {
                try {
                    tableModelCurso = new CursoTableModel(cursoController.getListaCursoPorSituacao(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

        }
        jTableCurso.setModel(tableModelCurso);
        
        jTableCurso.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableCurso.getColumnModel().getColumn(0).setPreferredWidth(150); //funcionario
        jTableCurso.getColumnModel().getColumn(1).setPreferredWidth(150); //local
        jTableCurso.getColumnModel().getColumn(2).setPreferredWidth(150); //periodo
        jTableCurso.getColumnModel().getColumn(3).setPreferredWidth(150); //situação
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void jTableCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCursoMouseClicked
        
        tableModelCurso = (CursoTableModel) jTableCurso.getModel();
        Curso curso = tableModelCurso.getCurso(jTableCurso.getSelectedRow());
        this.idCurso = curso.getIdCurso();
        jTextFieldNome.setText(curso.getNome());
        jTextFieldLocal.setText(curso.getLocal());
        jFormattedTextFieldPeriodo.setText(curso.getPeriodo());
        jTextFieldSituacao.setText(curso.getSituacao());
        
        jButtonAdicionar.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        this.alterar = true;
        
    }//GEN-LAST:event_jTableCursoMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.limpaCampos();
        jButtonAdicionar.setEnabled(true);
        jButtonAtualizar.setEnabled(false);
        jButtonRemover.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        this.alterar = false;
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jTextFieldLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldLocalKeyTyped

    private void jFormattedTextFieldPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPeriodoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jFormattedTextFieldPeriodoKeyTyped

    private void jTextFieldSituacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSituacaoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldSituacaoKeyTyped

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
            java.util.logging.Logger.getLogger(CursoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CursoView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    public javax.swing.JFormattedTextField jFormattedTextFieldPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCurso;
    private javax.swing.JTextField jTextFieldBusca;
    public javax.swing.JTextField jTextFieldLocal;
    public javax.swing.JTextField jTextFieldNome;
    public javax.swing.JTextField jTextFieldSituacao;
    // End of variables declaration//GEN-END:variables
}
