/*            -------------- EXERCICIO 1 --------------
                Escreva um programa que, com base em uma temperatura em graus celsius,
                a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
                seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
              -----------------------------------------
*/
package previousExercises;

import java.util.Scanner;

public class ex1 {

    public static double k(double temperatura){
        double k = temperatura + 273.15;
        return k;
    }

    public static double re(double temperatura){
        double re = temperatura * 0.8;
        return re;
    }

    public static double ra(double temperatura){
        double ra = temperatura * 1.8;
        return ra;
    }

    public static double f(double temperatura){
        double f = temperatura * 1.8 + 32;
        return f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em C°: ");
        double temperatura = scanner.nextDouble();

        System.out.println("A temperatura em Kelvin é: " + k(temperatura));
        System.out.println("A temperatura em Réaumur é: " + re(temperatura));
        System.out.println("A temperatura em Rankine é: " + re(temperatura));
        System.out.println("A temperatura em Fahrenheit é: " + f(temperatura));

        scanner.close();
    }
}
