
package admin;

import dao.CidadeDAO;
import javax.swing.JOptionPane;
import modelo.Cidade;
import java.util.List;

public class CidadeTela extends javax.swing.JFrame {

     List<Cidade> lista;
     Integer posicao, ultimo;

    
    public CidadeTela() {
        initComponents();
        CidadeDAO dao = new CidadeDAO();
        lista = dao.listar();
        posicao = 0;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Acoes = new javax.swing.JPanel();
        inserir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        Navegacao = new javax.swing.JPanel();
        primeiro = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimoo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        caixaID = new javax.swing.JTextField();
        caixaNomeCid = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CIDADE");

        Acoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        inserir.setBackground(new java.awt.Color(0, 255, 0));
        inserir.setForeground(new java.awt.Color(0, 0, 204));
        inserir.setText("Inserir");
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });

        limpar.setBackground(new java.awt.Color(0, 255, 0));
        limpar.setForeground(new java.awt.Color(0, 0, 204));
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(0, 255, 0));
        excluir.setForeground(new java.awt.Color(0, 0, 204));
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        consultar.setBackground(new java.awt.Color(0, 255, 0));
        consultar.setForeground(new java.awt.Color(0, 0, 204));
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AcoesLayout = new javax.swing.GroupLayout(Acoes);
        Acoes.setLayout(AcoesLayout);
        AcoesLayout.setHorizontalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inserir)
                    .addComponent(limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultar)
                    .addComponent(excluir)))
        );
        AcoesLayout.setVerticalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AcoesLayout.createSequentialGroup()
                        .addComponent(inserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpar))
                    .addGroup(AcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultar)
                        .addGap(18, 18, 18)
                        .addComponent(excluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Navegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        primeiro.setBackground(new java.awt.Color(0, 0, 204));
        primeiro.setForeground(new java.awt.Color(0, 255, 0));
        primeiro.setText("Primeiro");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(0, 0, 204));
        anterior.setForeground(new java.awt.Color(0, 255, 0));
        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        proximo.setBackground(new java.awt.Color(0, 0, 204));
        proximo.setForeground(new java.awt.Color(0, 255, 0));
        proximo.setText("Próximo");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        ultimoo.setBackground(new java.awt.Color(0, 0, 204));
        ultimoo.setForeground(new java.awt.Color(0, 255, 0));
        ultimoo.setText("Último");
        ultimoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimooActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavegacaoLayout = new javax.swing.GroupLayout(Navegacao);
        Navegacao.setLayout(NavegacaoLayout);
        NavegacaoLayout.setHorizontalGroup(
            NavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavegacaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(NavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anterior)
                    .addComponent(primeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proximo)
                    .addComponent(ultimoo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NavegacaoLayout.setVerticalGroup(
            NavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavegacaoLayout.createSequentialGroup()
                .addGroup(NavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavegacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(primeiro)
                        .addGap(18, 18, 18)
                        .addComponent(anterior))
                    .addGroup(NavegacaoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(proximo)
                        .addGap(18, 18, 18)
                        .addComponent(ultimoo)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel1.setToolTipText("Dados");

        caixaID.setBackground(new java.awt.Color(255, 0, 0));
        caixaID.setText("Digite o ID");
        caixaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaIDActionPerformed(evt);
            }
        });

        caixaNomeCid.setBackground(new java.awt.Color(255, 0, 0));
        caixaNomeCid.setText("Digite o Nome");
        caixaNomeCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaNomeCidActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 255));
        id.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nome:");

        listagem.setBackground(new java.awt.Color(51, 255, 0));
        listagem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listagem.setForeground(new java.awt.Color(0, 0, 204));
        listagem.setText("Ir para a listagem");
        listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaNomeCid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caixaID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(listagem)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id)
                    .addComponent(listagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaNomeCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(Navegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Acoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Acoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Navegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        Cidade c = new Cidade();
        Boolean x = false;
       
        if(caixaID.getText().isEmpty() || caixaNomeCid.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!!!");
            x= false;
        }
        else{
            try {
                c.setCodigo(Integer.parseInt(caixaID.getText()));
                x = true;
            } catch (Exception e) {
                x = false;
                JOptionPane.showMessageDialog(rootPane, "O código deve ser numérico!!!");
            }
        }
if(x==true){
        c.setCodigo(Integer.parseInt(caixaID.getText()));
        c.setNome(caixaNomeCid.getText());
        
        CidadeDAO dao = new  CidadeDAO();
            
                    //chamo o inserir
                    Boolean deu = false;
                    deu = dao.inserir(c);
                    lista = dao.listar();
                    x= true;
}
                    if (x == true)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso!");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(rootPane,"Erro ao cadastrar!");
                    }
                    
                    
                    Limpar ();
        
        /**Cidade item = new Cidade();
        if(caixaNomeCid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"Todos campos obrigatorios");
        }else
        { 
        item.setNome(caixaNomeCid.getText());
           
        CidadeDAO dao = new CidadeDAO();
        boolean deucerto = dao.inserir(item);
        
        if (deucerto==true)
        {
        JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso");
        }else {
        JOptionPane.showMessageDialog(rootPane,"Erro ao cadastrar");
        }
           lista.add(item);
           Limpar();
        }}
        /**Cidade obj = new Cidade();
        Boolean deu = false;
        if (caixaNomeCid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "deve preencher todos os campos");
            deu = false;
        } else {
            deu = true;
        }
        if (deu == true) {
            obj.setNome(caixaNomeCid.getText());
            CidadeDAO dao = new CidadeDAO();
            dao.inserir(obj);
            lista = dao.listar();
            Limpar();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
        }*/
    }//GEN-LAST:event_inserirActionPerformed
    
    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        caixaNomeCid.setText(null);
        caixaID.setText(null);
        JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
        Limpar();
              
    }//GEN-LAST:event_limparActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if(caixaNomeCid.getText().isEmpty()== false){
            if(lista.size() >= 0){ 
              CidadeDAO dao = new CidadeDAO();
              Boolean deucerto = dao.excluir(lista.get(posicao));
              if (deucerto == true)
              {
                  JOptionPane.showMessageDialog(rootPane,"Exluido com sucesso"); 
             lista = dao.listar();
             Limpar();
              }
              else{
                  JOptionPane.showMessageDialog(rootPane, "Erro ao excluir");
              }
              
            }
       
        }
       
    }//GEN-LAST:event_excluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        String nome1 = JOptionPane.showInputDialog("Digite o nome a ser pesquisado:");
        boolean encontrou = false;
        int posicaoachou = 0;
                                      
        for (Cidade c : lista){
            if (nome1.equals(c.getNome())){ 
               posicao = posicaoachou;
                caixaNomeCid.setText(c.getNome());
                caixaID.setText((c.getCodigo().toString()));
    }//GEN-LAST:event_consultarActionPerformed
        }
    }
    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
       primeiro.setEnabled(true);
        anterior.setEnabled(false);
        proximo.setEnabled(true);
        ultimoo.setEnabled(true);        
        if (lista.size()>0){
        // TODO add your handling code here:
        posicao = 0;
        Cidade c = lista.get(0);
        caixaNomeCid.setText(c.getNome());
        caixaID.setText((c.getCodigo().toString()));
        }
    }//GEN-LAST:event_primeiroActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimoo.setEnabled(true);
         if (posicao != 0){
        if (lista.size() > 0 ){
        posicao = posicao - 1;
       Cidade c = lista.get(posicao);
        caixaNomeCid.setText(c.getNome());
        caixaID.setText((c.getCodigo().toString()));
        }
    }//GEN-LAST:event_anteriorActionPerformed
    }
    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(true);
        ultimoo.setEnabled(true);
        if (lista.size() > 0){
        posicao = posicao + 1;
       Cidade c= lista.get(posicao);
        caixaNomeCid.setText(c.getNome());
        caixaID.setText((c.getCodigo().toString()));
        }
    }//GEN-LAST:event_proximoActionPerformed

    private void ultimooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimooActionPerformed
        primeiro.setEnabled(true);
        anterior.setEnabled(true);
        proximo.setEnabled(false);
        ultimoo.setEnabled(false);
        if (lista.size() > 0) {
            posicao = lista.size() - 1;
            Cidade elemento = lista.get(posicao);
            caixaID.setText(elemento.getCodigo().toString());
            caixaNomeCid.setText(elemento.getNome());
        }
        if (lista.size() - 1 == posicao && lista.size() == 1) {
            proximo.setEnabled(false);
            ultimoo.setEnabled(false);
            anterior.setEnabled(false);
        }
    }//GEN-LAST:event_ultimooActionPerformed

    private void listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listagemActionPerformed
        CidadeListar listaci = new CidadeListar();
        listaci.setVisible(true);
        dispose();
    }//GEN-LAST:event_listagemActionPerformed

    private void caixaNomeCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaNomeCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaNomeCidActionPerformed

    private void caixaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaIDActionPerformed

    private void Limpar() {
        caixaID.setText(null);
        caixaNomeCid.setText("");
    }

  
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acoes;
    private javax.swing.JPanel Navegacao;
    private javax.swing.JButton anterior;
    private javax.swing.JTextField caixaID;
    private javax.swing.JTextField caixaNomeCid;
    private javax.swing.JButton consultar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel id;
    private javax.swing.JButton inserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton listagem;
    private javax.swing.JButton primeiro;
    private javax.swing.JButton proximo;
    private javax.swing.JButton ultimoo;
    // End of variables declaration//GEN-END:variables
}
