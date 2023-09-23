/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.ulbra.view;

import br.ulbra.controller.UsuarioController;
import br.ulbra.utils.Utils;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author beeme
 */
public class FRCadUsu extends javax.swing.JDialog {

    /**
     * Creates new form FRCadUsu_
     */
    public FRCadUsu(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDtNasc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtRSenha = new javax.swing.JPasswordField();
        chkAtivo = new javax.swing.JCheckBox();
        BtCancelar = new javax.swing.JButton();
        Imagem = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btImagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/user.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CADASTRO ");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-MAIL:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DATA DE NASCIMENTO:");

        txtDtNasc.setBackground(new java.awt.Color(255, 255, 255));
        txtDtNasc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDtNasc.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("SENHA:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("REPETIR SENHA:");

        btSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btSalvar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 0, 0));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/save.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setBorder(new javax.swing.border.MatteBorder(null));
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));

        txtRSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtRSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRSenha.setForeground(new java.awt.Color(0, 0, 0));

        chkAtivo.setBackground(new java.awt.Color(204, 204, 204));
        chkAtivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chkAtivo.setForeground(new java.awt.Color(0, 0, 0));
        chkAtivo.setText("ATIVO");
        chkAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAtivoActionPerformed(evt);
            }
        });

        BtCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtCancelar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BtCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ulbra/img/backiconnaguentomais.png"))); // NOI18N
        BtCancelar.setText("CANCELAR");
        BtCancelar.setBorder(new javax.swing.border.MatteBorder(null));
        BtCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtCancelarMouseClicked(evt);
            }
        });
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        Imagem.setBackground(new java.awt.Color(255, 255, 255));
        Imagem.setForeground(new java.awt.Color(0, 0, 0));
        Imagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DE JOGADOR:");

        btImagem.setBackground(new java.awt.Color(255, 255, 255));
        btImagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btImagem.setForeground(new java.awt.Color(0, 0, 0));
        btImagem.setText("Escolher imagem");
        btImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btImagemMouseClicked(evt);
            }
        });
        btImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(chkAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtRSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btImagem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btImagem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chkAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCancelar)
                    .addComponent(btSalvar))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificarCampos() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Nome' em branco");
            return false;
        }
        if (!txtNome.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Nome' possui caracteres inválidos");
            return false;
        }
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' em branco");
            return false;
        }
        if (!txtEmail.getText().matches("^[a-zA-Z._]+@[a-zA-Z._]+")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Email' possui formato inválido");
            return false;
        }
        if (!txtDtNasc.getText().matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Data Nascimento' possui formato inválido"
                    + " Ex: 01/01/2000");
            return false;
        }
        char[] senha = txtSenha.getPassword();
        if (new String(senha).length() < 8) {
            JOptionPane.showMessageDialog(null,
                    "Campo 'Senha' deve ser maior que 8 caracteres!");
            return false;
        }
        if (!new String(senha).equals(new String(txtRSenha.getPassword()))) {
            JOptionPane.showMessageDialog(null,
                    "As senhas não são iguais!");
            return false;
        }
        return true;
    }
    
    
    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {                                      
//GEN-FIRST:event_btSalvarMouseClicked
        if(!verificarCampos()){
            return;
        }
        
        UsuarioController controller = new UsuarioController();
        String senha = new String(txtSenha.getPassword());
        if(controller.adicionarUsuario(txtNome.getText(), txtEmail.getText(), senha, 
                txtDtNasc.getText(), Utils.salvarBoolean(chkAtivo.isSelected()), Imagem.getIcon())){
            this.dispose();
        };
    }//GEN-LAST:event_btSalvarMouseClicked

    private void chkAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAtivoActionPerformed

    private void BtCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_BtCancelarMouseClicked

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void btImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btImagemActionPerformed

    private void btImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btImagemMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha um arquivo");
        
        int returnValue = fileChooser.showOpenDialog(null);
        
        if (returnValue == fileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            Icon icon = Utils.fileParaIcon(arquivo);
            
            ImageIcon iconRedimensionado = Utils.redimensionarIcon(icon, 102, 110);
            
            Imagem.setIcon(iconRedimensionado);
        }
        
    }//GEN-LAST:event_btImagemMouseClicked

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
            java.util.logging.Logger.getLogger(FRCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRCadUsu dialog = new FRCadUsu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JLabel Imagem;
    private javax.swing.JButton btImagem;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtRSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
