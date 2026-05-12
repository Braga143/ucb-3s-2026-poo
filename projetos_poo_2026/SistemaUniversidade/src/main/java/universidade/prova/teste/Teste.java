/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova.teste;

/**
 *
 * @author Windows
 */
import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {

    public static void main(String[] args) {

        // OBJETO UCB

        ProvaUCB alunoUCB = new ProvaUCB();

        alunoUCB.notaAv1 = 8;
        alunoUCB.notaAv2 = 7;
        alunoUCB.notaAv3 = 9;

        System.out.println("===== UCB =====");

        System.out.println("Media: " + alunoUCB.calcularMedia());

        if(alunoUCB.aprovado()){

            System.out.println("Aluno aprovado");

        }else{

            System.out.println("Aluno reprovado");
        }



        // OBJETO FAFIFO

        ProvaFafifo alunoFafifo = new ProvaFafifo();

        alunoFafifo.notaAv1 = 5;
        alunoFafifo.notaAv2 = 6;
        alunoFafifo.notaAv3 = 8;

        System.out.println("\n===== FAFIFO =====");

        System.out.println("Media: " + alunoFafifo.calcularMedia());

        if(alunoFafifo.aprovado()){

            System.out.println("Aluno aprovado");

        }else{

            System.out.println("Aluno reprovado");
        }

    }

}
