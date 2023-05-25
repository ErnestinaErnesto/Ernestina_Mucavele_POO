package numero_3;

public class Homem extends Mamifero {
    private String profissao;

    public Homem(String nome, String cor, char sexo, String profissao) {
        super(nome, 2, cor, "Anda e Corre", sexo);
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Profissao: " + profissao;
    }
    
    
}
