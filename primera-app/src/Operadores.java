public class Operadores {

  public static void main(String[] args) throws Exception {
    
    // Operadores aritmeticos
    double a = 10.0;
    double b = 3.0;
    double c = a / b;
    System.out.println(c);

    
    int x = 13;
    int y = 2;
    int z = x % y; // Resto para saber si un número es par
    System.out.println(z);

    // Asignación
    int num = 10;
    num = num + 1;
    num += 1;
    num++;
    num--;
    num *= 2;
    num /= 3;

    System.out.println(num);

    // Operadores de comparación
    int num1 = 10;
    int num2 = 20;
    boolean esIgual = num1 == num2;
    boolean esDistinto = num1 != num2;
    boolean esMayor = num1 > num2;
    boolean esMenor = num1 < num2;
    boolean esMayorIgual = num1 >= num2;
    boolean esMenorIgual = num1 <= num2;

    System.out.println(esIgual);
    System.out.println(esDistinto);
    System.out.println(esMayor);
    System.out.println(esMenor);
    System.out.println(esMayorIgual);
    System.out.println(esMenorIgual);


    // Operadores lógicos
    boolean condicion1 = true;
    boolean condicion2 = false;
    boolean resultadoAND = condicion1 && condicion2; // AND
    boolean resultadoOR = condicion1 || condicion2; // OR
    boolean resultadoNOT = !condicion1; // NOT

    System.out.println(resultadoAND);
    System.out.println(resultadoOR);
    System.out.println(resultadoNOT);

    // Tabla de la verdad

    /* 
     * TRUE && TRUE = TRUE
     * TRUE && FALSE = FALSE
     * FALSE && TRUE = FALSE
     * FALSE && FALSE = FALSE
     */


  }   
}
