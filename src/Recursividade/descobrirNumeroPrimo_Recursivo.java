/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividade;

/**
 *
 * @author guilh
 */
public class descobrirNumeroPrimo_Recursivo {
    public static int descobrirNumeroPrimo(int numPrimo, int numDivisao){
        if(numDivisao == numPrimo){
            return 1;
        }
        int contDivisao = descobrirNumeroPrimo(numPrimo, numDivisao + 1);
        
        if(numPrimo % numDivisao == 0){
            contDivisao++;
        }
        return contDivisao;
    }
    public static void main(String[] args) {
        if(descobrirNumeroPrimo(22,1) == 2){
            System.out.println("É um número primo!");
        }else{
            System.out.println("Não é um número primo!");
        }
    }
    
}
