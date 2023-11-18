/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplamenteEncadeada;

/**
 *
 * @author guilh
 */
public class ListaDuplamenteEncadeada<T> {

    private Item<T> primeiroItem;
    private Item<T> ultimoItem;
    private int size;

    public ListaDuplamenteEncadeada() {
        this.primeiroItem = null;
        this.ultimoItem = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addHead(T conteudo) {
        if (!this.inseriu_listaVazia(conteudo)) {
            Item<T> itemPushed = new Item(conteudo, this.primeiroItem);
            this.primeiroItem.setElementoAnterior(itemPushed);
            this.primeiroItem = itemPushed;
            this.size++;
        }
    }

    public void removeHead() {
        if (!this.isEmpty()) {
            this.primeiroItem = this.primeiroItem.getElementoPosterior();
            this.primeiroItem.setElementoAnterior(null);
            this.size--;
        }
    }

    public void addTail(T conteudo) {
        if (!this.inseriu_listaVazia(conteudo)) {
            Item<T> itemEnqueued = new Item(this.ultimoItem, conteudo);
            this.ultimoItem.setElementoPosterior(itemEnqueued);
            this.ultimoItem = itemEnqueued;
            this.size++;
        }
    }

    public void removeTail() {
        if (!this.isEmpty()) {
            this.ultimoItem.getElementoAnterior().setElementoPosterior(null);
            this.ultimoItem = this.ultimoItem.getElementoAnterior();
            this.size--;
        }
    }
    //Esse método usa o HashCode para inserir os elementos ordenadamente.
    public void addOrdenado(T conteudo) {
        if(!this.inseriu_listaVazia(conteudo)){
            Item<T> ponteiro = this.primeiroItem;

            while(conteudo.hashCode() > ponteiro.getConteudo().hashCode()){
                ponteiro = ponteiro.getElementoPosterior();
            }

            Item<T> novoItem = new Item(ponteiro.getElementoAnterior(), conteudo, ponteiro);
            if(ponteiro == this.primeiroItem){
                this.addHead(conteudo);
            }else if(ponteiro == this.ultimoItem){
                this.addTail(conteudo);
            }else{
                ponteiro.getElementoAnterior().setElementoPosterior(novoItem);
                ponteiro.setElementoAnterior(novoItem);
            }
        }    
    }

    public void add(int indice, T conteudo) {
        if (indice == 0) {
            this.addHead(conteudo);
        } else if (indice == this.size) {
            this.addTail(conteudo);
        } else {
            Item<T> ponteiro = this.getNo(indice);
            Item<T> itemAdded = new Item(ponteiro.getElementoAnterior(), conteudo, ponteiro);
            ponteiro.getElementoAnterior().setElementoPosterior(itemAdded);
            ponteiro.setElementoAnterior(itemAdded);
            this.size++;
        }
    }

    public void remove(int indice) {

        if (indice == 0) {
            this.removeHead(indice);
        } else if (indice == this.size - 1) {
            this.removeTail(indice);
        } else {
            this.validaIndice(indice);
            Item<T> ponteiro = this.getNo(indice);
            System.out.println(ponteiro.getElementoAnterior());
            ponteiro.getElementoAnterior().setElementoPosterior(ponteiro.getElementoPosterior());
            ponteiro.getElementoPosterior().setElementoAnterior(ponteiro.getElementoAnterior());
            this.size--;
        }

    }

    @Override
    public String toString() {
        String stringLista = "";

        if (!this.isEmpty()) {
            Item<T> ponteiro = this.primeiroItem;

            for (int posLista = 0; posLista < this.size; posLista++) {
                stringLista += posLista + " | " + ponteiro.getConteudo() + "\n";
                ponteiro = ponteiro.getElementoPosterior();
            }
        } else {
            stringLista = "Lista Vazia!";
        }
        return stringLista;
    }
  
    private boolean inseriu_listaVazia(T conteudo) {
        if (this.isEmpty()) {
            this.primeiroItem = new Item(conteudo);
            this.ultimoItem = this.primeiroItem;
            this.size++;
            return true;
        } else {
            return false;
        }
    }

    public Item<T> getNo(int indice) {
        this.validaIndice(indice);

        Item<T> ponteiro = this.primeiroItem;
        for (int posLista = 0; posLista < indice; posLista++) {
            ponteiro = ponteiro.getElementoPosterior();
        }
        return ponteiro;
    }

    private void validaIndice(int indice) {
        if (indice >= this.size || indice < 0) {
            throw new IndexOutOfBoundsException("Index: " + indice + " Size: " + this.size);
        }
    }

    private void removeHead(int indice) {
        this.validaIndice(indice);

        this.primeiroItem = this.primeiroItem.getElementoPosterior();
        if (this.primeiroItem != null) {
            this.primeiroItem.setElementoAnterior(null);
        }
        this.size--;
    }

    private void removeTail(int indice) {
        this.validaIndice(indice);

        this.ultimoItem = this.ultimoItem.getElementoAnterior();
        this.ultimoItem.setElementoPosterior(null);
        this.size--;
    }
}
