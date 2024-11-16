import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int edad = 18;

        if (edad >= 18 && edad <= 60) {
            System.out.println("Puedes ingresar al bar");
        } else if (edad == 18) {
            System.out.println("Tienes 18 años, puedes ingresar al bar");
        } else if (edad > 60) {
            System.out.println("No puedes ingresar al bar, eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad, No puedes ingresar al bar");
        }

        // ¿Que tipo de bebida te gusta?

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Bienvenido a la encuesta?");
        System.out.println("¿Qué tipo de bebida te gusta?");
        System.out.println("1- Cerveza");
        System.out.println("2- Vino");
        System.out.println("3- Agua");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Te gusta la cerveza");
                break;
            case 2:
                System.out.println("Te gusta el vino");
                break;
            case 3:
                System.out.println("Te gusta la agua");
                break;
            default:
                System.out.println("No te gusta ninguna bebida");
                break;
        }

        System.out.println("Gracias por participar");
        scanner.close();
    }
}
