import java.util.Scanner;

//creamos la clase publica
public class reto4 {

    // creamos el metodo main
    public static void main(String[] args) {
        String codigo, nombre, precio;

        String[][] maquinaProductos = new String[4][4];

        // instanciamos la clase Scanner
        Scanner lectura = new Scanner(System.in);

        // se crea un ciclo o bucle donde vamos a introducir datos
        // for para las filas
        for (int i = 0; i < 4; i++) {
            // for para las columnas
            for (int j = 0; j < 4; j++) {

                System.out.println("por favor ingrese el codigo de la " + i + " " + j);

                maquinaProductos[i][0] = lectura.nextLine();

                System.out.println("ingrese el precio de la " + i + " " + j);
                maquinaProductos[i][1] = lectura.nextLine();

                System.out.println("ingrese el nombre de la " + i + " " + j);
                maquinaProductos[i][2] = lectura.nextLine();
            }
        }
        // imprimimos un mensaje donde se le mostrara al usuario el catalogo de la
        // maquina
        System.out.println("CATALOGO");

        // se crea otro ciclo o bucle este es para imprimir
        // for para las filas
        for (int i = 0; i < 4; i++) {
            // for para las columnas
            for (int j = 0; j < 4; j++) {

                codigo = maquinaProductos[i][0];
                precio = maquinaProductos[i][1];
                nombre = maquinaProductos[i][2];

                System.out.println(codigo + "-" + precio + "-" + nombre);
            }
            System.out.println();
            lectura.close();
        }
    }
}