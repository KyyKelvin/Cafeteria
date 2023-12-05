/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsuldeminas.cafeteria.dao;

import br.edu.ifsuldeminas.cafeteria.modelo.Cafeteria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kelvin
 */
public class CafeteriaDAO {
    
    public boolean inserir(Cafeteria cafeteria){
        //string com instrução SQL
        String sql = "INSERT INTO cafeteria(ProdutoNome, ProdutoCategoria, " +
        "Preco, Quantidade) VALUES (?, ?, ?, ?); ";
        //conexão com o Banco de Dados
        Connection conexao = new Conexao().getConexao();
        try{
            //criação do statement - levar informação de um lado ao outro
            PreparedStatement pstm = conexao.prepareStatement(sql);
            //definir os parametros da SQL (?)
            pstm.setString(1, cafeteria.getProdutoNome());
            pstm.setString(2, cafeteria.getProdutoCategoria());
            pstm.setInt(3, cafeteria.getPreco());
            pstm.setInt(4, cafeteria.getQuantidade());
            
            //executar no banco de dados e devolver o número de linhas 
            //afetadas na tabela
            int linhasAfetadas = pstm.executeUpdate();
            
            //fechar as conexões
            pstm.close();
            conexao.close();
            return true;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }       
        return false;
    }
    
}
