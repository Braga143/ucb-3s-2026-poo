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

/*Atividade 1: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.*/

public class ATIVIDADEPOO1 {
    public static void main (String[] args){
        System.out.println("Ola seja bem vindo! Vamos calcular numeros inteiros?");/*Menssagem de inicio do programa*/
        
        Scanner scanner = new Scanner (System.in);/*cria um objeto*/
        System.out.println("Entre com 4 numeros inteiros maior que 0:");/*Entra com os numeros*/
        
            int num1 = scanner.nextInt();/*Cria o primeiro numero*/ 
            int num2 = scanner.nextInt();/*Cria o segundo numero*/
            int num3 = scanner.nextInt();/*Cria o terceiro numero*/
            int num4 = scanner.nextInt();/*Cria o quarto numero*/
        
            int soma = num1 + num2 + num3 + num4;/*Realiza a soma dos numeros inteiros digitados*/
        
        System.out.println("A soma dos numeros digitados e = " + soma);/*Imprime o resultado da soma dos numeros digitados*/
    } 
}
