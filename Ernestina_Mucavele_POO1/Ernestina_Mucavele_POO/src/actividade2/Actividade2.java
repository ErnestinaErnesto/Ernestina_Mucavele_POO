/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividade2;

/**Docente: Maculuve, Cristalino
 * Discente: Mucavele, Ernestina Ernesto
 * @author Mucavele, Ernestina Ernesto
 */
import java.io.*;
public class Actividade2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        BufferedReader x = new BufferedReader (new InputStreamReader (System.in));
        byte op=0;
        System.out.println("Docente: Maculuve, Cristalino\n"
                + "\nDiscente: Mucavele, Ernestina Ernesto\n"
                + "Eng. Informatica Laboral (FEng)\n"
                + "--------------------------Inicio do Programa------------------------------\n"
                + "Escolha o que deseja ver:\n"
                + "Prime 1 para ver Animais.\n"
                + "Prime 2 para ver Mamiferos.\n"
                + "Prime 3 para ver Peixes.");
        try {
        op = Byte.parseByte(x.readLine()); }
        catch (IOException z){
                System.out.println(z.getMessage());
                }
        switch (op) {
            case 1:
                Tarefa.lerMamifero();
                Tarefa.lerPeixe(); break;
            case 2:
                Tarefa.lerMamifero(); break;
            case 3:
                Tarefa.lerPeixe(); break;
            default: System.out.println("Opcao invalida!"); break;
        } 
        
        
    }
    
}
