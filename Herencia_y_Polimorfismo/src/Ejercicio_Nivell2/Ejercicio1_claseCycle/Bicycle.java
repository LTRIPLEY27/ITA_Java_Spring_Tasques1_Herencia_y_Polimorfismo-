package Ejercicio_Nivell2.Ejercicio1_claseCycle;

public class Bicycle extends Cycle {
    public Bicycle(int ruedas, String color, int velocidad) {
        super(ruedas, color, velocidad);
    }

    public void balance(){
        System.out.println("balance Bicycle = " + 16);
    }
}
