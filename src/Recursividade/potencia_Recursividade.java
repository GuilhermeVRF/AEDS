/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursividade;

/**
 *
 * @author guilh
 */
public class potencia_Recursividade {
    public static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
    public static void main(String[] args) {
        System.out.println(potencia(3,3));
    }
    
}
