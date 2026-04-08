
package ucb.estudo.formas_geometricas;

/**
 *
 * @author walis
 */

//Classe (Filha) Herdando da Classe (Pai)
public class Circulo extends FormaGeometrica {
    private double raio;

    //Metodo Construtor
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    //Calculo da área
    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("Area do circulo: " + area);
    }
    
    //Calculo do perimetro (circunferência)
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Perimetro do circulo: " + perimetro);
    }
}
