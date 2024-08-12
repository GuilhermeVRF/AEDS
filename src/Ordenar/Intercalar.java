/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenar;

/**
 *
 * @author Guilherme
 */
public class Intercalar {
    public static int[] ordenar(int[] v1, int[] v2){
        int[] vetorOrdenado = new int[v1.length + v2.length];
        int posV1 = 0;
        int posV2 = 0;
        
        for(int k = 0; k < vetorOrdenado.length;k++){
            if(posV1 == v1.length) vetorOrdenado[k] = v2[posV2++];
            else if(posV2 == v2.length) vetorOrdenado[k] = v1[posV1++];
            else if(v1[posV1] < v2[posV2]) vetorOrdenado[k] = v1[posV1++];
            else vetorOrdenado[k] = v2[posV2++];
        }
        
        return vetorOrdenado;
    }
}
