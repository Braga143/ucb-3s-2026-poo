/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_aula03;

/**
 *
 * @author walis
 */
public class Livro {

    private String isbn, titulo, autor;
    private int ano;
    private boolean disponivel;

    public Livro(String isbn, String titulo, String autor, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro nao esta disponivel!");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void exibirInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponivel: " + disponivel);
    }

    public static void main(String[] args) {

        Livro livro1 = new Livro("9788595080805", "Java Basico", "Joao Silva", 2022);

        livro1.exibirInfo();

        livro1.emprestar();
        livro1.emprestar();

        livro1.devolver();

        livro1.exibirInfo();
    }
}