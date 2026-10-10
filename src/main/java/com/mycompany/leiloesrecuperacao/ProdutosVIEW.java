package com.mycompany.leiloesrecuperacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProdutosVIEW extends JFrame {
    
    public ProdutosVIEW() {
        setTitle("Gestão de Produtos");
        setSize(400, 250);
        setLocationRelativeTo(null);
        
        JPanel painel = new JPanel();
        painel.setLayout(null);
        
        JLabel lblNome = new JLabel("Nome do Produto:");
        lblNome.setBounds(20, 20, 150, 25);
        painel.add(lblNome);
        
        JTextField txtNome = new JTextField();
        txtNome.setBounds(150, 20, 200, 25);
        painel.add(txtNome);
        
        JLabel lblValor = new JLabel("Valor Inicial:");
        lblValor.setBounds(20, 60, 150, 25);
        painel.add(lblValor);
        
        JTextField txtValor = new JTextField();
        txtValor.setBounds(150, 60, 200, 25);
        painel.add(txtValor);
        
        JButton btnSalvar = new JButton("Salvar Produto");
        btnSalvar.setBounds(150, 110, 150, 30);
        btnSalvar.addActionListener(e -> {
            Produto p = new Produto();
            p.nome = txtNome.getText();
            try {
                // Tenta converter o texto digitado num número decimal
                p.valor = Double.parseDouble(txtValor.getText());
                p.status = "A Venda";
                
                // Envia para o Banco de Dados
                ProdutosDAO dao = new ProdutosDAO();
                dao.cadastrarProduto(p);
                
                // Fecha a janela após salvar
                dispose();
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido.");
            }
        });
        painel.add(btnSalvar);
        
        add(painel);
    }
}