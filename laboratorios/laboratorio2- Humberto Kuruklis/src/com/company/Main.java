package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        int cc;
        double d;
        double eur;
        int x=1;
        BufferedReader proyecto = new BufferedReader(new InputStreamReader(System.in));

       while(x==1) {
           System.out.print("Ingrese la cantidad de centavos: ");
           cc = Integer.parseInt(proyecto.readLine());
           if (cc < 0) {
               System.out.print("Ingrese la cantidad de centavos: ");
               cc = Integer.parseInt(proyecto.readLine());

               d = cc / 100.00;
               eur = d * 0.89;

               System.out.println("La cantidad de dolares es: $" + d);

               System.out.println("La cantidad de euros es: E" + eur);
           } else{
               d = cc / 100.00;
           eur = d * 0.89;

           System.out.println("La cantidad de dolares es: $" + d);

           System.out.println("La cantidad de euros es: E" + eur);
       }
           System.out.println("¿Desea continuar? si=1, no=0: ");
           x = Integer.parseInt(proyecto.readLine());
       }






    }
}
