/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaografo;

/**
 *
 * @author Matheus Aguiar
 */
public class Aresta<T> {
    private Vertice destino;
    private float peso;    

    public Aresta(Vertice destino, float peso) {
        this.destino = destino;
        this.peso = peso;
    }


    public Vertice getDestino() {
        return destino;
    }

    public float getPeso() {
        return peso;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
