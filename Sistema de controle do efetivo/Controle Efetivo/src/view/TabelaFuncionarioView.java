
package view;

import controller.FuncaoController;
import controller.FuncionarioController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Funcao;
import model.bean.Funcionario;
import view.FuncionarioView;
import tablemodel.FuncionarioTableModel;

// @author Douglas

public class TabelaFuncionarioView extends javax.swing.JFrame {

    FuncionarioTableModel tableModel;
    FuncionarioController funcionarioController = new FuncionarioController();
    
    public TabelaFuncionarioView() throws SQLException {
        initComponents();
        
        tableModel = new FuncionarioTableModel(funcionarioController.read());
        jTableFuncionario.setModel(tableModel);
        
        //redimencinando tamnho da largura da tabela
        jTableFuncionario.setAutoResizeMode(jTableFuncionario.AUTO_RESIZE_OFF);
        jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(160); //nome
        jTableFuncionario.getColumnModel().getColumn(1).setPreferredWidth(120); //cpf
        jTableFuncionario.getColumnModel().getColumn(2).setPreferredWidth(120); //celular
        jTableFuncionario.getColumnModel().getColumn(3).setPreferredWidth(190); //email
        jTableFuncionario.getColumnModel().getColumn(4).setPreferredWidth(190); //endereço
        jTableFuncionario.getColumnModel().getColumn(5).setPreferredWidth(190); //função
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxBusca = new javax.swing.JComboBox<>();

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABELA FUNCIONÁRIO");

        jTableFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionario);

        jButtonAdicionar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar funcionario.png"))); // NOI18N
        jButtonAdicionar.setText("Novo Funcionário");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Buscar por:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "Função" }));
        jComboBoxBusca.setToolTipText("");
        jComboBoxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        //abrir novo jframe
        FuncionarioView formFuncionario = new FuncionarioView(null);
        formFuncionario.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //abrir novo jframe
        PrincipalView formPrincipal = new PrincipalView();
        formPrincipal.setVisible(true);
        //fechar frame atual
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        
        tableModel = (FuncionarioTableModel) jTableFuncionario.getModel();
        Funcionario funcionario = tableModel.getFuncionario(jTableFuncionario.getSelectedRow());
        FuncionarioView funcionarioView = new FuncionarioView(funcionario);
        
        
        funcionarioView.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    private void jComboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscaActionPerformed

        jTextFieldBusca.setText("");
        if(jComboBoxBusca.getSelectedIndex() == 0) {
            try {
                tableModel = new FuncionarioTableModel(funcionarioController.read());
            } catch (SQLException ex) {
                Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTableFuncionario.setModel(tableModel);
        }
        jTextFieldBusca.requestFocus();

    }//GEN-LAST:event_jComboBoxBuscaActionPerformed

    private void jTextFieldBuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyTyped
        
        String chave = jTextFieldBusca.getText();
        if(evt.getKeyChar() != '\b') { // serve para ir pesquisando a cada tecla
            chave = chave + evt.getKeyChar();
        }
        switch (jComboBoxBusca.getSelectedIndex()) {
            case 1:
            {
                try {
                    tableModel = new FuncionarioTableModel(funcionarioController.getListaFuncionarioPorNome(chave));
                    break;
                } catch (SQLException ex) {
                Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 2:
            {
                try {
                    tableModel = new FuncionarioTableModel(funcionarioController.getListaFuncionarioPorFuncao(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
        }
        jTableFuncionario.setModel(tableModel);
        
        //redimencinando tamnho da largura da tabela
        jTableFuncionario.setAutoResizeMode(jTableFuncionario.AUTO_RESIZE_OFF);
        jTableFuncionario.getColumnModel().getColumn(0).setPreferredWidth(160); //nome
        jTableFuncionario.getColumnModel().getColumn(1).setPreferredWidth(120); //cpf
        jTableFuncionario.getColumnModel().getColumn(2).setPreferredWidth(120); //celular
        jTableFuncionario.getColumnModel().getColumn(3).setPreferredWidth(190); //email
        jTableFuncionario.getColumnModel().getColumn(4).setPreferredWidth(190); //endereço
        jTableFuncionario.getColumnModel().getColumn(5).setPreferredWidth(190); //função
        
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

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
            java.util.logging.Logger.getLogger(TabelaFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TabelaFuncionarioView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TabelaFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldBusca;
    // End of variables declaration//GEN-END:variables
}
