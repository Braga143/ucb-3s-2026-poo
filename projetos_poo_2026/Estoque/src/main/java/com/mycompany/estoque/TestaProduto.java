package com.mycompany.estoque;


/**
 *
 * @author walisson.braga
 */
public class TestaProduto {

    //criar o metodo cosntrutor 
    public static void main(String[] args) {
        Produto p1 = new Produto("Monitor 24' ", 900, 10);
        Produto p2 = new Produto("CPU ", 1500, 10);
        Produto p3 = new Produto("Mause ", 80, 10);
        System.out.println("");

        //Exibir informações
        System.out.println(" === Produtos iniciais  ===");
        p1.exibirInformacoes();
        System.out.println(" *****************************");

        p2.exibirInformacoes();
        System.out.println(" *****************************");

        p3.exibirInformacoes();
        System.out.println(" *****************************");

        //Adicionar produto ao estoque
        p1.adicionarAoEstoque(15);
        p2.adicionarAoEstoque(15);
        p3.adicionarAoEstoque(15);

        //Atualizar estoque
        System.out.println(" === Produto apos adicao  ===");
        p1.exibirInformacoes();
        System.out.println(" *****************************");

        p2.exibirInformacoes();
        System.out.println(" *****************************");

        p3.exibirInformacoes();
        System.out.println(" *****************************");

        //Remover produto do estoque
        p1.removerDoEstoque(19);
        p2.removerDoEstoque(19);
        p3.removerDoEstoque(19);

        //Exibir novo estoque
        System.out.println(" ===  Estoque final  ===");
        
        if (p1.quantEmEstoque > 5){
            p1.exibirInformacoes();
        }else{
            System.out.println(" Estoque Baixo ");
        }
        
        System.out.println(" *****************************");

        if (p2.quantEmEstoque > 5) {
            p2.exibirInformacoes();
        }else{
            System.out.println(" Estoque Baixo");
        }
        
        System.out.println(" ****************************");
        
        if (p3.quantEmEstoque > 5){
            p3.exibirInformacoes();
        }else{
            System.out.println(" Estoque Baixo");
        }
        
        System.out.println(" *****************************");
    }
}
