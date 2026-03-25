/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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
       
       //Exibir informações
       p1.exibirInformacoes();
        System.out.println("********************");
        p2.exibirInformacoes();
        System.out.println("********************");
        p3.exibirInformacoes();
        System.out.println("********************");
    }
}
