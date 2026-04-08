
package ucb.estudo.formas_geometricas;

/**
 *
 * @author walis
 */

//Aqui nós temos a Classe Pai
public class FormaGeometrica {
    private String nome;

    //Metodo Construtor
    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    //Metodo para mostrar o nome da forma
    public void mostrarNome() {
        System.out.println("Forma geometrica: " + nome);
    }
}
