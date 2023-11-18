/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaCircular;

/**
 *
 * @author guilh
 */
public class main_ListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular<String> lc = new ListaCircular();
        
        lc.addTail("0");
        lc.removeTail();
        System.out.println(lc.stringByTail());
    }
    
}
