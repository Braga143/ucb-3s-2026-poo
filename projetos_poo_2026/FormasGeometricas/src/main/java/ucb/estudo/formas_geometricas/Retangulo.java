
package ucb.estudo.formas_geometricas;

/**
 *
 * @author walis
 */

//Classe filha herdando da classe pai FormaGeometrica
public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    //Metodo Construtor
    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    //Calcular a area
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Area do retangulo: " + area);
    } 
    
     // Calcular o perimetro
    public void calcularPerimetro() {
        double perimetro = 2 * (base + altura);
        System.out.println("Peremetro do retangulo: " + perimetro);
    }
}
