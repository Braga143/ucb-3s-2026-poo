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

/*Atividade 5: Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.*/

public class ATIVIDADEPOO5 {
    public static void main(String[] args) {
        System.out.println("Ola vamos calcular o percentual do seu salario? ");/*Menssagem de inicio do programa*?*/
        
        Scanner scanner = new Scanner(System.in);/*Cria o objeto*/
        System.out.println("Informe o valor do seu salario: ");/*Pede para o usuario digitar o valor do salario*/
            double salario_inicial = scanner.nextDouble();/*Cria o valor do salario inicial*/
        
            System.out.println("Agora informe a porcentagem de reajuste: ");/*Pede para o usuario informar o percentual de aumento*/
                double porcentagem = scanner.nextDouble();/*Cria o percentual de almento*/
                double valor_aumento = salario_inicial * (porcentagem / 100);/*Calcula o percentual de aumento*/
            System.out.println("O valor do aumento e de: R$" + valor_aumento);/*Imprime na tela o valor do aumento*/
        
            double novo_salario = valor_aumento + salario_inicial;/*Calcula o valor do novo salario baseado no percentual de almento*/
            
        System.out.println("O Valor do novo salario e de: R$" + novo_salario);/*Imprime na tela o valor do novo salario baseado no percentual de aumento*/
    }
}
