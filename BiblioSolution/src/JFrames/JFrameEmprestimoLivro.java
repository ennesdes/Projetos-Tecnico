
package JFrames;

// @author Douglas 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class JFrameEmprestimoLivro extends javax.swing.JFrame {

    private final MaskFormatter dataEmprestimo;
    private final MaskFormatter dataDevolucao;
    
    DefaultComboBoxModel<String> listaCadastroBiblioteca;
    DefaultListModel<String> listaLivros;

    public JFrameEmprestimoLivro() throws ParseException {
        dataEmprestimo = new MaskFormatter("##/##/####");
        dataDevolucao = new MaskFormatter("##/##/####");
        
        initComponents();        
    }

    public void lerDadosArquivos () {
        String nomeBiblioteca = (String) jComboBoxBiblioteca.getSelectedItem(); //transforma o item selecionado em string
        File arquivo = new File(nomeBiblioteca.trim() + ".txt"); //criar arquivo com o item selecionado do combobox
            
            if (arquivo.exists()) { //se o arquivo existe..
                
                listaLivros = new DefaultListModel<>();
                    try {             
                String livro = "";
                
                FileReader arqLe = new FileReader(arquivo);
                BufferedReader dados = new BufferedReader(arqLe);
                
                while ((livro = dados.readLine()) != null){
                    listaLivros.addElement(livro);
                }
                dados.close();
                arqLe.close();
                jListLivrosDisponiveis.setModel(listaLivros);
                } 
                    catch (IOException ex) {
             System.out.println("Erro ao ler este arquivo.");
        }
    } else {
                listaLivros = new DefaultListModel<>();
                jListLivrosDisponiveis.setModel(listaLivros);
            }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelMatAluno = new javax.swing.JLabel();
        jTextFieldMatriculaAluno = new javax.swing.JTextField();
        jLabelNomeAluno = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabelDatEmp = new javax.swing.JLabel();
        jFormattedTextFieldDataDevolução = new javax.swing.JFormattedTextField(dataDevolucao);
        jLabelDatDevolução = new javax.swing.JLabel();
        jFormattedTextFieldDataEmprestimo = new javax.swing.JFormattedTextField(dataEmprestimo);
        jLabelBiblioteca = new javax.swing.JLabel();
        jComboBoxBiblioteca = new javax.swing.JComboBox<>();
        jLabelLivrosDisp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLivrosDisponiveis = new javax.swing.JList<>();
        jButtonSelecionarLivro = new javax.swing.JButton();
        jButtonLimparSeleção = new javax.swing.JButton();
        jLabelLivroSelecionado = new javax.swing.JLabel();
        jTextFieldLivroSelecionado = new javax.swing.JTextField();
        jButtonSalvarEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTitulo.setText("Empréstimo de Livro");

        jLabelMatAluno.setText("Matrícula do aluno:");

        jLabelNomeAluno.setText("Nome do aluno:");

        jLabelDatEmp.setText("Data do empréstimo:");

        jLabelDatDevolução.setText("Data da devolução:");

        jLabelBiblioteca.setText("Biblioteca:");

        jComboBoxBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBibliotecaActionPerformed(evt);
            }
        });

        jLabelLivrosDisp.setText("Livros disponíveis:");

        jScrollPane1.setViewportView(jListLivrosDisponiveis);

        jButtonSelecionarLivro.setText("Selecionar Livro");
        jButtonSelecionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarLivroActionPerformed(evt);
            }
        });

        jButtonLimparSeleção.setText("Limpar Seleção");
        jButtonLimparSeleção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparSeleçãoActionPerformed(evt);
            }
        });

        jLabelLivroSelecionado.setText("Livro selecionado para o empréstimo:");

        jTextFieldLivroSelecionado.setEditable(false);
        jTextFieldLivroSelecionado.setToolTipText("");

        jButtonSalvarEmprestimo.setText("Salvar Empréstimo");
        jButtonSalvarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMatriculaAluno)
                            .addComponent(jTextFieldNomeAluno)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBiblioteca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBiblioteca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeAluno)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDatEmp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelDatDevolução)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldDataDevolução, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMatAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonSelecionarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(jButtonLimparSeleção, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelLivroSelecionado)
                                .addComponent(jTextFieldLivroSelecionado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSalvarEmprestimo)
                                .addGap(64, 64, 64)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelLivrosDisp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMatAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatEmp)
                    .addComponent(jFormattedTextFieldDataDevolução, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDatDevolução)
                    .addComponent(jFormattedTextFieldDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBiblioteca)
                    .addComponent(jComboBoxBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLivrosDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSelecionarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimparSeleção)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLivroSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLivroSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvarEmprestimo)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //abrir novo jframeSistema
        JFrameSistema formSistema = new JFrameSistema();
        formSistema.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        File arquivo = new File("BiblioSolution.txt"); //ler arquivo com o nome BiblioSolution
            
            if (arquivo.exists()) { //se o arquivo existe..
                
                listaCadastroBiblioteca = new DefaultComboBoxModel<>();
                    try {             
                String biblioteca = "";
                
                FileReader arqLe = new FileReader(arquivo);
                BufferedReader dados = new BufferedReader(arqLe);  
                biblioteca = dados.readLine(); 
                
                while (biblioteca != null){
                    listaCadastroBiblioteca.addElement(biblioteca);
                    biblioteca = dados.readLine(); 
                    }                
                dados.close();
                arqLe.close();
                jComboBoxBiblioteca.setModel(listaCadastroBiblioteca);
                } 
                    catch (IOException ex) {
             System.out.println("Erro ao ler este arquivo.");
        }
    } else {
                System.out.println("Não existe arquivo de bibiotecas");
            }
            
        this.lerDadosArquivos();
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBibliotecaActionPerformed
        this.lerDadosArquivos();
    }//GEN-LAST:event_jComboBoxBibliotecaActionPerformed

    private void jButtonSelecionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarLivroActionPerformed
       
        String selecionado = (String) jListLivrosDisponiveis.getSelectedValue();
        jTextFieldLivroSelecionado.setText(selecionado);
                
    }//GEN-LAST:event_jButtonSelecionarLivroActionPerformed

    private void jButtonLimparSeleçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparSeleçãoActionPerformed
        
        jTextFieldLivroSelecionado.setText("");
        
    }//GEN-LAST:event_jButtonLimparSeleçãoActionPerformed

    private void jButtonSalvarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEmprestimoActionPerformed
        
        if ( jTextFieldLivroSelecionado != null){ //se ter algo na lista..            
            String matricula = "";
            matricula = jTextFieldMatriculaAluno.getText();            
            try {                
                FileWriter arqGrava = new FileWriter(matricula.trim() + ".txt", true);
                PrintWriter dados = new PrintWriter(arqGrava);
                
                dados.println(
                "-----Registro de empréstimo de livro da BiblioSolution-----"
                + "\n" + "Matricula: " + jTextFieldMatriculaAluno.getText()
                + "\n" + "Nome: " + jTextFieldNomeAluno.getText()
                + "\n" + "Data do empréstimo: " + jFormattedTextFieldDataEmprestimo.getValue()
                + "\n" + "Data da devolução: " + jFormattedTextFieldDataDevolução.getValue()
                + "\n" + "Biblioteca: " + jComboBoxBiblioteca.getSelectedItem()
                + "\n" + "Nome do livro: " + jTextFieldLivroSelecionado.getText()
                + "\n"
                );
                               
                dados.close();
                arqGrava.close();
                JOptionPane.showMessageDialog(this, "Registro de empréstimo salvo com sucesso!");
                
                jTextFieldMatriculaAluno.setText("");
                jTextFieldNomeAluno.setText("");
                jFormattedTextFieldDataEmprestimo.setText("");
                jFormattedTextFieldDataDevolução.setText("");
                jTextFieldLivroSelecionado.setText("");

                jTextFieldMatriculaAluno.requestFocus();
                
            } catch (IOException ex) {
                System.out.println("Erro ao gravar arquivo.");
            }             
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um livro para salvar.");
        }        
    }//GEN-LAST:event_jButtonSalvarEmprestimoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameEmprestimoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmprestimoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmprestimoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmprestimoLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameEmprestimoLivro().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(JFrameEmprestimoLivro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimparSeleção;
    private javax.swing.JButton jButtonSalvarEmprestimo;
    private javax.swing.JButton jButtonSelecionarLivro;
    private javax.swing.JComboBox<String> jComboBoxBiblioteca;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataDevolução;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEmprestimo;
    private javax.swing.JLabel jLabelBiblioteca;
    private javax.swing.JLabel jLabelDatDevolução;
    private javax.swing.JLabel jLabelDatEmp;
    private javax.swing.JLabel jLabelLivroSelecionado;
    private javax.swing.JLabel jLabelLivrosDisp;
    private javax.swing.JLabel jLabelMatAluno;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListLivrosDisponiveis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldLivroSelecionado;
    private javax.swing.JTextField jTextFieldMatriculaAluno;
    private javax.swing.JTextField jTextFieldNomeAluno;
    // End of variables declaration//GEN-END:variables
}
