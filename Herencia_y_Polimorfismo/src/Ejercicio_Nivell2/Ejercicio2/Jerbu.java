package Ejercicio_Nivell2.Ejercicio2;

public class Jerbu extends Rossegador{
    public Jerbu(int medidas, String color, double peso) {
        super(medidas, color, peso);
    }

    @Override
    public void olor() {
        System.out.println("El olor del Jerbu es bastante fuerte");
    }

    @Override
    public void mordisquear() {
        System.out.println("El Jerbu es uno de los más mordisqueadores roedores");
    }

    @Override
    public void correr() {
        System.out.println("El Jerbu es bastante rápido");
    }
}
