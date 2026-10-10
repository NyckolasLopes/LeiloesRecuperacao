package com.mycompany.leiloesrecuperacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientesVIEW extends JFrame {
    
    public ClientesVIEW() {
        setTitle("Cadastro de Clientes");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        painel.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(120, 20, 230, 25);
        painel.add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 60, 100, 25);
        painel.add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(120, 60, 230, 25);
        painel.add(txtCpf);

        JLabel lblEmail = new JLabel("E-mail:");
        lblEmail.setBounds(20, 100, 100, 25);
        painel.add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(120, 100, 230, 25);
        painel.add(txtEmail);

        JButton btnSalvar = new JButton("Salvar Cliente");
        btnSalvar.setBounds(120, 150, 150, 30);
        btnSalvar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso!");
            dispose();
        });
        painel.add(btnSalvar);

        add(painel);
    }
}