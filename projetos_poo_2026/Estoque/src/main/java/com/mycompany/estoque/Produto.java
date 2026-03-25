
package com.mycompany.estoque;

import com.sun.source.util.Plugin;

/**
 *
 * @author walisson.braga
 */

public class Produto {
    private String nome;
    private double preco;
    int quantEmEstoque;
    
    //Construtor
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quantEmEstoque = quant;
}
    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println(" Nome do Produto: " + nome);
        System.out.println(" Preco do produto: R$" + preco);
        System.out.println(" Quantidade do produto: " + quantEmEstoque);
    }
    
    // Método para exibir informações
    public void adicionarAoEstoque(int quant){
        quantEmEstoque += quant;
    }
    
    // Remover do estoque (com validação)
    public void removerDoEstoque(int quant){
        if (quantEmEstoque >= quant) {
        quantEmEstoque -= quant;
        }else{ 
            System.out.println(" Sem estoque suficiente ");
        }
    }
}
