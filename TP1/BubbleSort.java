/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1;

/**
 *
 * @author Ana Paula
 */
public class BubbleSort {

    public static void bubbleSort(int[] vetor){
        int aux;
        for(int i = 0;i < vetor.length;i++){
            for(int j = i + 1; j < vetor.length;j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] vetor = {2,10,3,8,6};
         
       bubbleSort(vetor);
        
        for (int i =0;i < vetor.length;i++){
            System.out.print(vetor[i]+ " ");
        }
    }
    
}
