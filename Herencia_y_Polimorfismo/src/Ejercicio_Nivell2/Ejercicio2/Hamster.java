package Ejercicio_Nivell2.Ejercicio2;

public class Hamster extends Rossegador{
    public Hamster(int medidas, String color, double peso) {
        super(medidas, color, peso);
    }

    @Override
    public void olor() {
        System.out.println("El olor de los Hamster, variará según su peso ");
    }

    @Override
    public void mordisquear() {
        System.out.println("El Hamster es uno de los menos mordisqueadores");
    }

    @Override
    public void correr() {
        System.out.println("El Hamster es bastante más lento a los roedores más pequeños");
    }

}
