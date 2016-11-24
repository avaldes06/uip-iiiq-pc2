package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre, archivo1 = "ATTT.txt";
        double velocidades, multa=0,cv;


        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        nombre = br.readLine();
        System.out.print("Cantidad de Velocidades: ");
        cv = Integer.parseInt(br.readLine());

        try {
            File f1 = new File(archivo1);
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Problema de lectura-escritura");
        }


        FileWriter fw = new FileWriter(archivo1, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nombre);
        bw.newLine();
        bw.newLine();
        bw.flush();


        for (int i=1; i<(cv+1); i++) {
            System.out.print("Velocidad " + i + ":" );
            velocidades = Double.parseDouble(br.readLine());
            if(velocidades > 160){
                multa=multa+150;
            }else if(velocidades>120){
                multa=multa+50;
            }else if(velocidades>60){
                multa=multa+20;
            }else
                multa=multa+0;

            try {
                FileWriter fw1 = new FileWriter(archivo1, true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                bw1.write(Double.toString(velocidades)+ " kmh");
                bw1.newLine();
                bw1.flush();
            } catch (IOException e) {
                System.out.println("Problema de lectura-escritura");
            }
        }
        FileWriter fw2 = new FileWriter(archivo1, true);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.newLine();
        bw2.write(Double.toString(multa)+ " $");
        bw2.newLine();
        bw2.flush();




    }
}
