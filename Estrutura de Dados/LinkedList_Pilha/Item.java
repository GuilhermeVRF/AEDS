/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados.LinkedList_Pilha;

/**
 *
 * @author guilh
 */
class Item<G> {
    protected G dado;
    protected Item<G> proximoItem;
    
    public Item(G dado, Item<G> proximoItem){
        this.dado = dado;
        this.proximoItem = proximoItem;
    }
}
