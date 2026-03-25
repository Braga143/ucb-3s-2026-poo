
package com.mycompany.estoque;

import com.sun.source.util.Plugin;

/**
 *
 * @author walisson.braga
 */
public class Produto {
    private String nome;
    private double preco;
    private int qauntEmEstoque;
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.qauntEmEstoque = quant;
}
    
    public void exibirInformacoes() {
        System.out.println(" Nome do Produto: " + nome);
        System.out.println(" Preco do produto: " + preco);
        System.out.println(" Quantidade do produto: " + qauntEmEstoque);
    }
    
    public void adicionarAoEstoque(int qunt){
        qauntEmEstoque += qunt;
    }
    
    public void removerDoEstoque(int qunt){
        qauntEmEstoque += qunt;
    }
}
