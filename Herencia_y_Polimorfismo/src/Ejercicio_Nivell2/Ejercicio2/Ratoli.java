package Ejercicio_Nivell2.Ejercicio2;

public class Ratoli extends Rossegador{
    public Ratoli(int medidas, String color, double peso) {
        super(medidas, color, peso);
    }

    @Override
    public void olor() {
        System.out.println("El olor del Raton variará según el contexto");
    }

    @Override
    public void mordisquear() {
        System.out.println("Los incisivos del raton tienden a ejercer una alta fuerza en proporción a su tamaño");
    }

    @Override
    public void correr() {
        System.out.println("El ratón es un animal muy rápido");
    }
}
