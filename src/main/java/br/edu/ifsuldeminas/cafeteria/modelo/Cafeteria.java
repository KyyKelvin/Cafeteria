/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsuldeminas.cafeteria.modelo;

/**
 *
 * @author Kelvin
 */
public class Cafeteria {
    
    private String ProdutoNome;
    private String ProdutoCategoria;
    private int Preco;
    private int Quantidade;

    public String getProdutoNome() {
        return ProdutoNome;
    }

    public void setProdutoNome(String ProdutoNome) {
        this.ProdutoNome = ProdutoNome;
    }

    public String getProdutoCategoria() {
        return ProdutoCategoria;
    }

    public void setProdutoCategoria(String ProdutoCategoria) {
        this.ProdutoCategoria = ProdutoCategoria;
    }

    public int getPreco() {
        return Preco;
    }

    public void setPreco(int Preco) {
        this.Preco = Preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
