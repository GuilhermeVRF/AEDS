/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividade;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Guilherme
 */
public class DecomposiçãoNumero {
    public static String decomporNumero(int num){
        ArrayList<Integer> numeroDecomposto = new ArrayList<>();
        numeroDecomposto.add(num);
        
        return decomporNumero(numeroDecomposto, "");
    }
    
    private static String decomporNumero(ArrayList<Integer> numeroDecomposto , String saida){
        System.out.println(numeroDecomposto.toString().replaceAll(", ", " + "));
        
        if(numeroDecomposto.get(0) == 1){
            return saida;
        }
               
        decomporLinha(numeroDecomposto, numeroDecomposto.size());
        
        return decomporNumero(numeroDecomposto, saida);      
    }
    
    private static void decomporLinha(ArrayList<Integer> numeroDecomposto, int tamanhoArray){
        int index = 0;
        if(tamanhoArray == 1){// Apenas 1 elemento
            numeroDecomposto.set(index, numeroDecomposto.get(index) - 1);
            numeroDecomposto.add(1);
        }else if(numeroDecomposto.get(1) > 1){// 2 já definido
            numeroDecomposto.set(1, numeroDecomposto.get(1) - 1);
            numeroDecomposto.add(1);
            index = 1;
        }else{
            numeroDecomposto.set(0, numeroDecomposto.get(0) - 1);
            if(tamanhoArray > 2) // Define o 2
                numeroDecomposto.add(1);
            else    
                numeroDecomposto.set(1, numeroDecomposto.get(1) + 1);
        }
    }
    
    public static void main(String[] args){
        decomporNumero(20);
    }
}
