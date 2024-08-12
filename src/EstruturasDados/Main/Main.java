/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstruturasDados.Main;

import EstruturasDados.BinaryTree.BinaryTree;
import EstruturasDados.BinaryTree.BinaryTreeManipulator;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree<Integer> arvBin = new BinaryTree<>();
        arvBin.add(10);
        arvBin.add(8);
        arvBin.add(15);
        arvBin.add(12);
        arvBin.add(16);
        
        BinaryTree<Integer> subTree = new BinaryTree<>();
        subTree.add(15);
        subTree.add(12);
        subTree.add(16);
        
        System.out.println(BinaryTreeManipulator.isSubTree(arvBin, subTree));
    }
 }
