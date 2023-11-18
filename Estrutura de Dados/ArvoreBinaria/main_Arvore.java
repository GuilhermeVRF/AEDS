/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArvoreBinaria;

import ArvoreBinaria.objectTeste.Conteudo;

/**
 *
 * @author guilh
 */
public class main_Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArvoreBinaria<Conteudo> arvBin = new ArvoreBinaria();
        arvBin.add(new Conteudo(10,"A"));
        arvBin.add(new Conteudo(10,"B"));
        arvBin.add(new Conteudo(10,"C"));
        arvBin.add(new Conteudo(11));
        arvBin.add(new Conteudo());
        Conteudo c1 = new Conteudo(10,"A");
        Conteudo c2 = new Conteudo(10,"A");
        System.out.println(c1.hashCode());
        System.out.println(c2.equals(c1));
        arvBin.inOrder();
    }
    
}
