package com.company;
/**
 * Created by Abraham on 11/14/2016.
 */

public class Perro {
    private double puntos_vida = 50;

    public double ladrar(double ladro){
        this.setPuntos_vida(getPuntos_vida() -ladro);
        return this.getPuntos_vida();
    }
    public double comer(double comio){
        this.setPuntos_vida(getPuntos_vida() +comio);
        return this.getPuntos_vida();
    }
    public double correr(double corrio){
        this.setPuntos_vida(getPuntos_vida() -corrio);
        return this.getPuntos_vida();
    }

    public double getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(double puntos_vida) {
        this.puntos_vida = puntos_vida;
    }
}

