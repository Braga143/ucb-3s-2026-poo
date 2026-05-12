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
    protected double notaav1, notaav2, notaav3;
    protected double pesoav1, pesoav2, pesoav3;
    protected double mediaMinima;
    protected boolean realizouProvafinal;
    
     
    public abstract double calcularMedia();
    
    public boolean aprovado (){
        if calcularMedia() media >= mediaMininma;
            aprovado
        
        return false;
    
    }
    
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();
       
    
}
