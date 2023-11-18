/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplamenteEncadeada;


/**
 *
 * @author guilh
 */
public class main_ListaDuplamenteEncadeada {
    public static void main(String[] args){
        ListaDuplamenteEncadeada<Integer> L1 = new ListaDuplamenteEncadeada<>();
        L1.addOrdenado(10);
        L1.addOrdenado(9);
        L1.addOrdenado(8);
        L1.addOrdenado(7);
        L1.addOrdenado(6);
        L1.addOrdenado(5);
        
        System.out.println(L1);
        
        ListaDuplamenteEncadeada<String> L2 = new ListaDuplamenteEncadeada<>();
        L2.addOrdenado("F");
        L2.addOrdenado("E");
        L2.addOrdenado("D");
        L2.addOrdenado("C");
        L2.addOrdenado("B");
        L2.addOrdenado("A");
        
        System.out.println(L2);
    }
    
}
