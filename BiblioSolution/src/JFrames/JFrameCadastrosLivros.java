/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/* @author Douglas Ennes */
public class JFrameCadastrosLivros extends javax.swing.JFrame {

    DefaultListModel<String> listaLivros;
    DefaultComboBoxModel<String> listaCadastroBiblioteca;
   
    public JFrameCadastrosLivros() {
        initComponents();
        
        listaLivros = new DefaultListModel<>();
        jListLivrosCadastrados.setModel(listaLivros);
        
        listaCadastroBiblioteca = new DefaultComboBoxModel<>();
        jComboBoxBiblioteca.setModel(listaCadastroBiblioteca); 
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
                jListLivrosCadastrados.setModel(listaLivros);
                } 
                    catch (IOException ex) {
             System.out.println("Erro ao ler este arquivo.");
        }
    } else {
                listaLivros = new DefaultListModel<>();
                jListLivrosCadastrados.setModel(listaLivros);
            }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelbiblioteca = new javax.swing.JLabel();
        jComboBoxBiblioteca = new javax.swing.JComboBox<>();
        jLabelNomeLivro = new javax.swing.JLabel();
        jTextFieldNomeLivro = new javax.swing.JTextField();
        jLabelLivroCadastrados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLivrosCadastrados = new javax.swing.JList<>();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();

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
        jLabelTitulo.setText("Cadastro de Livros");

        jLabelbiblioteca.setText("Biblioteca:");

        jComboBoxBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBibliotecaActionPerformed(evt);
            }
        });

        jLabelNomeLivro.setText("Nome do livro:");

        jLabelLivroCadastrados.setText("Livros cadastrados:");

        jScrollPane1.setViewportView(jListLivrosCadastrados);

        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/adicionar.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/remover.png"))); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeLivro)
                            .addComponent(jLabelbiblioteca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxBiblioteca, 0, 280, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeLivro)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLivroCadastrados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelbiblioteca)
                    .addComponent(jComboBoxBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeLivro)
                    .addComponent(jTextFieldNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelLivroCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addComponent(jScrollPane1))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if( ! jTextFieldNomeLivro.getText().equals("")){ //se estiver diferente de vazio..
            
            listaLivros.addElement(jTextFieldNomeLivro.getText());//adiciona livro na lista
            jListLivrosCadastrados.setModel(listaLivros);
            jTextFieldNomeLivro.setText("");//limpa o campo de texto para livro
            jTextFieldNomeLivro.requestFocus();//retorna o cursor para o campo de preencher livro
                        
        } else {
            JOptionPane.showMessageDialog(this, "Digite o nome do Livro.");
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        if (jListLivrosCadastrados.getSelectedValue() != null) { //se ter algo selecionado..
        
        listaLivros.remove(jListLivrosCadastrados.getSelectedIndex()); //remove item selecionado
        jListLivrosCadastrados.setModel(listaLivros); //atualiza lista
        
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um livro para remover.");
        }
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        listaLivros.removeAllElements(); //remove todos os elementos da lista
        jListLivrosCadastrados.setModel(listaLivros);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

        //abrir novo jframeSistema
        JFrameSistema formSistema = new JFrameSistema();
        formSistema.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBibliotecaActionPerformed
        this.lerDadosArquivos();
    }//GEN-LAST:event_jComboBoxBibliotecaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        if ( listaLivros.size() > 0){ //se ter algo na lista..
            
            String nomeBiblioteca = (String) jComboBoxBiblioteca.getSelectedItem();
            
            try {
                
                FileWriter arqGrava = new FileWriter(nomeBiblioteca.trim() + ".txt", false);
                PrintWriter dados = new PrintWriter(arqGrava);
                
                for ( int i = 0 ; i < listaLivros.size() ; i++){                    
                    dados.println(listaLivros.get(i));                    
                }
                dados.close();
                arqGrava.close();
                jTextFieldNomeLivro.requestFocus();
                JOptionPane.showMessageDialog(this, "Arquivo dos livros dessa biblioteca salvo com sucesso!");
                
            } catch (IOException ex) {
                System.out.println("Erro ao gravar arquivo.");
            }             
        } else {
            JOptionPane.showMessageDialog(this, "Adicione nome de um livro para salvar.");
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastrosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastrosLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxBiblioteca;
    private javax.swing.JLabel jLabelLivroCadastrados;
    private javax.swing.JLabel jLabelNomeLivro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelbiblioteca;
    private javax.swing.JList<String> jListLivrosCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomeLivro;
    // End of variables declaration//GEN-END:variables
}
