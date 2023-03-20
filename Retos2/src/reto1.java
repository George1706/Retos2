import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String[] palabras = { "ibm", "sena", "rosa", "manzana", "danger", "jorge" };
        String palabra = palabras[(int) (Math.random() * palabras.length)]; // Selecciona una palabra al azar del
                                                                            // arreglo
        char[] letras = new char[palabra.length()]; // Arreglo para almacenar las letras adivinadas

        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_'; // Inicializa el arreglo con guiones bajos
        }

        int intentos = 6; // Número de intentos permitidos

        while (intentos > 0) {
            System.out.print("Palabra: ");
            for (int i = 0; i < letras.length; i++) {
                System.out.print(letras[i] + " ");
            }
            System.out.println("\nIntentos restantes: " + intentos);
            System.out.print("Ingrese una letra: ");
            char letra = lectura.next().charAt(0);
            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    letras[i] = letra; // Actualiza el arreglo de letras adivinadas
                    acierto = true;
                }
            }
            if (!acierto) {
                intentos--;
            }
            boolean palabraCompleta = true;
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == '_') {
                    palabraCompleta = false; // Si hay alguna letra no adivinada, la palabra no está completa
                }
            }
            if (palabraCompleta) {
                System.out.println("¡Felicidades, adivinaste la palabra!");
                System.out.println("La palabra era: " + palabra);
                return; // Sale del método main y termina el programa
            }
            lectura.close();
        }
        System.out.println("¡Oh no, perdiste! La palabra era: " + palabra);
    }
}