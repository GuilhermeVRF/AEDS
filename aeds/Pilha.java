/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aeds;

/**
 *
 * @author 0057113
 */
public class Pilha {

    Item[] pilha;
    int qtdeAtualElementos;

    public Pilha() {
        this.pilha = new Item[10];
        this.qtdeAtualElementos = 0;
    }

    public void push(Item Item) {
        if (this.qtdeAtualElementos == this.pilha.length) {

        }
        this.pilha[this.qtdeAtualElementos++] = Item;        
    }
    public Item pop(){
        Item itemRemovido = this.pilha[--this.qtdeAtualElementos];
        this.pilha[this.qtdeAtualElementos] = null;
        
        return itemRemovido;
    }
}
