/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividade2;

/**Docente: Maculuve, Cristalino
 * Discente: Mucavele, Ernestina Ernesto
 * @author Mucavele, Ernestina Ernesto
 */
public class Mamifero extends Animal {
    private String ordem;

    public Mamifero(String ordem, String nome, int patas, String ambiente, String cor) {
        super(ambiente);
        this.ordem = ordem;
        this.nome = nome;
        this.patas = patas;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Mamifero{ "+"Nome: "+nome+", Ambiente: "+ambiente+", Cor: "+cor+", Patas: "+patas+", Ordem: "+ordem+'}';
    }
    
}
