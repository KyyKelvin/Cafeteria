/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsuldeminas.cafeteria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kelvin
 */
public class Conexao {
    
    public Connection getConexao(){
        //valores para estabelecer a conexao
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "";
        
        try{
            //1° carregar o driver
            Class.forName(driver);
            //Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso!");
        
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            //DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?useTimezone=true&serverTimezone=UTC", "root", "");
            System.out.println("Conexão estabelecida!");
            
            return conexao;
            
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
    }
    
}