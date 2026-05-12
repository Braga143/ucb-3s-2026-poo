/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Windows
 */
public abstract class ProvaUniversidade {
    protected double notaAv1, notaAv2, notaAv3;
    protected double pesoAv1, pesoAv2, pesoAv3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;
    
     
    public abstract double calcularMedia();
    
    public boolean aprovado (){
        if (calcularMedia() >= mediaMinima){
            return true; 
        }
        else{
            return false;
        }
    }
    
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();
       
    
}

