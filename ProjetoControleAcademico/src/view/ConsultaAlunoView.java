
package view;

import controller.AlunoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Aluno;
import tablemodel.AlunoTableModel;

/**
 *
 * @author Douglas
 */
public class ConsultaAlunoView extends javax.swing.JFrame {

    AlunoTableModel tableModel;
    AlunoController alunoController = new AlunoController();


    public ConsultaAlunoView() throws SQLException {
        initComponents();
        tableModel = new AlunoTableModel(alunoController.read());
        
        jTableAluno.setModel(tableModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Acadêmico - Consulta Alunos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jButtonImprimir.setText("Imprimir listagem");

        jLabel1.setText("Selecione o campo para busca:");

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "Matrícula", "Curso" }));
        jComboBoxBusca.setToolTipText("");
        jComboBoxBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscaActionPerformed(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableAluno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonImprimir)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonImprimir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        AlunoView alunosView = new AlunoView(null);
        alunosView.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
        
        tableModel = (AlunoTableModel) jTableAluno.getModel();
        Aluno aluno = tableModel.getAluno(jTableAluno.getSelectedRow());
        AlunoView alunoView = new AlunoView(aluno);
        alunoView.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jTableAlunoMouseClicked

    private void jComboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscaActionPerformed
        
        jTextFieldBusca.setText("");
        if(jComboBoxBusca.getSelectedIndex() == 0) {
            try {
                tableModel = new AlunoTableModel(alunoController.read());
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTableAluno.setModel(tableModel);
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
                    tableModel = new AlunoTableModel(alunoController.getListaAlunoPorNome(chave));
                    break;
                } catch (SQLException ex) {
                Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 2:
            {
                try {
                    tableModel = new AlunoTableModel(alunoController.getListaAlunoPorMatricula(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 3:
            {
                try {
                    tableModel = new AlunoTableModel(alunoController.getListaAlunoPorCurso(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

        }
        jTableAluno.setModel(tableModel);
        
    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PrincipalView principalView = new PrincipalView();
        principalView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ConsultaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConsultaAlunoView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JComboBox<String> jComboBoxBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldBusca;
    // End of variables declaration//GEN-END:variables
}
