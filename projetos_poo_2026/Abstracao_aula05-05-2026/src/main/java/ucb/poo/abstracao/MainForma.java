package ucb.poo.abstracao;
public class MainForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Forma formac = new Circulo("Cinza", 1, 2, 3.0);
        formac.calcularArea();
        
        Forma formar = new Retangulo("Preta", 0, 0);
        formar.calcularArea();
        
        Retangulo r = new Retangulo("Azul", 0, 0);
        r.setComprimento(10);
        r.setLargura(20);
        r.calcularArea();
    }
    
}
