/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenar;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class MergeSort {
    public static ArrayList<Double> mergeSort(ArrayList<Double> lista){
        ArrayList<Double> novaLista = new ArrayList<>();
        mergeSort(lista, novaLista,0, lista.size() - 1);
        
        return novaLista;
    }
    
    private static void mergeSort(ArrayList<Double> lista, ArrayList<Double> novaLista, int esq, int dir){
        if(esq == dir){
            return;
        }
        
        int meio = (esq + dir)/2;
        mergeSort(lista, novaLista, esq, meio);
        mergeSort(lista, novaLista, meio + 1, dir);
        mergeIntercala(lista, esq, meio, dir);
    }
    
    private static void mergeIntercala(ArrayList<Double> lista, int esq, int meio, int dir){
        ArrayList<Double> listaEsq = new ArrayList<>();
        ArrayList<Double> listaDir = new ArrayList<>();
        int lengthEsq = meio - esq + 1;
        int lengthDir = dir - meio;
        
        int posEsq, posDir;
        
        for(posEsq = 0; posEsq < lengthEsq; posEsq++)
            listaEsq.add(lista.get(esq + posEsq));
        
        for(posDir = 0; posDir< lengthDir;posDir++)
            listaDir.add(lista.get(meio + posDir + 1));
        
        posEsq = 0;
        posDir = 0;

        for(int posVetor = esq; posVetor <= dir;posVetor++){
            if(posEsq == listaEsq.size()) 
                lista.set(posVetor, listaDir.get(posDir++));
            else if(posDir == listaDir.size()) 
                lista.set(posVetor, listaEsq.get(posEsq++));
            else if(listaEsq.get(posEsq) < listaDir.get(posDir)) 
                lista.set(posVetor, listaEsq.get(posEsq++));
            else 
                lista.set(posVetor, listaEsq.get(posDir++));
        }
    }
}