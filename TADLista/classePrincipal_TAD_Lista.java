/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TADLista;

/**
 *
 * @author Ana Paula
 */
public class classePrincipal_TAD_Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pessoa P1 = new Pessoa();
    Pessoa P2 = new Pessoa();
    P2.setCPF("1");
    TAD_Lista lista = new TAD_Lista();
    
    System.out.println("Inserido: "+lista.inserirItem(P1));
    System.out.println("Inserido: "+lista.inserirItem(P2));
    System.out.println("Quantidade de elementos: "+ lista.getNAtualElementos());                                     
    System.out.println("Get: "+ lista.getItem(0));
    lista.inverteLista(0,99);
    System.out.println("Get: "+ lista.getItem(99));
    }
    
}
