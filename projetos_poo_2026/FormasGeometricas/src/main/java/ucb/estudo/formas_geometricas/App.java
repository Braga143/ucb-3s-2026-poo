
package ucb.estudo.formas_geometricas;

/**
 *
 * @author walis
 */
public class App {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo("Retangulo", 7, 5);
        Circulo circ = new Circulo("Circulo", 6);

        // Retangulo
        ret.mostrarNome();
        ret.calcularArea();
        ret.calcularPerimetro();
        
        System.out.println("---------------------");

        // Circulo
        circ.mostrarNome();
        circ.calcularArea();
        circ.calcularPerimetro();
    }

}
