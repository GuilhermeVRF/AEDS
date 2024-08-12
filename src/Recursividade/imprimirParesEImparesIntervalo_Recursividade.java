/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividade;

/**
 *
 * @author guilh
 */
public class imprimirParesEImparesIntervalo_Recursividade {
    public static String imprimirPar_Impar(int minimo, int maximo){
        if(maximo == (minimo - 1)){
            return "Números pares:\nNúmeros impares:";
        }
        String cadeia = imprimirPar_Impar(minimo,maximo -1);
        if(maximo % 2 == 0){
            String cadeiaPar[] = cadeia.split("\n");
            cadeiaPar[0] += maximo + " ";
            cadeia = cadeiaPar[0] + "\n" + cadeiaPar[1];
        }else{
            String cadeiaImpar[] = cadeia.split("\n");
            cadeiaImpar[1] += maximo + " ";
            cadeia = cadeiaImpar[0] + "\n" + cadeiaImpar[1];
        }
        
        return cadeia;
    }
   
    public static void main(String[] args) {
        System.out.println(imprimirPar_Impar(1,7));

    } 
}
