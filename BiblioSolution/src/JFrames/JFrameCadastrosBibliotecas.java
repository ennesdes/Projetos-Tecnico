
package JFrames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

// @author Douglas Ennes 

public class JFrameCadastrosBibliotecas extends javax.swing.JFrame {

    DefaultListModel<String> listaCadastroBiblioteca;
    
    public JFrameCadastrosBibliotecas() {
        initComponents();        
        listaCadastroBiblioteca = new DefaultListModel<>();
        jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca);        
    }
    public void lerDadosArquivo() throws FileNotFoundException, IOException{        
        //lê arquivo BiblioSolution
        File arquivo = new File ("BiblioSolution.txt");
        //verifica se o arquivo existe
        if (arquivo.exists()){            
            listaCadastroBiblioteca = new DefaultListModel<>();            
            try {
            String biblioteca = "";
            
            FileReader arqLe = new FileReader(arquivo);
            BufferedReader dados = new BufferedReader(arqLe);
            
            //confere as linhas jogando o conteudo para o arquivo
            while ((biblioteca = dados.readLine()) != null) {
                listaCadastroBiblioteca.addElement(biblioteca);
            }
            dados.close();
            arqLe.close();
            jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca);            
        } 
         catch (IOException ex) {
             System.out.println("Erro ao ler este arquivo.");
        }
    } else {
            listaCadastroBiblioteca = new DefaultListModel<>();
            jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca);
        }}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNomeBiblioteca = new javax.swing.JLabel();
        jTextFieldNomeBiblioteca = new javax.swing.JTextField();
        jLabelBibliotecaCadastradas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBibliotecasCadastradas = new javax.swing.JList<>();
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
        jLabelTitulo.setText("Cadastro de Bibliotecas");

        jLabelNomeBiblioteca.setText("Nome da Biblioteca:");

        jLabelBibliotecaCadastradas.setText("Bibliotecas cadastradas:");

        jScrollPane1.setViewportView(jListBibliotecasCadastradas);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeBiblioteca))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBibliotecaCadastradas))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRemover)
                                    .addComponent(jButtonAdicionar)
                                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldNomeBiblioteca))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeBiblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBibliotecaCadastradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        if( ! jTextFieldNomeBiblioteca.getText().equals("")){ //se estiver diferente de vazio..
            
            listaCadastroBiblioteca.addElement(jTextFieldNomeBiblioteca.getText());//adiciona biblioteca na lista
            jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca);
            jTextFieldNomeBiblioteca.setText("");//limpa o campo de texto para biblioteca
            jTextFieldNomeBiblioteca.requestFocus();//retorna o cursor para o campo de preencher biblioteca
                                                
        } else {
            JOptionPane.showMessageDialog(this, "Digite o nome da biblioteca.");
        }
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        if (jListBibliotecasCadastradas.getSelectedValue() != null) { //se ter algo selecionado..
        
        listaCadastroBiblioteca.remove(jListBibliotecasCadastradas.getSelectedIndex()); //remove item selecionado
        jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca); //atualiza lista
        
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma biblioteca para remover.");
        }
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        listaCadastroBiblioteca.removeAllElements(); //remove todos os elementos da lista
        jListBibliotecasCadastradas.setModel(listaCadastroBiblioteca);
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
        //abrir novo jframeSistema
        JFrameSistema formSistema = new JFrameSistema();
        formSistema.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.lerDadosArquivo();
        } catch (IOException ex) {
            Logger.getLogger(JFrameCadastrosBibliotecas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        if (listaCadastroBiblioteca.size() > 0){         
            try {
                //cria arquivo com o nome BiblioSolution
                FileWriter arqGrava = new FileWriter ("BiblioSolution.txt", false);
                PrintWriter dados = new PrintWriter(arqGrava);
                
                for (int i = 0 ; i < listaCadastroBiblioteca.size() ; i++){                
                dados.println(listaCadastroBiblioteca.get(i));
                }
                dados.close();
                arqGrava.close();
                jTextFieldNomeBiblioteca.requestFocus();
                JOptionPane.showMessageDialog(this, "Arquivo das bibliotecas salvo com sucesso!");
                
            } catch (IOException ex) {
                System.out.println("Erro ao gravar o arquivo.");
            }
            
        } else{
            JOptionPane.showMessageDialog(this, "Adicione nome de bibliotecas para salvar.");
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCadastrosBibliotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosBibliotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosBibliotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastrosBibliotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastrosBibliotecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelBibliotecaCadastradas;
    private javax.swing.JLabel jLabelNomeBiblioteca;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListBibliotecasCadastradas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomeBiblioteca;
    // End of variables declaration//GEN-END:variables
}
