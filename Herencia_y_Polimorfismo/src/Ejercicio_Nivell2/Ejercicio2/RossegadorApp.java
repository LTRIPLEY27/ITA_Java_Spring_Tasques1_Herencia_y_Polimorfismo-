package Ejercicio_Nivell2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
/*
 * @uthor : Isabel Calzadilla
 * Ejercicio 2 Actividad 2
 * */
public class RossegadorApp {
    public static void main(String[] args){
        Hamster ham = new Hamster(35, "marrón", 2.500);
        Ratoli rat = new Ratoli(20, "gris", 200);
        Jerbu jerb = new Jerbu(15, "verde", 150);
        //DIFERENTES TIPOS DE COMPORTAMIENTOS DEL MISMO MÉTODO
        ham.mordisquear();
        rat.mordisquear();
        jerb.mordisquear();

        // ARRAYLIST DE OBJETOS ROEDOR

        List < Rossegador > roedor = new ArrayList<>();
        roedor.add(ham);
        roedor.add(rat);
        roedor.add(jerb);

        for(Rossegador rosi: roedor){
            if(rosi instanceof Hamster){
                System.out.println("Hamster\n");
                System.out.println(((Hamster) rosi).toString());
                ((Hamster) rosi).correr();
                ((Hamster) rosi).mordisquear();
                ((Hamster) rosi).olor();
                System.out.println("\n");
            } if(rosi instanceof  Ratoli){
                System.out.println("Ratoli\n");
                System.out.println(((Ratoli) rosi).toString());
                ((Ratoli) rosi).correr();
                ((Ratoli) rosi).mordisquear();
                ((Ratoli) rosi).olor();
                System.out.println("\n");
            } if(rosi instanceof  Jerbu){
                System.out.println("Jerbu\n");
                System.out.println(((Jerbu) rosi).toString());
                ((Jerbu) rosi).correr();
                ((Jerbu) rosi).mordisquear();
                ((Jerbu) rosi).olor();
                System.out.println("\n");
            }
        }
    }
}
