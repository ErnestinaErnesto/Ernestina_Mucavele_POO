/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividade2;

/**Docente: Maculuve, Cristalino
 * Discente: Mucavele, Ernestina Ernesto
 * @author Mucavele, Ernestina Ernesto
 */
public class Peixe extends Animal {
    private String caract;

    public Peixe(String nome, String caract, String ambiente, String cor) {
        super(ambiente, cor);
        this.nome = nome;
        this.caract = caract;
    }

    @Override
    public String toString() {
        return "Peixe{ "+"Nome: "+nome+", Caract: "+caract+", Ambiente: "+ambiente+", Cor: "+cor+'}';
    }
    
}
