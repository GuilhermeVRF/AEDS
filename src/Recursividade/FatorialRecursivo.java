/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrdenarDados;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class FatorialRecursivo {

    public static double fatorial(double n){
        if(n==0){
            return 1;
        }
        return n * fatorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.print("Informe o número para o fatorial: ");
        double numeroFatorial = Teclado.nextDouble();
        
        
        System.out.print("Resultado da fatorial: "+ fatorial(numeroFatorial));
    }
    
}
