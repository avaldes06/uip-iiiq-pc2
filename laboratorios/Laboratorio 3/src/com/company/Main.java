package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        int nota;
        String nombre;
        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print(" Introduzca su nombre ");
            try {
                nombre = t1.readLine();
            } catch (IOException e) {
                nombre = "h";
            }
            if (nombre.matches(".*\\d+.*")) {
                System.out.println(" Tiene número en algún lugar ");
            }
        }while(nombre.matches(".*\\d+.*"));

        System.out.print(" Introduzca su nota ");

        try {
            nota = Integer.parseInt(t1.readLine());
        } catch (Exception e1) {
            System.out.println("Valor Inválido");
            nota = -1;
        }

        if (nombre.equals("h")) {
            System.out.println("Siga las Instrucciones");
        } else {
            System.out.println("Su nombre es: " + nombre);
        }

        if (nota > 0 && nota < 101) {
            if (nota > 90) {
                System.out.println("Su Calificación es: A");
            } else if (nota > 80) {
                System.out.println("Su Calificación es: B");
            } else if (nota > 70) {
                System.out.println("Su Calificación es: C");
            } else
                System.out.println("Usted ha reprobado la materia, Tiene F ");
            }else{
                System.out.println("Siga las Instrucciones para la calificacion");
            }
        }
    }






