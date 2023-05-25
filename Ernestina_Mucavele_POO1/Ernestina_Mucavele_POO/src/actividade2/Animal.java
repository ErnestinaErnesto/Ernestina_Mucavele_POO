/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividade2;

/**Docente: Maculuve, Cristalino
 * Discente: Mucavele, Ernestina Ernesto
 * @author Mucavele, Ernestina Ernesto
 */
public class Animal {
    protected String nome;
    protected int patas;
    protected String ambiente, cor;

    public Animal(String nome, int patas, String ambiente, String cor) {
        this.nome = nome;
        this.patas = patas;
        this.ambiente = ambiente;
        this.cor = cor;
    }

    public Animal(String ambiente) {
        this.ambiente = ambiente;
    }

    public Animal(String ambiente, String cor) {
        this.ambiente = ambiente;
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Animal{ "+"Nome: "+nome+", Ambiente: "+ambiente+", Cor: "+cor+", Patas: "+patas+'}';
    }
    
    
}

