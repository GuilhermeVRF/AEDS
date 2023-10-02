
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ana Paula
 */
public class exibir_KmaiorOUmenor_elemento {
    public static void inserirDados_Vetor(int[] vetor, int indiceVetor, Random Aleatorio){
        if(indiceVetor == -1){
            return;
        }
        inserirDados_Vetor(vetor, indiceVetor - 1, Aleatorio);
        vetor[indiceVetor] = Aleatorio.nextInt(0,20);
    }
    public static void exibirVetor(int[] vetor, int indiceVetor){
        if(indiceVetor == -1){
            return;
        }
        exibirVetor(vetor, indiceVetor - 1);
        System.out.print(vetor[indiceVetor]+ " ");
    }
    public static int selectionSort(int[] vetor, int posMaior) {
        int maiorValor_Intervalo;
                
            for (int indiceInicio_Intervalo = 0; indiceInicio_Intervalo < vetor.length - 1; indiceInicio_Intervalo++) {
                maiorValor_Intervalo = vetor[indiceInicio_Intervalo];
                for (int pos_Vetor = indiceInicio_Intervalo + 1; pos_Vetor < vetor.length; pos_Vetor++) {
                    if (vetor[pos_Vetor] > maiorValor_Intervalo) {
                        vetor[indiceInicio_Intervalo] = vetor[pos_Vetor];
                        vetor[pos_Vetor] = maiorValor_Intervalo;
                        maiorValor_Intervalo = vetor[indiceInicio_Intervalo];
                    }
                }           
            }

        return vetor[posMaior - 1];
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random Aleatorio = new Random();
        Scanner Teclado = new Scanner(System.in);
        int[] vetor = {0,0,2,2,6,11,11,13,14,15};
        int K;
        String propriedadeFuncao;
        
        inserirDados_Vetor(vetor, vetor.length - 1, Aleatorio);
        System.out.print("Vetor: ");
        exibirVetor(vetor, vetor.length - 1);
        System.out.println();
        
        System.out.print("Deseja ver o K-Maior ou K-Menor elemento do vetor: ");
        propriedadeFuncao = Teclado.next();
        
        do{    
            System.out.print("Informe o K-enésimo  valor desejado do vetor: ");
            K = Teclado.nextInt();
        }while(K >= vetor.length || K < 0);
        
        
        switch(propriedadeFuncao){
            case "Maior":
                System.out.println(selectionSort(vetor,K));
            break; 
            
            case "Menor":
                K = (vetor.length - K) + 1;
                System.out.println(selectionSort(vetor,K));
            break;    
        }
        
    }
    
}
