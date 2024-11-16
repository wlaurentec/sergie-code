public class Cadenas {
  public static void main(String[] args) throws Exception {

    String texto = "Cuando innovas, tienes que estar preparado para que la gente te diga que estás loco!";
    System.out.println(texto);

    int longitud = texto.length();
    System.out.println("La longitud es: " + longitud);

    char caracter = texto.charAt(0);
    System.out.println("El caracter es: " + caracter);

    String subcadena = texto.substring(0, 15);
    System.out.println("La subcadena es: " + subcadena);

    String textoMinuscula = texto.toLowerCase();
    System.out.println("El texto en minúsculas es: " + textoMinuscula);

    String textoMayuscula = texto.toUpperCase();
    System.out.println("El texto en mayúsculas es: " + textoMayuscula);

    int indice = texto.indexOf("innovas");
    System.out.println("El índice es: " + indice);

    String textoReemplazado = texto.replace("innovas", "ideas");
    System.out.println("El texto reemplazado es: " + textoReemplazado);

    boolean contiene = texto.contains("innovas");
    System.out.println("El texto contiene 'innovas': " + contiene);

    String[] palabras = texto.split(" ");
  /*   for (String palabra : palabras) {
        System.out.println("Palabra: " + palabra);
    } */

    System.out.println("Palabra en la posición 3: " + palabras[3]);

}
}
