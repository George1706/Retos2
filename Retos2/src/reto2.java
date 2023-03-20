import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        String nombre, palabra;
        char[] vector;
        int izquierda = 0, derecha;
        Scanner lectura = new Scanner(System.in);
        {
            System.out.println("Bienvenido, Este programa te va a yudar a saber si la palabra es un palindromo o no");
            System.out.println("Ingrese su nombre: ");
            nombre = lectura.nextLine();
            System.out.println("Por favor ingrese la palabra");
            palabra = lectura.next();
            vector = palabra.toCharArray();
            /* Usamos el length para que podamos leer todos los valores */
            derecha = vector.length - 1;
            /*
             * hacemos uso de el ciclo while para asignarle la condicion que si izquierda es
             * menor que derecha abra un IF con otra condicion y sigamos con la condicional
             * hasta terminar con unos break para que el sistema se demore un segundo en
             * mostrar o madar a la otra condicion
             */
            while (izquierda < derecha) {
                if (vector[izquierda] == vector[derecha]) {
                    derecha--;
                    izquierda++;
                } else {
                    System.out.println("querido usuario:" + nombre + ", la palabra " + palabra + " no es un palindromo");
                    break;
                }
            }
            if (izquierda == derecha) {
                System.out.println("querido usuario:" + nombre + ", la palabra " + palabra + " es un palindromo ");
            }
            System.out.println("!GRACIAS POR USAR EL PROGRAMA¡");
            lectura.close();
        }
    }
}
