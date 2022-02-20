package Ejercicio_Nivell2.Ejercicio1_claseCycle;

public class Cycle {
    private int ruedas;
    private String color;
    private int velocidad;

    public Cycle(int ruedas, String color, int velocidad){
        this.ruedas = ruedas;
        this.color = color;
        this.velocidad = velocidad;
    }

    //MÉTODO WHEELS

    public void wheels(){
        System.out.println(this.ruedas);
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "ruedas=" + ruedas +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
