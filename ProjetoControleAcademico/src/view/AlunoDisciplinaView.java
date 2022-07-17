
package view;

import controller.AlunoDisciplinaController;
import controller.DisciplinaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplina;
import tablemodel.AlunoDisciplinaTableModel;
import view.ConsultaAlunoView;

/**
 *
 * @author Douglas
 */
public class AlunoDisciplinaView extends javax.swing.JFrame {

    public Aluno aluno;
    private boolean alterar = false;
    
    AlunoDisciplinaController alunoDisciplinaController = new AlunoDisciplinaController();
    AlunoDisciplinaTableModel tableModelAlunoDisciplina;
    
    public AlunoDisciplinaView() {
        initComponents();
    }
    
    private void getListaDisciplina() throws SQLException {
        DisciplinaController disciplinaController = new DisciplinaController();
        
        for (Disciplina d : disciplinaController.read()){
            jComboBoxDisciplina.addItem(d);
        }
    }
    
    private void getDisciplinaDoAluno() throws SQLException {
        tableModelAlunoDisciplina = new AlunoDisciplinaTableModel(
            alunoDisciplinaController.getDisciplinasPorAluno(this.aluno.getId())
        );
        
        jTableAlunoDisciplina.setModel(tableModelAlunoDisciplina);
        
        //redimencinando tamnho da largura da tabela
        jTableAlunoDisciplina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableAlunoDisciplina.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTableAlunoDisciplina.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableAlunoDisciplina.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTableAlunoDisciplina.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTableAlunoDisciplina.getColumnModel().getColumn(4).setPreferredWidth(45);
        jTableAlunoDisciplina.getColumnModel().getColumn(5).setPreferredWidth(45);
        jTableAlunoDisciplina.getColumnModel().getColumn(6).setPreferredWidth(40);
        jTableAlunoDisciplina.getColumnModel().getColumn(7).setPreferredWidth(40);
        
        limpaCampos();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSemestre = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAluno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDisciplina = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonPrimeiro = new javax.swing.JRadioButton();
        jRadioButtonSegundlo = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNotaUm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNotaDois = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMedia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFaltas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonIncluir = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunoDisciplina = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle Acadêmico - Cadastro de Disciplinas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Aluno:");

        jTextFieldAluno.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Disciplina:");

        jLabel3.setText("Ano:");

        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoKeyTyped(evt);
            }
        });

        jLabel4.setText("Semestre:");

        buttonGroupSemestre.add(jRadioButtonPrimeiro);
        jRadioButtonPrimeiro.setText("Primeiro");

        buttonGroupSemestre.add(jRadioButtonSegundlo);
        jRadioButtonSegundlo.setText("Segundo");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Notas e faltas"));
        jPanel2.setToolTipText("Notas e faltas");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setName("Notas e faltas"); // NOI18N

        jLabel5.setText("Nota 1:");

        jTextFieldNotaUm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNotaUmKeyTyped(evt);
            }
        });

        jLabel6.setText("Nota 2:");

        jTextFieldNotaDois.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNotaDoisFocusLost(evt);
            }
        });
        jTextFieldNotaDois.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNotaDoisKeyTyped(evt);
            }
        });

        jLabel7.setText("Média:");

        jTextFieldMedia.setEditable(false);

        jLabel8.setText("Faltas:");

        jTextFieldFaltas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFaltasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNotaUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNotaDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNotaUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNotaDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonSegundlo)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonPrimeiro))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonPrimeiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonSegundlo))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.png"))); // NOI18N
        jButtonImprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIncluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addGap(18, 18, 18)
                .addComponent(jButtonImprimir)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncluir)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableAlunoDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAlunoDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunoDisciplina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        if (alunoDisciplinaController.update(this.aluno,
                (Disciplina) jComboBoxDisciplina.getSelectedItem(),
                jRadioButtonPrimeiro.isSelected() ? 1 : 2,
                Integer.parseInt(jTextFieldAno.getText()),
                Double.parseDouble(jTextFieldNotaUm.getText()),
                Double.parseDouble(jTextFieldNotaDois.getText()),
                Integer.parseInt(jTextFieldFaltas.getText())
        )) {
            JOptionPane.showMessageDialog(this, "Alteração realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível realizar a alteração!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        try {
            this.getDisciplinaDoAluno();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed

        Disciplina disciplina = (Disciplina) jComboBoxDisciplina.getSelectedItem();
        
        try {
            alunoDisciplinaController.create(this.aluno,
                    disciplina,
                    jRadioButtonPrimeiro.isSelected() ? 1 : 2,
                    Integer.parseInt(jTextFieldAno.getText()),
                    Double.parseDouble(jTextFieldNotaUm.getText()),
                    Double.parseDouble(jTextFieldNotaDois.getText()),
                    Integer.parseInt(jTextFieldFaltas.getText())
                    );
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            this.getDisciplinaDoAluno();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao realizar cadastro!" + ex);
        }
        
        
        
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        Disciplina disciplina = (Disciplina) jComboBoxDisciplina.getSelectedItem();
        try {
            if (alunoDisciplinaController.delete(this.aluno.getId(), disciplina.getId())) {
                JOptionPane.showMessageDialog(this, "Exclusão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao realizar exclusão do cadastro!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        jButtonIncluir.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        alterar = false;
        limpaCampos();
       
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        try {
            ConsultaAlunoView formConsultaAlunos = new ConsultaAlunoView();
            formConsultaAlunos.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.getListaDisciplina();
            this.getDisciplinaDoAluno();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDisciplinaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTableAlunoDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoDisciplinaMouseClicked
        
        tableModelAlunoDisciplina = (AlunoDisciplinaTableModel) jTableAlunoDisciplina.getModel();
        AlunoDisciplina alunoDisciplina = tableModelAlunoDisciplina.getAlunoDisciplina(jTableAlunoDisciplina.getSelectedRow());
        
        jTextFieldAno.setText(String.valueOf(alunoDisciplina.getAno()));
        jTextFieldNotaUm.setText(String.valueOf(alunoDisciplina.getNota1()));
        jTextFieldNotaDois.setText(String.valueOf(alunoDisciplina.getNota2()));
        jTextFieldMedia.setText(String.valueOf((alunoDisciplina.getNota1() + alunoDisciplina.getNota2()) /2));
        jTextFieldFaltas.setText(String.valueOf(alunoDisciplina.getFaltas()));
        
        if (alunoDisciplina.getSemestre() == 1) {
            jRadioButtonPrimeiro.setSelected(true);
            jRadioButtonSegundlo.setSelected(false);
        } else if (alunoDisciplina.getSemestre() == 2) {
            jRadioButtonPrimeiro.setSelected(false);
            jRadioButtonSegundlo.setSelected(true);
        }
        
        for (int i = 0; i < jComboBoxDisciplina.getItemCount(); i++) {
            Disciplina d = (Disciplina) jComboBoxDisciplina.getItemAt(i);
            if (d.getNome().equals(alunoDisciplina.getDisciplina().getNome())) {
                jComboBoxDisciplina.setSelectedIndex(i);
            }
        }
        
        jComboBoxDisciplina.setEnabled(false);
        jButtonIncluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        this.alterar = true;
        
    }//GEN-LAST:event_jTableAlunoDisciplinaMouseClicked

    private void jTextFieldFaltasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFaltasKeyTyped
        if(alterar) {
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldFaltasKeyTyped

    private void jTextFieldAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoKeyTyped
        if(alterar) {
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldAnoKeyTyped

    private void jTextFieldNotaUmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNotaUmKeyTyped
        if(alterar) {
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldNotaUmKeyTyped

    private void jTextFieldNotaDoisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNotaDoisKeyTyped
        if(alterar) {
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(true);
        }
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTextFieldNotaDoisKeyTyped

    private void jTextFieldNotaDoisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNotaDoisFocusLost
        if (!jTextFieldNotaUm.equals("") && !jTextFieldNotaDois.equals("")) {
            double media =
                    (Double.parseDouble(jTextFieldNotaUm.getText()) + Double.parseDouble(jTextFieldNotaDois.getText())) /2;
            jTextFieldMedia.setText(String.valueOf(media));
        }
    }//GEN-LAST:event_jTextFieldNotaDoisFocusLost

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
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoDisciplinaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSemestre;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Object> jComboBoxDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonPrimeiro;
    private javax.swing.JRadioButton jRadioButtonSegundlo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunoDisciplina;
    public javax.swing.JTextField jTextFieldAluno;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldFaltas;
    private javax.swing.JTextField jTextFieldMedia;
    private javax.swing.JTextField jTextFieldNotaDois;
    private javax.swing.JTextField jTextFieldNotaUm;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        
        jTextFieldAno.setText("");
        jTextFieldFaltas.setText("");
        jTextFieldMedia.setText("");
        jTextFieldNotaUm.setText("");
        jTextFieldNotaDois.setText("");
        jRadioButtonPrimeiro.setSelected(false);
        jRadioButtonSegundlo.setSelected(false);
        jComboBoxDisciplina.setSelectedIndex(0);
        jTextFieldAno.requestFocus();
        
    }
}
