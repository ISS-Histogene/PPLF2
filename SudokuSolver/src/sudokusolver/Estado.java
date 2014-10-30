/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public class Estado {
    private Celula[][] matriz;
    private ArrayList<Posicao> blankcells;
    private Estado estadoanterior;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Celula[][] matriz) {
        this.matriz = matriz;
    }

    public ArrayList<Posicao> getBlankcells() {
        return blankcells;
    }

    public void setBlankcells(ArrayList<Posicao> blankcells) {
        this.blankcells = blankcells;
    }

    public Estado getEstadoanterior() {
        return estadoanterior;
    }

    public void setEstadoanterior(Estado estadoanterior) {
        this.estadoanterior = estadoanterior;
    }

    public Estado(Celula[][] matriz, ArrayList<Posicao> blankcells, Estado estadoanterior, int valor) {
        this.matriz = matriz;
        this.blankcells = blankcells;
        this.estadoanterior = estadoanterior;
        this.valor = valor;
    }
    
    
    
}
