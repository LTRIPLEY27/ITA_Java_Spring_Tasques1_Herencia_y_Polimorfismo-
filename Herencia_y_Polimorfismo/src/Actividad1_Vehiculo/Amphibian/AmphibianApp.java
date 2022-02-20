package Actividad1_Vehiculo.Amphibian;

/*
* @uthor : Isabel Calzadilla
* Ejercicio 1 Actividad 1
* */
public class AmphibianApp {
        public static void main(String[] args) {
            Amphibian amp = new Frog(4, "verde");
            amp.comer();
            amp.mover();
            amp.respirar();
            //amp.saltar(); // MÉTODO QUE PRODUCE EL ERROR YA QUE NO SE PUEDE HACER USO DE LA GENERALIZACION
            //NO LLAMA A LOS NIEVOS MÉTODOS SOBREESCRITOS DE FROg
    }
}
