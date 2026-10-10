package com.mycompany.leiloesrecuperacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutosDAO {
    public void cadastrarProduto(Produto produto) {
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";
        try (Connection conn = new conectaDAO().connectDB();
             PreparedStatement prep = conn.prepareStatement(sql)) {
            prep.setString(1, produto.nome);
            prep.setDouble(2, produto.valor);
            prep.setString(3, produto.status);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto salvo no Banco de Dados com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro.getMessage());
        }
    }
}