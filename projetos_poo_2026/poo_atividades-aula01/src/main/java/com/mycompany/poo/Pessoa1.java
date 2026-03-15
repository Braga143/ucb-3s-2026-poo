/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author walis
 */
public class Pessoa1 {
    
    // Atributos 
    private String nome;
    private int idade;
    private String email;
    
    //Costrutor
    public Pessoa1(String nome, int idade, String email){
        this.nome = nome; this.idade = idade; this.email = email;
    }
    // Métodos
    public void apresentar(){
        System.err.println("Ola, seja-bem vindo " + nome);
        
        System.out.println(" meu email e :" + email);
    }
    public void fazerAniversario(){
        idade++;
        System.out.println("Minha idade e :" + idade);
        
    }
    
}
