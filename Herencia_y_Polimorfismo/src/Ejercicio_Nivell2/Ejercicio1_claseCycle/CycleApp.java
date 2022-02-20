package Ejercicio_Nivell2.Ejercicio1_claseCycle;

import java.util.ArrayList;
import java.util.List;

public class CycleApp {
    public static void main(String[] args){

        Cycle cic = new Unicycle(1, "yellow", 4);
        Cycle cicl = new Bicycle(2, "red", 45);
        Cycle cicle = new Tricycle(3, "blue", 80);

        //IMPRESION POR GENERALIZACION
        System.out.println(cic.toString()); //instancia de unicycle
        System.out.println(cicl.toString());//instancia de bicycle
        System.out.println(cicle.toString());//instancia de tricycle

        //LLAMADO AL MÉTODO ESTÁTICO CON EL OBJETO DEL TIPO CYCLE COMO PARÁMETRO
        ride(cicle);

        //LLAMADO AL MÉTODO WHEELS CON IMPRESION DE LAS RUEDAS
        cicl.wheels();

        List <Cycle> cicles = new ArrayList<Cycle>();
        cicles.add(cic);
        cicles.add(cicl);
        cicles.add(cicle);

        for(Cycle cile : cicles){//|| cile instanceof Bicycle
            if(cile instanceof Unicycle ){
                System.out.println(2);
                ((Unicycle) cile).balance();
           } if(cile instanceof  Bicycle){
                System.out.println(1);
                ((Bicycle) cile).balance();
            } else{
                System.out.println(cile.toString());
            }
        }
    }

    public static void ride(Cycle cicle){
        System.out.println("Impresión de la instancia enviada como parámetros");
        System.out.println(cicle.toString());
    }
}
