// Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.


import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero:");
        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            if (numero == 0) {
                System.out.println("El numero es cero");

            } else if (numero > 0) {
                System.out.println("El numero es positivo");
            }
        }
    }
}


