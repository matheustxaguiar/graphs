/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaografo;

import java.util.ArrayList;

/**
 *
 * @author Matheus Aguiar
 */
public class Vertice <T> {
    private T valor;
    private ArrayList<Aresta> destinos;

    public Vertice(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public ArrayList<Aresta> getDestinos() {
        return destinos;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public void setDestinos(ArrayList<Aresta> destinos) {
        this.destinos = destinos;
    }

    void setDestino(Aresta aresta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
