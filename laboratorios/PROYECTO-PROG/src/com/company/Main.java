package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        String nombre = null;
        double cantidad, mascota;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre de la mascota: ");
        try {
            nombre = (br.readLine());
        } catch (IOException e) {
            System.out.println("Dato invalido");
        }

        System.out.print("DIGITE: \n1 PARA PERRO \n2 PARA GATO ");
        mascota = Double.parseDouble(br.readLine());
        System.out.print("Cantidad de acciondes de la mascota: ");
        cantidad = Double.parseDouble(br.readLine());

        if (mascota == 1) {
            System.out.print("DIGITE: \n1 PARA LADRAR\n2 PARA COMER\n3 PARA CORRER\n");
            Perro p1 = new Perro();
            for (int i = 0; i <= cantidad; i++) {
                double accion = 0;
                int x = 0;
                System.out.print("Accion que realizara el perro: ");
                x = Integer.parseInt(br.readLine());
                switch (x) {
                    case 1:
                        accion = 1;
                        p1.ladrar(2);
                        System.out.println("Los puntos de vida actual son:" + p1.getPuntos_vida());
                        break;
                    case 2:
                        accion = 2;
                        p1.comer(10);
                        System.out.println("Los puntos de vida actual son:" + p1.getPuntos_vida());
                        break;
                    case 3:
                        accion = 3;
                        p1.correr(15);
                        System.out.println("Los puntos de vida actual son:" + p1.getPuntos_vida());
                        break;
                    default:
                        break;
                }
                if (p1.getPuntos_vida() <= 0) {
                    System.out.println(nombre +  " murio");
                    i=(int)cantidad+1;
                }
            }



        } else if(mascota==2);
        System.out.print("DIGITE: \n1 PARA COMER\n2 PARA CAMINAR\n3 PARA DORMIR\n");
        Gato g1 = new Gato();
        for (int z = 0; z <= cantidad; z++) {
            double accion = 0;
            int y = 0;
            System.out.print("Accion que realizara el gato: ");
            y = Integer.parseInt(br.readLine());
            switch (y) {
                case 1:
                    accion = 1;
                    g1.comer(5);
                    System.out.println("Los puntos de vida actual son:" + g1.getPuntos_vida());
                    break;
                case 2:
                    accion = 2;
                    g1.caminar(5);
                    System.out.println("Los puntos de vida actual son:" + g1.getPuntos_vida());
                    break;
                case 3:
                    accion = 3;
                    g1.dormir(2);
                    System.out.println("Los puntos de vida actual son:" + g1.getPuntos_vida());
                    break;
                default:
                    break;
            }
            if (g1.getPuntos_vida() <= 0) {
                System.out.println(nombre +  " murio");
                z=(int)cantidad+1;
            }
        }

    }
}
