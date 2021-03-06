/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gui;

import es.beans.Jogadores;
import es.conecxao.TransactionUtil;
import es.dao.DaoJogadores;
import es.util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author macieljp
 */
public class JDialogJogadores extends javax.swing.JDialog {

    /**
     * Creates new form JDialogJogadores
     */
    public JDialogJogadores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfPeso = new javax.swing.JTextField();
        tfEstadoCivil = new javax.swing.JTextField();
        tfTamCalcado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tfCodNacionalidade = new javax.swing.JTextField();
        tfTituloEleitor = new javax.swing.JTextField();
        tfRg = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        tfEstado = new javax.swing.JTextField();
        tfSexo = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfAltura = new javax.swing.JTextField();
        tfTamCamisa = new javax.swing.JTextField();
        tfCodEquipe = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfNascimento = new javax.swing.JTextField();
        tdNascimento = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadstro de Jogadores");
        setMaximumSize(new java.awt.Dimension(640, 500));
        setMinimumSize(new java.awt.Dimension(640, 500));
        setPreferredSize(new java.awt.Dimension(640, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Jogadores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, 20));

        jLabel2.setText("RG:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel6.setText("Rua:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel7.setText("CEP:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel9.setText("Tam Calçado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel10.setText("Peso:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel11.setText("Cod Nacionalidade:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel12.setText("Estado Civil:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel13.setText("Bairro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel14.setText("Altura:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel15.setText("Sexo:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel16.setText("Cidade:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jLabel17.setText("Titulo Eleitor:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));
        getContentPane().add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 130, -1));

        tfEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstadoCivilActionPerformed(evt);
            }
        });
        getContentPane().add(tfEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 130, -1));
        getContentPane().add(tfTamCalcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 130, -1));

        jLabel18.setText("Tam Camisa:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));
        getContentPane().add(tfCodNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 130, -1));

        tfTituloEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloEleitorActionPerformed(evt);
            }
        });
        getContentPane().add(tfTituloEleitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, -1));
        getContentPane().add(tfRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 130, -1));
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));
        getContentPane().add(tfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, -1));
        getContentPane().add(tfRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, -1));

        tfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCepActionPerformed(evt);
            }
        });
        getContentPane().add(tfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));
        getContentPane().add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 130, -1));
        getContentPane().add(tfSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 130, -1));

        tfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 130, -1));

        tfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroActionPerformed(evt);
            }
        });
        getContentPane().add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 130, -1));
        getContentPane().add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 130, -1));

        tfTamCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamCamisaActionPerformed(evt);
            }
        });
        getContentPane().add(tfTamCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 130, -1));
        getContentPane().add(tfCodEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 130, -1));

        jLabel19.setText("Cod Equipe:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));
        getContentPane().add(tfNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 130, -1));

        tdNascimento.setText(" Nascimento");
        getContentPane().add(tdNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 640, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 640, 10));

        setSize(new java.awt.Dimension(656, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoCivilActionPerformed

    private void tfTituloEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloEleitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloEleitorActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCepActionPerformed

    private void tfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeActionPerformed

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

    private void tfTamCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamCamisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTamCamisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Util.imprimirConfirmacao("Deseja Salvar")) {
            salvar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        novo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel tdNascimento;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodEquipe;
    private javax.swing.JTextField tfCodNacionalidade;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfEstadoCivil;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNascimento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSexo;
    private javax.swing.JTextField tfTamCalcado;
    private javax.swing.JTextField tfTamCamisa;
    private javax.swing.JTextField tfTituloEleitor;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        if (verificarCampos()) {
            Jogadores jogador = new Jogadores();
            if (!tfId.getText().isEmpty()) {  //verifica se o campo Codigo esta vazio
                jogador.setCodJog(Integer.parseInt(tfId.getText()));
            }
            jogador.setNome(tfNome.getText().trim());
            jogador.setRg((tfRg.getText()));
            jogador.setCpf(tfCpf.getText());
            jogador.setEstadoCivil(tfEstadoCivil.getText());
            jogador.setAltura(Integer.parseInt(tfAltura.getText()));
            jogador.setBairro(tfBairro.getText());
            jogador.setCep(tfCep.getText());
            jogador.setCidade(tfCidade.getText());
            jogador.setCodEquipe(Integer.parseInt(tfCodEquipe.getText()));
            jogador.setCodNac(Integer.parseInt(tfCodNacionalidade.getText()));
            jogador.setPeso(Float.parseFloat(tfPeso.getText()));
            jogador.setTamCamisa(String.valueOf(tfTamCamisa.getText()));
            jogador.setTamCalcado(Integer.valueOf(tfTamCalcado.getText()));
            jogador.setTituloEleitor(tfTituloEleitor.getText());
            jogador.setSexo(tfSexo.getText());
            jogador.setRua(tfRua.getText());
            jogador.setEstado(tfEstado.getText());
            jogador.setNascimento(Util.stringParaCalendar(tfNascimento.getText()));

            TransactionUtil.beginTransaction();
            try {
                new DaoJogadores().persistir(jogador);
                TransactionUtil.commit();
            } catch (Exception ex) {
                TransactionUtil.rollback();
                Logger.getLogger(JDialogJogadores.class.getName()).log(Level.SEVERE, null, ex);//erro
            }

            novo();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    private void novo() {
        tfId.setText(null);
        tfNome.setText(null);
        tfRg.setText(null);
        tfCpf.setText(null);
        tfNascimento.setText(null);
        tfBairro.setText(null);
        tfCep.setText(null);
        tfCidade.setText(null);
        tfEstado.setText(null);
        tfEstadoCivil.setText(null);
        tfAltura.setText(null);
        tfRg.setText(null);
        tfSexo.setText(null);
        tfCodEquipe.setText(null);
        tfCodNacionalidade.setText(null);
        tfPeso.setText(null);
        tfTituloEleitor.setText(null);
        tfTamCamisa.setText(null);
        tfRua.setText(null);
    }

    protected boolean verificarCampos() {
        return !(!tfNome.getText().isEmpty() && !tfBairro.getText().isEmpty()
                && !tfRg.getText().isEmpty() && !tfCpf.getText().isEmpty() && !tfNascimento.getText().isEmpty()
                && !tfCep.getText().isEmpty() && !tfCidade.getText().isEmpty() && !tfEstado.getText().isEmpty()
                && !tfEstadoCivil.getText().isEmpty() && !tfAltura.getText().isEmpty() && !tfSexo.getText().isEmpty()
                && !tfCodEquipe.getText().isEmpty() && !tfCodEquipe.getText().isEmpty() && !tfCodNacionalidade.getText().isEmpty()
                && !tfPeso.getText().isEmpty() && !tfTituloEleitor.getText().isEmpty() && !tfTamCamisa.getText().isEmpty()
                && tfRua.getText().isEmpty());

    }

}
