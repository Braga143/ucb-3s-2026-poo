
package com.mycompany.poo;

/**
 *
 * @author walisson.braga
 */
public class Calculadora {
    //soma dois numeros inteiros
    public int somar(int a, int b){
      return a + b;  
    }
    //soma tes numeros inteiros
    public int somar(int a, int b, int c){
      return a + b;
    }
    
    //soma de dois doubles
    public double somar(double a, double b){
      return a + b;
    }
    
    //Concatenação de strings
    public String somar(String a, String b){
      return a + b;
    }
    
    public static int somar(double a, int b){
        return (int) (a + b);
    }
    
    //Metodo utilitario para calcular média
    public static double calcularMedia(double[] valores){
    double soma = 0;
    for (double valor : valores){
        soma += valor;
    }
    return soma / valores.length;
    }
}
