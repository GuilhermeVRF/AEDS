/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.BinaryTree;

/**
 *
 * @author Guilherme
 */
public class BinaryTreePossibilities {
    public static int getPossibilities(int nodeNumbers){
        return factorial(2 *nodeNumbers)/(factorial(nodeNumbers + 1) * factorial(nodeNumbers));
    }

    private static int factorial(int number){
        if(number == 1)
            return number;
        
        return number * factorial(number - 1);
    }
    
    public static void main(String args[]){
        System.out.println(getPossibilities(5));
    }
}
