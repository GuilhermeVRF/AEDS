/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guilh
 * @param <G>
 */
public class LinkedLista<G> {
    private Item<G> lista;
    private int size;
    
    public LinkedLista(){
        this.lista = null;
        this.size = 0;
    }
    public Item<G> getPonteiro(){
        return this.lista;
    }
    //Esse método adiciona um item genérico ao topo da lista.
    public void insereTopo(G item){
        if(this.lista == null){
            this.lista = new Item(item,null);
        }else{
            Item<G> ponteiro= this.lista;
            this.lista= new Item(item,ponteiro);
        }
        size++;
    }
    //Esse método adiciona um iten genérico ao final da lista.
    public void insereFim(G item){
        if(this.lista== null){
            this.lista = new Item(item, null);
            System.out.println(this.lista.dado);
        }else{
        //Looping para encontrar o fim da lista.
        Item<G> ponteiro = this.lista;
            while(ponteiro.proximoElemento != null){
                ponteiro = ponteiro.proximoElemento;
            }
            ponteiro.proximoElemento = new Item(item,null);
        }
        size++;        
    }
    //Esse método adiciona itens na lista pré-ordenando eles.
    public void inserirOrdenado(G item){
            if(this.lista == null){
                this.lista = new Item(item,null);
            }else{
                Item<G> ponteiro = this.lista;
                Item<G> ponteiro_anterior = null;
                Item<G> novoItem = null;
                while(ponteiro.proximoElemento != null){
                    if(item.equals(ponteiro.dado)){
                        novoItem = new Item(item,ponteiro);
                        if(ponteiro_anterior != null){
                             ponteiro_anterior.proximoElemento = novoItem;
                        }     
                }
                    ponteiro_anterior = ponteiro;
                    ponteiro = ponteiro.proximoElemento;                
            }
                if(novoItem == null){
                    this.insereFim(item);
                }
             size++;
        }
    } 
    //Esse método remove um item genérico da lista com base na chave informada.
    public void remover(G chave){
        if(this.lista != null){
            Item<G> ponteiro= this.lista;
            Item<G> ponteiro_anterior = null;
            while(ponteiro != null){
                if(chave.equals(ponteiro.dado)){
                    if(ponteiro_anterior == null){
                        this.lista = ponteiro.proximoElemento;
                    }else{
                        ponteiro_anterior.proximoElemento = ponteiro.proximoElemento;
                        ponteiro = ponteiro_anterior;
                    }
                    size--;
                }
                ponteiro_anterior = ponteiro;
                ponteiro = ponteiro.proximoElemento;
            }
        }
    }
    //Esse método compara se duas lista são iguais.
    public boolean comparaListas(LinkedLista<G> listaComparavel){
        Item<G> ponteiro = this.lista;
        Item<G> ponteiro_listaComparavel = listaComparavel.lista; 
        while(ponteiro_listaComparavel != null && ponteiro != null){
            if(!ponteiro_listaComparavel.dado.equals(ponteiro.dado)){
                return false;
            }
            ponteiro_listaComparavel = ponteiro_listaComparavel.proximoElemento;
            ponteiro = ponteiro.proximoElemento;
        }
        return true;
    }
    //Esse método imprime a lista
    public String imprimirLista(Item<G> ponteiro, String lista, int indice){
        if(ponteiro == null){
            return lista;
        }    
        lista += indice+ "°- " + ponteiro.dado+ "\n"; 
        return imprimirLista(ponteiro.proximoElemento,lista,indice + 1);
    }
    //Esse método junta 2 diferentes listas do memsmo tipo.
    public void juntarListas(LinkedLista<G> listaJuntar){
        Item<G> ponteiro = this.lista;
        while(ponteiro.proximoElemento != null){
            ponteiro = ponteiro.proximoElemento;
        }
        ponteiro.proximoElemento = listaJuntar.lista;
    }
}
