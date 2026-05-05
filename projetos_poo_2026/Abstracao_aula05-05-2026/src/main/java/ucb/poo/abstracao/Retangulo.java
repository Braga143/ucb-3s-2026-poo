/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.poo.abstracao;

/**
 *
 * @author samue
 */
public class Retangulo extends Forma {
    private int comprimento;
    private int largura;

    public Retangulo(String pcor, double px, double py) {
        super(pcor, px, py);
    }

    @Override
    public void calcularArea() {
        System.out.println(" Area do retangulo " + getComprimento() * getLargura());
    }

    /**
     * @return the comprimento
     */
    public int getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
}
