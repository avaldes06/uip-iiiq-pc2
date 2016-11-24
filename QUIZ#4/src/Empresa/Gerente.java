package Empresa;

public class Gerente extends Empresa.Empleado {

    private String Mandar;

    public void Nivel(){
        System.out.println("Nivel 3.");

    }
    public void Mostrar(){
        System.out.println("Soy el gerente.");

    }

    public String getMandar() {
        return Mandar;
    }

    public void setMandar(String mandar) {
        Mandar = mandar;
    }
}

