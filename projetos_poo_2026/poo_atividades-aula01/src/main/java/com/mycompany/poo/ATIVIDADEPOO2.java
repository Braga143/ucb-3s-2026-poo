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

/*Atividade 2: Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.*/

public class ATIVIDADEPOO2 {
    public static void main (String[] args){
        System.out.println("Ola seja bem vindo! Vamos calcular a media aritimetica da sua nota?");/*Menssagem de inicio do programa*/
        
        Scanner scanner = new Scanner (System.in);/*cria um objeto*/
        System.out.println("Digite 3 notas maior que 0:");/*Entra com as notas*/
        
            float nota1 = scanner.nextFloat();/*Cria a primeira nota*/
            float nota2 = scanner.nextFloat();/*Cria a segunda nota*/      
            float nota3 = scanner.nextFloat();/*Cria a terceira nota*/
            
            float media = (nota1 + nota2 + nota3) / 3; /*calcula a media aritmetica*/
            
        System.out.println("Sua media aritimetica e = " + media); /*imprime o resultado da media aritimetica*/
    }
}
