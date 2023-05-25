package numero_3;

import java.util.List;
import java.util.ArrayList;

public class numero_3 {

    public static void main(String[] args) {
        List<Cachorro> listaCachorro = new ArrayList<Cachorro>();
        List<Homem> listaHomem = new ArrayList<Homem>();
        List<Beija_Flor> listaBeijaFlor = new ArrayList<Beija_Flor>();
        
        listaCachorro.add(new Cachorro("Kika", "Branco", 'F', "Malttez"));
        listaCachorro.add(new Cachorro("Spike", "Branco", 'F', "Maltez"));
        listaCachorro.add(new Cachorro("Jack", "Preto e Castanho", 'M', "Pastor Alemao"));
        
        listaHomem.add(new Homem("Ernestina", "Castanho Claro", 'F', "Estudante"));
        listaHomem.add(new Homem("Pop Smoke", "Dark Skin", 'M', "King Of New York"));
        
        listaBeijaFlor.add(new Beija_Flor("Mikasa", "Vermelha", 'F', "Eren Yeager"));
        
        System.out.println("LISTA DOS CACHORROS");
        for (Cachorro cr : listaCachorro) {
            System.out.println(cr);
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DOS HOMENS");
        for(int i = 0; i < listaHomem.size(); i++) {
            System.out.println(listaHomem.get(i));
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DE BEIJA - FLORES");
        for(Beija_Flor bf : listaBeijaFlor) {
            System.out.println(bf);
        }
        
        Tarefa.gravarObjecto(listaCachorro, "Cachorro.dat");
        Tarefa.gravarObjecto(listaHomem, "Homem.dat");
        Tarefa.gravarObjecto(listaBeijaFlor, "Beija_Flor.dat");
        
        List<Cachorro> objC = (List<Cachorro>) Tarefa.recuperarObjecto("Cachorro.dat");
        List<Homem> objH = (List<Homem>) Tarefa.recuperarObjecto("Homem.dat");
        List<Beija_Flor> objBf = (List<Beija_Flor>) Tarefa.recuperarObjecto("Beija_Flor.dat");
        
       System.out.println("LISTA DOS CACHORROS");
        for (Cachorro cr : objC) {
            System.out.println(cr);
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DOS HOMENS");
        for(int i = 0; i < objH.size(); i++) {
            System.out.println(objH.get(i));
        }
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------\nLISTA DE BEIJA - FLORES");
        for(Beija_Flor bf : objBf) {
            System.out.println(bf);
        }
    }
    
}
