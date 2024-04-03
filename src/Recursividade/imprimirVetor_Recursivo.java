/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividade;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class imprimirVetor_Recursivo {
    public static void imprimeVetor(int[] vetor, int n){
        if(n < 0){
            return ;
        }else{
            imprimeVetor(vetor,n-1);
            System.out.print(vetor[n]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] v = {3,8,7};
        imprimeVetor(v,v.length - 1);
    }
    
}
