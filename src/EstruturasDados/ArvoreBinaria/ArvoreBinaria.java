/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturasDados.ArvoreBinaria;

/**
 *
 * @author Guilherme
 * @param <E>
 */
public class ArvoreBinaria<E extends Comparable<E>>{
    private Item<E> raiz;
    private int size;
    
    public ArvoreBinaria(){
        this.raiz = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.size == 0;
    }
    
    public void add(E conteudo){
        if(this.isEmpty()){
            this.raiz = new Item<>(conteudo);
        }else{
            this.add(conteudo, this.raiz);
        }
        
        this.size++;
    }
    
    private void add(E conteudo, Item<E> noAtual){
        if(conteudo.compareTo(noAtual.getConteudo()) == -1){
            if(noAtual.getNoEsquerdo() == null){
                noAtual.setNoEsquerdo(new Item<>(conteudo));
            }else{
                this.add(conteudo, noAtual.getNoEsquerdo());
            }
        }else{
            if(noAtual.getNoDireito() == null){
                noAtual.setNoDireito(new Item<>(conteudo));
            }else{
                this.add(conteudo, noAtual.getNoDireito());
            }
        }
    }
    
    
    public void imprimirLista(){
        this.imprimirLista(this.raiz);
    }
    
    private void imprimirLista(Item<E> noAtual){      
        if(noAtual == null){
            return;
        }

        this.imprimirLista(noAtual.getNoEsquerdo());
        System.out.print(noAtual.toString());
        this.imprimirLista(noAtual.getNoDireito());
    }
}
