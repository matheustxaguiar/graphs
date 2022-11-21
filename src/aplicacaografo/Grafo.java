/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaografo;

import java.util.ArrayList;

/**
 *
 * @author Matheus Aguiar
 *
 */
public class Grafo<T> {
    private ArrayList <Vertice<T>> vertices;
    //new ArrayList<Vertice<T>>();

    public Grafo() {
        this.vertices = new ArrayList<Vertice<T>>();
    }


    public Vertice<T> adicionarVertice(T valor){
        Vertice<T> novo = new Vertice<T>(valor);
        this.vertices.add(novo);
        return novo;
    }
 
    private Vertice obterVertice(T valor){
        Vertice v;
        for(int i=0; i<this.vertices.size();i++){
            v=this.vertices.get(i);
            if(v.getValor().equals(valor))
                return v;
        }
        return null;
    }
    
    public void adicionarAresta(T origem, T destino, float peso){
        Vertice verticeOrigem, verticeDestino;
        
        verticeOrigem = obterVertice(origem);
        if (verticeOrigem == null)
            verticeOrigem = adicionarVertice(origem);
        verticeDestino = obterVertice(destino);
        
        if (verticeDestino == null)
            verticeDestino = adicionarVertice(destino);
        verticeOrigem.setDestino(new Aresta(verticeDestino, peso));
    }

    
    public void buscaEmLargura(){
        ArrayList<Vertice> marcados = new ArrayList<Vertice>();
        ArrayList<Vertice> fila = new ArrayList<Vertice>();
        Vertice atual=this.vertices.get(0);
        fila.add(atual);

        while (fila.size()>0){
            atual = fila.get(0);
            fila.remove(0);
            marcados.add(atual);
            System.out.println(atual.getValor());
            ArrayList<Aresta> destinos = atual.getDestinos();;
            Vertice proximo;
            for (int i=0; i<destinos.size();i++){
                proximo=destinos.get(i).getDestino();
                if(!marcados.contains(proximo)){
                    fila.add(proximo);
                }
            }   
        }    
    }

}


