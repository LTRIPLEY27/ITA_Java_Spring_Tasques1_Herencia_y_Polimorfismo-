package Ejercicio_Nivell3.UpcastingClass;

public class Anomedada {
    public Anomedada(){}

    public void metodo1(){
        metodo2();
    }

    public void metodo2(){
        System.out.println("Método invocado");
    }
}
