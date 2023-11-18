/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaEncadeada;

/**
 *
 * @author guilh
 */
public class main_ListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.add("Guilherme");
        listaEncadeada.add("Luís Gustavo");
        System.out.println(listaEncadeada.size());
        listaEncadeada.add("Wander",2);
        System.out.println(listaEncadeada.get(3));
    }
    
}
