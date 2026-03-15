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

/*Atividade 4: Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.*/

public class ATIVIDADEPOO4 {
    public static void main(String[] args) {
        System.out.println("Ola vamos calcular o reajuste do seu salario em 25%?"); /*Menssagem de inicio do programa*/
        
        Scanner scanner = new Scanner(System.in);/*Cria o objeto*/
        System.out.println("Digite o seu salario maior que 0: ");/*Pede para entrar com o valor do salario*/
        
            double salario_inicial = scanner.nextDouble();/*Recebe o valor do salario*/
            double porcentagem = salario_inicial * (25 / 100);/*Calcula a porcentagem de aumento do salario*/
            double novo_salario = porcentagem + salario_inicial;/*Calcula o resultado da porcentagem mais o salario inicial*/
        
    System.out.println("O seu salario com 25% de aumento sera: " + novo_salario);/*Imprime na tela o resultado do novo salario com 25% de aumento*/
    } 
}