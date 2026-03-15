/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Scanner;

/**
 *
 * @author walis
 */

/*Atividade 6: Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a
receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga imposto de 7% sobre este salário.*/

public class ATIVIDADEPOO6 {
    public static void main(String[] args) {
        System.out.println("Ola vamos calcular o salario base liquido a receber: Sabendo que tem 5% de gratificacao e 7% de impsto? ");/*Menssagem de inicio do programa*?*/
        
        Scanner scanner = new Scanner(System.in);/*Cria o objeto*/
        System.out.println("Informe o valor do salario base: ");/*Pede para o usuario digitar o valor do salario*/
        
            double salario_base = scanner.nextDouble();/*Cria o valor do salario base*/
        
            double gratificacao = salario_base * 0.05;/*Calcula o percentual de gratificacao*/
        System.out.println("O valor da gratificacao e de: R$" + gratificacao);/*Imprime na tela o valor da gratifiicaco*/
            
            double sal_grat = salario_base + gratificacao;/*Soma do salario mais a gratificacao*/
        
            double imposto = sal_grat * 0.07;/*Calcula o percentual do imposto*/
        System.out.println("O valor do imposto e de: R$" + imposto);/*Imprime na tela o valor do imposto*/
            
            double salario_liquido = sal_grat - imposto;/*Calcula o valor do slario liquido a receber*/
            
        System.out.println("O valor do salario liquido a receber e de: R$" + salario_liquido);/*Imprime na tela o valor do salario liquido a receber*/
    }
}
