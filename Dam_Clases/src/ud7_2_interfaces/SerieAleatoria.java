/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD7_2_Interfaces;

/**
 *
 * @author Juan Carlos
 */
public class SerieAleatoria implements ISerie {

    private int numero;
    private int numeroInicial;

    public SerieAleatoria() {
    }

    public SerieAleatoria(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroInicial() {
        return numeroInicial;
    }

    public void setNumeroInicial(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    @Override
    public int getSiguiente() {
        this.numero = (int)(Math.random()*100);
        return this.numero;
    }

    @Override
    public void reiniciar() {
        this.numero = this.numeroInicial;
    }

    @Override
    public void setComenzar(int x) {
        this.numeroInicial =x;
        this.numero =x;
    }

}
