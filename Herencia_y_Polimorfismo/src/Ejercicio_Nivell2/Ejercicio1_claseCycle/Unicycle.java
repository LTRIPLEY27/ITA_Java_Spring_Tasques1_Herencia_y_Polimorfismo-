package Ejercicio_Nivell2.Ejercicio1_claseCycle;

import Ejercicio_Nivell2.Ejercicio1_claseCycle.Cycle;

public class Unicycle extends Cycle {
    public Unicycle(int ruedas, String color, int velocidad) {
        super(ruedas, color, velocidad);
    }

    public void balance(){
        System.out.println("balance Unicycle = " + 8);
    }
}
