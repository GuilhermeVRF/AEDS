/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturaDeDados.LinkedList_Pilha;

/**
 *
 * @author guilh
 */
public class classePrincipal_PilhaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaEncadeada<String> Pilha= new PilhaEncadeada();
        Pilha.empilhar("Google.com");
        Pilha.empilhar("Amazon.com");
        System.out.println(Pilha.desempilhar());
    }
    
}
