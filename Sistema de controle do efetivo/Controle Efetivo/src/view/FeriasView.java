
package view;

import controller.FeriasController;
import controller.FuncionarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.bean.Ferias;
import model.bean.Funcionario;
import regex.ValidaCampos;
import tablemodel.FeriasTableModel;

// @author Douglas

public class FeriasView extends javax.swing.JFrame {
    
    private int idFerias = 0;
    private boolean alterar = false;
    FeriasController feriasController = new FeriasController();
    FeriasTableModel tableModelFerias;

    public FeriasView() {
        initComponents();
    }
    
    public void getListaFerias() throws SQLException {
        tableModelFerias = new FeriasTableModel(feriasController.read(jComboBoxFuncionario.getSelectedItem().toString()));
        jTableFerias.setModel(tableModelFerias);
        
        //redimencinando tamnho da largura da tabela
        jTableFerias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableFerias.getColumnModel().getColumn(0).setPreferredWidth(135); //nome
        jTableFerias.getColumnModel().getColumn(1).setPreferredWidth(120); //tipo
        jTableFerias.getColumnModel().getColumn(2).setPreferredWidth(170); //aquisitivo
        jTableFerias.getColumnModel().getColumn(3).setPreferredWidth(170); //período
        jTableFerias.getColumnModel().getColumn(4).setPreferredWidth(135); //situação
    }
    
    public void getListaFuncionario () throws SQLException {
        
        FuncionarioController funcionarioController = new FuncionarioController();
        
        for (Funcionario f : funcionarioController.read()){
            jComboBoxFuncionario.addItem(f);
        }
        
    }
    
    public void limpaCampos(){
        jTextFieldTipo.setText("");
        jFormattedTextFieldAquisitivo.setText("");
        jFormattedTextFieldPeriodo.setText("");
        jTextFieldSituacao.setText("");
        jTextFieldTipo.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextFieldSituacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxFuncionario = new javax.swing.JComboBox<>();
        jFormattedTextFieldAquisitivo = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPeriodo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelFerias = new javax.swing.JPanel();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFerias = new javax.swing.JTable();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Período:");

        jTextFieldSituacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSituacaoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Situação");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FÉRIAS");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Tipo:");

        jTextFieldTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTipoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Aquisitivo:");

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

        jButtonAdicionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Funcionário:");

        jComboBoxFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncionarioActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldAquisitivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### a ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldAquisitivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldAquisitivoKeyTyped(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ferias.png"))); // NOI18N

        jPanelFerias.setBorder(javax.swing.BorderFactory.createTitledBorder("FÉRIAS DO EFETIVO"));

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Tipo", "Situação" }));

        jTextFieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscaActionPerformed(evt);
            }
        });
        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
        });

        jTableFerias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableFerias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableFerias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFeriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFerias);

        javax.swing.GroupLayout jPanelFeriasLayout = new javax.swing.GroupLayout(jPanelFerias);
        jPanelFerias.setLayout(jPanelFeriasLayout);
        jPanelFeriasLayout.setHorizontalGroup(
            jPanelFeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelFeriasLayout.createSequentialGroup()
                        .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBusca)))
                .addContainerGap())
        );
        jPanelFeriasLayout.setVerticalGroup(
            jPanelFeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFeriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                    .addComponent(jPanelFerias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 183, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldAquisitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAdicionar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAtualizar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonRemover)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(211, 211, 211)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextFieldAquisitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonCancelar))
                .addGap(18, 18, 18)
                .addComponent(jPanelFerias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
       
        Funcionario funcionario = (Funcionario) jComboBoxFuncionario.getSelectedItem();
        if(validaCamposAlunos()){
            if (feriasController.update( idFerias,
                    jTextFieldTipo.getText(),
                    jFormattedTextFieldAquisitivo.getText(),
                    jFormattedTextFieldPeriodo.getText(),
                    jTextFieldSituacao.getText(),
                    funcionario
            )){
                JOptionPane.showMessageDialog(this, "Curso atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível atualizar!", "erro", JOptionPane.ERROR_MESSAGE);
            }
            try {
                this.getListaFerias();
                this.limpaCampos();
                this.alterar = false;
                jButtonAdicionar.setEnabled(true);
                jButtonAtualizar.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(FeriasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        try {
            if(feriasController.delete(idFerias)){
                JOptionPane.showMessageDialog(this, "Férias excluídas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir!", "erro", JOptionPane.ERROR_MESSAGE);
            }
            this.getListaFerias();
            this.limpaCampos();
            this.alterar = false;
            jButtonAdicionar.setEnabled(true);
            jButtonAtualizar.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(CursoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        try {
            if(validaCamposAlunos()){
                if(jComboBoxFuncionario.getSelectedItem() != null){

                    Funcionario funcionario = (Funcionario) jComboBoxFuncionario.getSelectedItem();

                    //chama metodo create da classe controller
                    if(feriasController.create(

                        jTextFieldTipo.getText(),
                        jFormattedTextFieldAquisitivo.getText(),
                        jFormattedTextFieldPeriodo.getText(),
                        jTextFieldSituacao.getText(),
                        funcionario)) {

                        JOptionPane.showMessageDialog(this, "Férias adicionada com sucesso!");

                        this.limpaCampos();
                        this.getListaFerias();
                    }else {
                        JOptionPane.showMessageDialog(this, "Não foi possivel salvar fárias!");
                    }                
                } else {
                        JOptionPane.showMessageDialog(this, "Preencha todos os campos para adicionar férias!");
                    } 
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.getListaFuncionario();
            this.getListaFerias();
        } catch (SQLException ex) {
            Logger.getLogger(FeriasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         //abrir novo jframe
        PrincipalView formPrincipal = new PrincipalView();
        formPrincipal.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTableFeriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFeriasMouseClicked
        
        tableModelFerias = (FeriasTableModel) jTableFerias.getModel();
        Ferias ferias = tableModelFerias.getFerias(jTableFerias.getSelectedRow());
        this.idFerias = ferias.getIdferias();
        jTextFieldTipo.setText(ferias.getTipo());
        jFormattedTextFieldAquisitivo.setText(ferias.getAquisitivo());
        jFormattedTextFieldPeriodo.setText(ferias.getPeriodo());
        jTextFieldSituacao.setText(ferias.getSituacao());
        
        jButtonAdicionar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonRemover.setEnabled(true);
        this.alterar = true;
        
    }//GEN-LAST:event_jTableFeriasMouseClicked

    private void jComboBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioActionPerformed
        try {
            this.getListaFerias();
        } catch (SQLException ex) {
            Logger.getLogger(FeriasView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxFuncionarioActionPerformed

    private void jTextFieldSituacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSituacaoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldSituacaoKeyTyped

    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        String chave = jTextFieldBusca.getText();
        if(evt.getKeyChar() != '\b') { // serve para ir pesquisando a cada tecla
            chave = chave + evt.getKeyChar();
        }
        
        switch (jComboBoxBusca.getSelectedIndex()) {
            case 1:
            {
                try {
                    tableModelFerias = new FeriasTableModel(feriasController.getListaFeriasPorTipo(jComboBoxFuncionario.getSelectedItem().toString(), chave));
                    break;
                } catch (SQLException ex) {
                Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 2:
            {
                try {
                    tableModelFerias = new FeriasTableModel(feriasController.getListaFeriasSituacao(jComboBoxFuncionario.getSelectedItem().toString(), chave));
                } catch (SQLException ex) {
                    Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
        }
        jTableFerias.setModel(tableModelFerias);
        
        //redimencinando tamnho da largura da tabela
        jTableFerias.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableFerias.getColumnModel().getColumn(0).setPreferredWidth(135); //nome
        jTableFerias.getColumnModel().getColumn(1).setPreferredWidth(120); //tipo
        jTableFerias.getColumnModel().getColumn(2).setPreferredWidth(170); //aquisitivo
        jTableFerias.getColumnModel().getColumn(3).setPreferredWidth(170); //período
        jTableFerias.getColumnModel().getColumn(4).setPreferredWidth(135); //situação
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void jTextFieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaActionPerformed

    private void jTextFieldTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldTipoKeyTyped

    private void jFormattedTextFieldAquisitivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldAquisitivoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jFormattedTextFieldAquisitivoKeyTyped

    private void jFormattedTextFieldPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPeriodoKeyTyped
        if(alterar) {
            jButtonRemover.setEnabled(false);
            jButtonAtualizar.setEnabled(true);
        }
    }//GEN-LAST:event_jFormattedTextFieldPeriodoKeyTyped

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jButtonAdicionar.setEnabled(true);
        jButtonRemover.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        alterar = false;
        limpaCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FeriasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeriasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeriasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeriasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeriasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JComboBox<Object> jComboBoxFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldAquisitivo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFerias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFerias;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldSituacao;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables

private boolean validaCamposAlunos() {
        
        if(!ValidaCampos.validaTipo(jTextFieldTipo.getText())){
            JOptionPane.showMessageDialog(null, "Tipo inválido!\n Ex: Parcela 2",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        } if(!ValidaCampos.validaPeriodo(jFormattedTextFieldAquisitivo.getText())){
            JOptionPane.showMessageDialog(null, "Período aquisitivo inválido!\n Ex: 01/08/2019 a 01/08/2021",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        } if(!ValidaCampos.validaPeriodo(jFormattedTextFieldPeriodo.getText())){
            JOptionPane.showMessageDialog(null, "Período inválido!\n Ex: 10/12/2021 a 30/12/2021",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        } if(!ValidaCampos.validaSituacao(jTextFieldSituacao.getText())){
            JOptionPane.showMessageDialog(null, "Situação inválida!\n Ex: Andamento",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
