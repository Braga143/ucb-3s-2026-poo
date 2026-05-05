package ucb.poo.abstracao;

/**
 *
 * @author samue
 */
public abstract class Forma {
    
    //atributos protegidos, pode ser acessado pelos filho através do super()
    protected String cor;
    protected double x;
    protected double y;
    
    //Método construtor
    public Forma(String pcor, double px, double py){
        this.cor = pcor;
        this.x = px;
        this.y = py;
    }
    
    //Método abstrato
    public abstract void calcularArea();
    
    //Método concreto
    public void mover(double px, double py){
        x += px;
        y += py;
    }

 
}
