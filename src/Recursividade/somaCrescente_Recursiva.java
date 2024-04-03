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
public class somaCrescente_Recursiva {

    public static int soma(int X){
        if(X == 1){
            return 1;
        }else{
            return X + soma(X - 1);
        }
    }
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Informe um número para a soma: ");
        int numSoma = Teclado.nextInt();
        System.out.println(soma(numSoma));
    }
    
}
