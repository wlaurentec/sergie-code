public class Variables {
    public static void main(String[] args) throws Exception {

        /* 
         * VARIABLES
         * Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
         * DECLARACIÓN
         * Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
         * DEFINICIÓN
         * Asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
         * ASIGNACIÓN
         * Darle un valor a la variable ya declarada
         */

         /* 
          * TIPOS DE VARIABLES
          Variables primitivas: Almacenan valores básicos
          Enteros: byte (-128 a 127), short (-32.768 a 32.767), int (-2.147.483.648 a 2.147.483.647), long (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
          Double: double (más grande)
          Float: float (más pequeño 6 dígitos)
          String: String
          Boolean: boolean
          Caracter: char

          Variables de referencia: Almacenan direcciones de memoria que apunta a objetos
          Variables no primitivas: Almacenan objetos
          Arrays: String[]
          Objetos: Object

          */


        // TIPO DE DATOS ENTEROS
        byte numero = 5; // Declaramos la variable
        // TIPO DE DATOS DECIMALES
        double decimales = 5.5524588455811446;
        float decimales1 = 5.552458845586f;

        // TIPO DE DATOS STRING
        char letra = 's';

        // TIPO DE DATOS BOOLEAN
        boolean verdadero = true;
        boolean falso = false;

        String cadena = "¿Eres una incubadora o aceleradora que busca transformar el futuro?";

        System.out.println("El número es: " + numero);
        System.out.println("El número es: " + decimales);
        System.out.println("El número es: " + decimales1);
        System.out.println("El letra es: " + letra);
        System.out.println("El verdadero es: " + verdadero);
        System.out.println("El falso es: " + falso);
        System.out.println("UTEC: " + cadena);



    }
}
