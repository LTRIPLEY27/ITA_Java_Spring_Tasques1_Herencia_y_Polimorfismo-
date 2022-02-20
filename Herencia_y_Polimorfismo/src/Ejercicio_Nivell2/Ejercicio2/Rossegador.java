package Ejercicio_Nivell2.Ejercicio2;

public abstract class Rossegador {//CLASE PADRE
    private int medidas;
    private String color;
    private double peso;

    public  Rossegador(int medidas, String color, double peso){
        this.medidas = medidas;
        this.color = color;
        this.peso = peso;
    }

    //LOS MÉTODOS DECLARADOS EN UNA CLASE ABSTRACTA OBLIGAN A LAS SUBCLASES QUE LES HEREDEN A SER SOBREESCRITOS E IMPLEMENTADOS
    public abstract void olor();
    public abstract void mordisquear();
    public abstract void correr();

    @Override
    public String toString() {
        return "Rossegador{" +
                "medidas=" + medidas +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
