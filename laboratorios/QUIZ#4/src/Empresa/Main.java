package Empresa;

import Empresa.Gerente;
import Empresa.Tecnico;

public class Main {

    public static void main(String[] args) {



        System.out.print("Tecnico:");

        Empleado e1= new Empleado();
        e1.Nombre();
        e1.Salario();
        e1.Departamento();
        Tecnico t1= new Tecnico();
        t1.mostrar();
        t1.setTrabajar("Yo trabajo");
        System.out.println(t1.getTrabajar());



        System.out.print("\nGerente:");

        Empleado e2= new Empleado();
        e2.Nombre();
        e2.Salario();
        e2.Departamento();
        Gerente g1= new Gerente();
        g1.mostrar();
        g1.Nivel();
        g1.setMandar("Yo Mando");
        System.out.println(g1.getMandar());







    }
}
