package com.company;

/**
 * Created by Abraham on 11/14/2016.
 */
public class Gato {
    private double puntos_vida = 30;

    public double dormir(double durmio){
        this.setPuntos_vida(getPuntos_vida() +durmio);
        return this.getPuntos_vida();
    }
    public double comer(double comio){
        this.setPuntos_vida(getPuntos_vida() +comio);
        return this.getPuntos_vida();
    }
    public double caminar(double camino){
        this.setPuntos_vida(getPuntos_vida() -camino);
        return this.getPuntos_vida();
    }

    public double getPuntos_vida() {
        return puntos_vida;
    }

    public void setPuntos_vida(double puntos_vida) {
        this.puntos_vida = puntos_vida;
    }
}
