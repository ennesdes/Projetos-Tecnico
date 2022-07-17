
package view;

import controller.DisciplinaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import model.bean.Disciplina;
import tablemodel.DisciplinaTableModel;

/**
 *
 * @author Douglas
 */
public class ConsultaDisciplinaView extends javax.swing.JFrame {

    DisciplinaTableModel tableModel;
    DisciplinaController disciplinaController = new DisciplinaController();

    public ConsultaDisciplinaView() throws SQLException {
        initComponents();
        
        tableModel = new DisciplinaTableModel(disciplinaController.read());
        
        jTableDisciplina.setModel(tableModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxBusca = new javax.swing.JComboBox<>();
        jTextFieldBusca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisciplina = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Acadêmico - Consulta Disciplina");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBoxBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "Código", "Carga Horária" }));
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

        jTableDisciplina.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDisciplina);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscaActionPerformed

        jTextFieldBusca.setText("");
        if(jComboBoxBusca.getSelectedIndex() == 0) {
            try {
                tableModel = new DisciplinaTableModel(disciplinaController.read());
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTableDisciplina.setModel(tableModel);
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
                    tableModel = new DisciplinaTableModel(disciplinaController.getListaDisciplinaPorNome(chave));
                    break;
                } catch (SQLException ex) {
                Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case 2:
            {
                try {
                    tableModel = new DisciplinaTableModel(disciplinaController.getListaDisciplinaPorCodigo(chave));
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case 3:
            {
                try {
                    tableModel = new DisciplinaTableModel(disciplinaController.getListaDisciplinaPorCargaHoraria(Integer.parseInt(chave)));
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaAlunoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

        }
        jTableDisciplina.setModel(tableModel);

    }//GEN-LAST:event_jTextFieldBuscaKeyTyped

    private void jTableDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDisciplinaMouseClicked

        tableModel = (DisciplinaTableModel) jTableDisciplina.getModel();
        Disciplina disciplina = tableModel.getDisciplina(jTableDisciplina.getSelectedRow());
        DisciplinaView disciplinaView = new DisciplinaView(disciplina);
        disciplinaView.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jTableDisciplinaMouseClicked

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed

        DisciplinaView disciplinaView = new DisciplinaView(null);
        disciplinaView.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ConsultaDisciplinaView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ConsultaDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTable jTableDisciplina;
    private javax.swing.JTextField jTextFieldBusca;
    // End of variables declaration//GEN-END:variables
}
