/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados.LinkedLista_Circular;

/**
 *
 * @author guilh
 */
public class LinkedList_Circular<G>{
    Item<G> lista;
    Item<G> fimLista;
    int size;
    
    public LinkedList_Circular(){
        this.lista = null;
        this.fimLista = null;
        this.size = 0;
    }
    public void inserirTopo(G item){
        if(this.lista == null){
            this.lista = new Item(item, null);
            this.lista.proximoElemento = this.lista;
            this.fimLista = this.lista;
        }else{
            this.lista = new Item(item, this.lista);
            this.fimLista.proximoElemento = this.lista;
        }
    }

    public void inserirFinal(G elemento){
        if(this.lista == null){
            this.lista = new Item(elemento, null);
            this.lista.proximoElemento = this.lista;
            this.fimLista = this.lista;
        }else{
            this.fimLista.proximoElemento = new Item(elemento, this.lista);
            this.fimLista = this.fimLista.proximoElemento;
        }
    }
    
    public void inserirApos(G elementoAdicionar, G elementoAnterior){
        if(this.lista == null){
            this.inserirTopo(elementoAdicionar);
        }else{
            Item<G> ponteiro = buscarChave(elementoAnterior);
            if(ponteiro != null){
                ponteiro.proximoElemento= new Item(elementoAdicionar, ponteiro.proximoElemento);
            }else{
                this.inserirFinal(elementoAdicionar);
            }          
        }
    }
    
    public void inserirAntes(G elementoAdicionar, G elementoSucessor){
        if(this.lista == null){
            this.inserirTopo(elementoAdicionar);
        }else{
            Item<G> ponteiro = this.buscarAntecessor_chave(elementoSucessor, this.lista);
            if(ponteiro != null){
                if(ponteiro.proximoElemento == this.lista){
                    this.lista = new Item(elementoAdicionar, this.lista);
                    ponteiro.proximoElemento = this.lista;
                }else{
                    ponteiro.proximoElemento = new Item(elementoAdicionar, ponteiro.proximoElemento);
                }          
            }else{
                this.inserirFinal(elementoAdicionar);
            }
        }
    }
    
    public void removerTopo(){
        if(this.lista != null){
            this.lista = this.lista.proximoElemento;
            this.fimLista.proximoElemento = this.lista;
            size--;
        }
    }
    
    
    public Item<G> buscarChave(G chave){
        if(this.lista == null){
            return null;
        }else{
            return this.buscarRecursivamente(chave, this.lista);
        }
    }   
    
    public void imprimirLista(){
        if(this.lista != null){
            this.imprimirRecursivamente(this.lista, 0);
        }
    }
    
    /*Funções recursivas necessitam de parâmetros. Para um usuário que usar a minha classe, isso não é interessante
    Sendo assim criei uma função publica de imprimirLista, que chama uma privado que irá já passar os parâmetros e impirmir recursivamente.*/
    private void imprimirRecursivamente(Item<G> ponteiro, int indice){        
        System.out.println((indice + 1) + "° - " + ponteiro.elemento);
        
        if(ponteiro.proximoElemento == this.lista){
            return;
        }       
        this.imprimirRecursivamente(ponteiro.proximoElemento, indice + 1);            
    }
  
    /*Esse método faz o trabalho recursivo de buscar um Item na lista pela chave informada.
    Crie esse private buscarRecursivamente para que o usuário de minha classe não necessite informar parâmetros para a recursividade.*/
    private Item<G> buscarRecursivamente(G chave, Item<G> ponteiro){
        if(ponteiro.elemento == chave){
            return ponteiro;
        }     
        if(ponteiro.proximoElemento == this.lista){
            return null;
        }      
        return buscarRecursivamente(chave, ponteiro.proximoElemento);
    }
    
    //Esse método me retorna o elemento antecessor ao informado por uma chave. É privado pois só é útil dentro da classe.
    private Item<G> buscarAntecessor_chave(G chave, Item<G> ponteiro){
        if(ponteiro.proximoElemento.elemento == chave){
            return ponteiro;
        }   
        if(ponteiro.proximoElemento == this.lista){
            return null;
        }
        return this.buscarAntecessor_chave(chave, ponteiro.proximoElemento);
    }
    
    
}
