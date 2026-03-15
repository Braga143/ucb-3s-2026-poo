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

/*Atividade 3:Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.*/

public class ATIVIDADEPOO3 {
    public static void main (String[] args){
        System.out.println("Ola seja bem vindo! Vamos calcular a media ponderada da sua nota?");/*Menssagem de inicio do programa*/
        
        Scanner scanner = new Scanner (System.in);/*cria um objeto*/
        System.out.println("Digite 3 notas maior que 0:");/*Entra com as notas*/
                
            float nota1 = scanner.nextFloat();/*Cria a primeira nota*/
            float nota2 = scanner.nextFloat();/*Cria a segunda nota*/      
            float nota3 = scanner.nextFloat();/*Cria a terceira nota*/
            
        System.out.println("Agora digite os respectivos pesos de cada nota maior que 0:");/*Entra com os pesos*/
            
            float peso1 = scanner.nextFloat();/*Cria o peso da primeira nota*/
            float peso2 = scanner.nextFloat();/*Cria o peso da segunda nota*/
            float peso3 = scanner.nextFloat();/*Cria o peso da terceira nota*/
                        
            float mediaponderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3); /*calcula a media ponderada*/
            
        System.out.println("Sua media ponderada e = " + mediaponderada); /*imprime o resultado da media ponderada*/
    } 
}
