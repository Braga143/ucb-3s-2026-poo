/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_aula03;

/**
 *
 * @author walis
 */
public class Aluno { /*Criando a classe Aluno*/

    /*Definendo os tipos das variaveis matriula, nome e notas 1,2 e 3;Pprivate para ser acessado somente dentro de
sua própria classe. "encapsulamento"*/
    private String matricula;
    private String nome;
    private double nota1, nota2, nota3;
    
    public Aluno(String matricula, String nome) {this.matricula = matricula; 
    this.nome = nome;}

    public double calcularMedia() {return (nota1 + nota2 + nota3) / 3.0;} /* Calculo da media*/
    public boolean estaAprovado() {return calcularMedia() >= 7.0;} /*Definindo o retorno minimo maior igual a 7.0 para ser aprovado do tipo verdadeiro ou falso*/
    public void exibirInfo() {
        System.out.println("Matricula: " + matricula); /*Imprimir resultado da matricula*/
        System.out.println("Nome: " + nome); /*Imprimir resultado do nome*/
        System.out.println("Media: " + calcularMedia()); /*IMprimir resultado da media*/
    
         if (estaAprovado()) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    } 
    public void setNota1(double nota1) {this.nota1 = nota1; }
    public void setNota2(double nota2) {this.nota2 = nota2; }
    public void setNota3(double nota3) {this.nota3 = nota3; }
   
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("2024001", "Walisson");
        
        aluno1.setNota1(8.5);
        aluno1.setNota2(9.0);
        aluno1.setNota3(7.5);
        
        aluno1.exibirInfo();
                
    }
}
