import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String[][] calculadora = new String[9][6];
        calculadora[0] = new String[] {" _","_","_","_"};
        calculadora[1] = new String[] {"|_","_","_","_|"};
        calculadora[2] = new String[] {"|RC","PI","^","!|"};
        calculadora[3] = new String[] {"|AC","()","%","/|"};
        calculadora[4] = new String[] {"|7","8","9","*|"};
        calculadora[5] = new String[] {"|4","5","6","-|"};
        calculadora[6] = new String[] {"|1","2","3","+|"};
        calculadora[7] = new String[] {"|0",",","BORRAR","=|"};
        calculadora[8] = new String[] {"| _","_","_","_|"};

        for (int i = 0; i <= 8; i++) {
            System.out.print(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print(calculadora[i][j]);
                if (j != calculadora[i].length)
                    System.out.print("\t");
            }
            System.out.println(" ");
            lectura.close();
        }
    }
}