package TP1;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ana Paula
 */
public class vetor_BlocoDeNotas {

    public static void vetorCrescente(int[] v){
        for(int i = 0;i < v.length;i++){
            v[i] = i;
        }
    }
    
    public static void vetorDecrescente(int[]v){
        int j = 0;
        for(int i = v.length - 1; i >= 0;i--){
            v[j++] = i;
        }
    }
    
    public static void vetorAleatorio(int[] vetor, Random Aleatorio){
        int numero;
        boolean igual;
        for(int i = 0; i < vetor.length;i++){
            numero = Aleatorio.nextInt(0,100);
            do{
                igual = false;
                for(int j = i; j >= 0; j--){
                    if(numero == vetor[j]){
                    igual = true;   
                    numero = Aleatorio.nextInt(0,100);
                    break;
                    }
                }    
                }while(igual);
                vetor[i] = numero;
        }
    }
    
    public static void imprimeVetor (int[] v, int indice, PrintStream PS){
        for(int i = 0;i <= indice;i++){
            PS.print(v[i]+", ");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        int[] vetor = new int[10];
        PrintStream PS = new PrintStream("teste.txt");
        Random Aleatorio = new Random(1);
        long tempoInicio = System.currentTimeMillis();
        vetorAleatorio(vetor,Aleatorio);
        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo execução: "+ ((tempoFim - tempoInicio) / 1000));        
        imprimeVetor(vetor, vetor.length - 1, PS);
    }
    
}
