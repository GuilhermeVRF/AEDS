/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividade;

/**
 *
 * @author guilh
 */
public class imprimeMaiorElementoVetor_Recursivo {
    public static int elementosVetor(int[] vetor, int qtdeElementos){  
        if(qtdeElementos == 0){ 
            return vetor[qtdeElementos];
        }
        int maior = elementosVetor(vetor, qtdeElementos -1);
        if(vetor[qtdeElementos] > maior){
            maior = vetor[qtdeElementos];
        }    
        return maior;
    }
   
    public static void main(String[] args) {
        int[] vetor = {10,13,1,4};
        System.out.println("Maior elemento: "+ elementosVetor(vetor, vetor.length - 1));     
        
    }
    
}
