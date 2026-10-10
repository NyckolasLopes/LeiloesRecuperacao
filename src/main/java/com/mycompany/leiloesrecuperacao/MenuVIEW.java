package com.mycompany.leiloesrecuperacao;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuVIEW extends JFrame {

    public MenuVIEW() {
        setTitle("Casa de Leilões - Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JPanel painel = new JPanel();
        painel.setLayout(null);

        JLabel titulo = new JLabel("Sistema Administrativo");
        titulo.setBounds(120, 20, 200, 30);
        painel.add(titulo);

        JButton btnProdutos = new JButton("Gestão de Produtos");
        btnProdutos.setBounds(100, 70, 200, 40);
        btnProdutos.addActionListener((ActionEvent e) -> {
            new ProdutosVIEW().setVisible(true);
        });
        painel.add(btnProdutos);

        JButton btnClientes = new JButton("Cadastro de Clientes");
        btnClientes.setBounds(100, 130, 200, 40);
        btnClientes.addActionListener((ActionEvent e) -> {
            new ClientesVIEW().setVisible(true);
        });
        painel.add(btnClientes);

        JButton btnLances = new JButton("Área de Lances");
        btnLances.setBounds(100, 190, 200, 40);
        btnLances.addActionListener((ActionEvent e) -> {
            new LancesVIEW().setVisible(true);
        });
        painel.add(btnLances);

        add(painel);
    }
}