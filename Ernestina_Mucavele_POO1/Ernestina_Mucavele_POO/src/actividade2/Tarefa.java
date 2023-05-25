/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividade2;

/**Docente: Maculuve, Cristalino
 * Discente: Mucavele, Ernestina Ernesto
 * @author Mucavele, Ernestina Ernesto
 */
import java.io.*;
import java.util.StringTokenizer;
public class Tarefa {
    public static void lerMamifero () {
        StringTokenizer str;
        String cadaLinha="", nome, ambiente, cor, patas, ordem;
        try {
            FileReader fr = new FileReader ("Mamifero.txt");
            BufferedReader br = new BufferedReader (fr);
            cadaLinha = br.readLine();
            while (cadaLinha != null) {
                str = new StringTokenizer (cadaLinha, ";");
                nome = str.nextToken();
                ambiente = str.nextToken();
                cor = str.nextToken();
                patas = str.nextToken();
                ordem = str.nextToken();
                System.out.println("Nome: "+nome+", Ambiente: "+ambiente+", Cor: "+cor+", Patas: "+patas+", Ordem: "+ordem);
                cadaLinha = br.readLine();
            }
            br.close();
        }
        catch (FileNotFoundException fn) {
            System.out.println(fn.getMessage());
        }
        catch (NumberFormatException | IOException nn) {
            System.out.println(nn.getMessage());
        }
    }
    
    public static void lerPeixe () {
        StringTokenizer str;
        String cadaLinha="", nome, caract, ambiente, cor;
        try {
            FileReader fr = new FileReader ("Peixe.txt");
            BufferedReader br = new BufferedReader (fr);
            cadaLinha = br.readLine();
            while (cadaLinha != null) {
                str = new StringTokenizer (cadaLinha, ";");
                nome = str.nextToken();
                caract = str.nextToken();
                ambiente = str.nextToken();
                cor = str.nextToken();
                System.out.println("Nome: "+nome+", Caract: "+caract+", Ambiente: "+ambiente+", Cor: "+cor);
                cadaLinha = br.readLine();
            }
            br.close();
        }
        catch (FileNotFoundException fn) {
            System.out.println(fn.getMessage());
        }
        catch (NumberFormatException | IOException nn) {
            System.out.println(nn.getMessage());
        }
    }
}
