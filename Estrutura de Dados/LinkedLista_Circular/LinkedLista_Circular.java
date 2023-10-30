/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados.LinkedLista_Circular;

/**
 *
 * @author guilh
 */
public class LinkedLista_Circular<G> {
    Item<G> lista;
    int size;
    
    public LinkedLista_Circular(){
        this.lista = null;
        this.size = 0;
    }
    
    public void inserirTopo(G elemento){
        if(this.lista == null){
            this.lista = new Item(elemento, null);
        }else{
            Item<G> ponteiro = this.lista;
            this.lista = new Item(elemento, ponteiro);
        }
    }
    
    public void inserirFinal(G elemento, Item<G> ponteiro){
        if(ponteiro.proximoElemento == this.lista){
            ponteiro.proximoElemento = new Item(elemento, this.lista);
        }else{
            inserirFinal(elemento, ponteiro.proximoElemento);
        }
    }
    
    public boolean buscar(G elemento,Item<G> ponteiro){
        if(ponteiro.proximoElemento == this.lista){
            return false;
        }
        if(ponteiro.elemento == elemento){
            return true;
        }
        return buscar(elemento, ponteiro.proximoElemento);
    }
}
