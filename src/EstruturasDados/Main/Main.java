/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDados.Main;

import EstruturasDados.Catalogo.Catalog;
import EstruturasDados.Catalogo.Data;
import java.util.Random;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Random random = new Random();
        
        for(int i = 0; i < 10; i++){
            catalog.add(new Data("Conteudo "+ i, random.nextInt(0, 20)));
        }
        
        catalog.inOrder();
        System.out.println("---------------");
        catalog.removeAnteriorRegisters(10);
        catalog.inOrder();
    }
 }
