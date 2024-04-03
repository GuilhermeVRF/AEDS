/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividade;

import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class DecomporNumero {
    private static void decompor(int num){
        ArrayList<Integer> numeroDecomposto = new ArrayList<>();
        numeroDecomposto.add(num);
        
        decompor(numeroDecomposto);
    }
    
    private static void decompor(ArrayList<Integer> numeroDecomposto){            
        if(numeroDecomposto.get(0) - 1 < 1)
            return;
        
        if(numeroDecomposto.get(0) > 1){
            numeroDecomposto.set(0, numeroDecomposto.get(0) - 1);
            if(numeroDecomposto.size() > 1){
                numeroDecomposto.set(1, numeroDecomposto.get(1) + 1);
            }else{
                numeroDecomposto.add(1);
            }
        }
        
        ArrayList<Integer> copia = new ArrayList<>(numeroDecomposto);
        decompor(numeroDecomposto);
       
        decomporLinha(copia, 0);
          
    }
    
    private static void decomporLinha(ArrayList<Integer> numeroDecomposto, int pos){      
        
        if(pos == numeroDecomposto.size()){
            return;
        }
        
        if(numeroDecomposto.get(pos) > 1){
            System.out.println(numeroDecomposto.toString().replaceAll(", ", " + "));
            numeroDecomposto.set(pos, numeroDecomposto.get(pos) - 1);
            
            //A partir de um ponto a decomposição exibe valores já decomposto, mas de diferentes formas
            if((pos > 0 && numeroDecomposto.get(pos - 1) >= 1) && (pos == numeroDecomposto.size() - 1 || numeroDecomposto.get(pos + 1) == 1)){
                numeroDecomposto.add(1);
            }else if(++pos < numeroDecomposto.size()){//Tirando 1 e passando para o próximo
                numeroDecomposto.set(pos, numeroDecomposto.get(pos) + 1);  
             }else{//Adiciona 1 caso tire da posição atual, e não de para setar a próxima              
                numeroDecomposto.add(1);
            }
            
            decomporLinha(numeroDecomposto, pos);
        }
    }
    
    public static void main(String[] args){
        decompor(10);
    }
}
