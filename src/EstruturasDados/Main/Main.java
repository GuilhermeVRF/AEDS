/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDados.Main;

import EstruturasDados.ArvoreBinaria.ArvoreBinaria;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvBin = new ArvoreBinaria<>();
        arvBin.add(3);
        arvBin.add(1);
        arvBin.add(5);
        arvBin.add(0);
        arvBin.add(4);
        arvBin.add(7);
        arvBin.add(-2);
        
        arvBin.imprimirLista();
    }
    
}
