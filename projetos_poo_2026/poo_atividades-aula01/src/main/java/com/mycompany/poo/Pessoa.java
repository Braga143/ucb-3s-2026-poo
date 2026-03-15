/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author walis
 */
public class Pessoa {
    
    public static void  main(String[]srgs){
        Pessoa1 pessoa1 = new Pessoa1 ("Walisson", 32, "Walissonalvesbraga@gmail.com");
        Pessoa1 pessoa2 = new Pessoa1 ("Teste01", 12, "teste01@gmail.com");
        Pessoa1 pessoa3 = new Pessoa1 ("Teste02", 22, "teste02@gmail.com");
        
        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();
        
        pessoa1.fazerAniversario();
        pessoa2.fazerAniversario();
        pessoa3.fazerAniversario();
        
           
    }
    
}
