package Empresa;
public class Tecnico extends Empresa.Empleado{

    private String trabajar;

    public void mostrar(){
        System.out.println("Soy el tecnico.");

    }


    public String getTrabajar() {
        return trabajar;
    }

    public void setTrabajar(String trabajar) {
        this.trabajar = trabajar;
    }
}
