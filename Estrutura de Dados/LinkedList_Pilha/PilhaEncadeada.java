/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados.LinkedList_Pilha;

/**
 *
 * @author guilh
 */
public class PilhaEncadeada<G> {

    private Item<G> lista;
    private int size;

    public PilhaEncadeada() {
        this.lista = null;
        this.size = 0;
    }
    //Esse m�todo insere itens no in�cio da Pilha, para assim facilitar a remo��o.
    public void empilhar(G item) {
        if (this.lista == null) {
            this.lista = new Item(item, null);
        } else {
            Item<G> ponteiro = this.lista;
            this.lista = new Item(item, ponteiro);
        }
        this.size++;
    }
    //Esse m�todo remove o primeiro item da Lista, pois foi o �ltimo a entrar.
    public G desempilhar() {
        if (this.lista == null) {
            return null;
        } else {
            G itemDesempilhado = this.lista.dado;
            this.lista = this.lista.proximoItem;
            this.size--;
            return itemDesempilhado;
        }
    }
    //Esse m�todo retorna o tamanho da Pilha encadeada.
    public int getSize() {
        return this.size;
    }
    //Esse m�todo retorna se a Pilha encadeada est� vazia.
    public boolean estaVazia(){
        return this.size == 0;
}
}
