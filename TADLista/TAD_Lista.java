package TADLista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ana Paula
 */
public class TAD_Lista {
    //Definindo um tamanho CONSTANTE para a minha lista
    final private int tamanhoMax = 100;
    private int nAtualElementos;
    //Criando a lista que armazenará os MÚLTIPLOS dados
    private Pessoa[] lista;
    
    public TAD_Lista(){
        this.lista = new Pessoa[tamanhoMax];
        this.nAtualElementos = 0;
    }
    public int getNAtualElementos(){
        return this.nAtualElementos;
    }
    public int getTamanho(){
        return tamanhoMax;
    }
    public void setNAtualElementos(int qtdeAtual){
        this.nAtualElementos = qtdeAtual;
    }
    //Esse método pega a variável this.lista (array) e muda a sua referência de memória, criando assim um array "vazio".
    public boolean apagarLista(){
        this.lista = new Pessoa[this.getTamanho()];
        return true;
    }
    //Esse método adiciona os itens em fila.
    public boolean inserirItem(Pessoa P){
        boolean inseriu = false;
        if(this.getNAtualElementos() < this.getTamanho() && this.lista[this.getNAtualElementos()] == null){
                this.lista[this.getNAtualElementos()] = P;
                this.setNAtualElementos(this.getNAtualElementos() + 1);
                inseriu = true;
        }
        return inseriu;
    }
    //Esse método adiciona um item com base em uma posição informada.
    public boolean inserirItem(Pessoa P, int pos){
        if(this.lista[pos] == null){
            this.lista[pos] = P;
            this.setNAtualElementos(this.getNAtualElementos() + 1);
            return true;
        }else{
            return false;
        }
    }
    //Esse método remove um Item com base na chave informada.
    public boolean removerItem(String chave){
        int posRemover = buscarItem(chave, this.getNAtualElementos() - 1, -1);
        if(posRemover != -1){
            this.lista[posRemover] = null;
            this.setNAtualElementos(this.getNAtualElementos() - 1);
            return true;
        }else{
            return false;
        }
    }
    //Esse método remove um Item com base na posição informada.
    public boolean removerItem(int posItem){
        if(posItem < this.getTamanho() && this.lista[posItem] != null){
            this.lista[posItem] = null;
            this.setNAtualElementos(this.getNAtualElementos() - 1);
            return true;
        }else{
            return false;
        }
    }
    //Esse método retorna o item armazenado na posição "posItem" ou null caso essa posição não exista.
    public Pessoa getItem(int posItem){
        if(posItem < this.getTamanho() && this.lista[posItem] != null){
            return this.lista[posItem];
        }else{
            return null;
        }
    }
    //Esse método inverte a posição dos elementos da Lista. Os primeiros serão os últimos, e os últimos serão os primeiros.
    public void inverteLista(int posInicial, int posFinal){
        if(posInicial >= posFinal){
            return;
        }
        
        inverteLista(posInicial + 1, posFinal - 1);
        Pessoa aux = this.lista[posInicial];
        this.lista[posInicial] = this.lista[posFinal];
        this.lista[posFinal] = aux;
    }
    //Esse método retorna um item armazenado na lista com base na chave informada ou null caso o item não seja encontrado.
    public Pessoa getItem(String chave){
        int posItem = buscarItem(chave, this.getTamanho() - 1, -1);
        if(posItem != -1){
            return this.lista[posItem];
        }else{
            return null;
        }
    }
    //Esse método me retorne TRUE se a lista estiver vazia, e FALSE caso não.
    public boolean estaVazia(){
        return (this.getNAtualElementos() == 0);
    }
    //Esse método busca um item na Lista com base em uma chave e retorna a posição do item na lista, ou -1 caso não encontre
    public int buscarItem(String chave, int indice, int posItem){
        if(indice == -1){
            return posItem;
        }      
        if(this.lista[indice] != null){
            if(this.lista[indice].getCPF().equals(chave)){  
                return indice;
            }
        }
        return buscarItem(chave, indice - 1, posItem);
    }
}