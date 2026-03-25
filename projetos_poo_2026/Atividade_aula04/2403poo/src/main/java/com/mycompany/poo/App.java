
package com.mycompany.poo;

/**
 *
 * @author walisson.braga
 */
public class App {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Maria Aparecida");
        p1.setIdade(50);
        System.out.println("Nome: " + p1.getNome() + "Sua idade he: " + p1.getIdade());

        Pessoa p2 = new Pessoa("Joao Silva", 60);
        System.out.println("Nome: " + p2.getNome() + " Sua idade he: " + p2.getIdade());
        
        Calculadora c = new Calculadora();
        System.out.println("A soma das suas idades eh: " + c.somar(p1.getIdade(),p2.getIdade()));
        
        //somar duas idades com metodo static
        System.out.append("Soma de dois numeros: " + Calculadora.somar(65.7, 50));
        
        //Média de valores
        double[] notas = {10, 8, 5, 9, 7.5, 9.5};
        System.out.println("Media da nota de joão eh: " + Calculadora.calcularMedia(notas));
    }
}