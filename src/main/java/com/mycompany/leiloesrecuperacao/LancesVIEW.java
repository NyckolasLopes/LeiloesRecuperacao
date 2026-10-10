package com.mycompany.leiloesrecuperacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LancesVIEW extends JFrame {
    
    public LancesVIEW() {
        setTitle("Área de Lances");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(null);

        JLabel lblCliente = new JLabel("Cliente:");
        lblCliente.setBounds(20, 20, 100, 25);
        painel.add(lblCliente);

        JComboBox<String> cbCliente = new JComboBox<>(new String[]{"Selecione...", "Nyckolas", "Ana Exemplo"});
        cbCliente.setBounds(120, 20, 230, 25);
        painel.add(cbCliente);

        JLabel lblProduto = new JLabel("Produto:");
        lblProduto.setBounds(20, 60, 100, 25);
        painel.add(lblProduto);

        JComboBox<String> cbProduto = new JComboBox<>(new String[]{"Selecione...", "Notebook Dell", "Vaso de Cerâmica"});
        cbProduto.setBounds(120, 60, 230, 25);
        painel.add(cbProduto);

        JLabel lblValor = new JLabel("Valor do Lance:");
        lblValor.setBounds(20, 100, 100, 25);
        painel.add(lblValor);

        JTextField txtValor = new JTextField();
        txtValor.setBounds(120, 100, 230, 25);
        painel.add(txtValor);

        JButton btnConfirmar = new JButton("Confirmar Lance");
        btnConfirmar.setBounds(120, 150, 150, 30);
        btnConfirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Lance registrado com sucesso!");
            dispose();
        });
        painel.add(btnConfirmar);

        add(painel);
    }
}