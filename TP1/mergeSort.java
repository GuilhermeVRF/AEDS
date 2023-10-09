/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1;

/**
 *
 * @author Ana Paula
 */
public class mergeSort {

    public static void mergeSort(int[] vetor, int esquerda, int direita){
        int meio = (esquerda + direita)/2;
        //Quando o meio valer 1, quer dizer que a lista tem somente 1 elemento e está ordenada.
        if(meio == 1){
            return;
        }
        //Pedindo para ordenar a metade esquerda do vertor
        mergeSort(vetor, esquerda, meio);
        //Pedindo para ordenar a metade direita do vetor
        mergeSort(vetor, meio + 1, direita);
        //Juntar o lado esquerdo ordenado com o lado direito ordenado
        merge(vetor,esquerda,meio,direita);
    }
    public static void merge(int vetor[], int esquerda, int meio, int direita){
       int tam_e = meio - esquerda + 1;
       int tam_d = direita - meio + 1;
       
       int vetor_esquerda[] = new int[tam_e];
       int vetor_direita[] = new int[tam_d];
       for(int pos_e = 0; pos_e <= meio; pos_e++){
        vetor_esquerda[pos_e] = vetor[pos_e];
       }
       
       for(int pos_d = 0; pos_d <= direita;pos_d++){
           vetor[pos_d] = vetor[++meio];
       }
       
       int topo_esquerda = 0, topo_direita = 0;
       for(int pos_vetor = 0;pos_vetor < vetor.length;pos_vetor++){
        if(topo_esquerda >= meio){
            vetor[pos_vetor] = vetor_direita[topo_direita];
            topo_direita++;
        }else if(topo_direita >= direita){
            vetor[pos_vetor] = vetor_esquerda[topo_esquerda];
        }else if(vetor_esquerda[topo_esquerda] < vetor_direita[topo_direita]){
            vetor[pos_vetor] = vetor_esquerda[topo_esquerda];
            topo_esquerda++;
        }else{
            vetor[pos_vetor] = vetor_direita[topo_direita];
        }
       }
    }
    public static void main(String[] args) {
        int[] vetor = {4,2,1,3};
        mergeSort(vetor,0,vetor.length - 1);
        for(int i = 0; i < 4;i++){
            System.out.print(vetor[i]);
        }
    }
    
}
