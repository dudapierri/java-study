/*            -------------- EXERCICIO 2 --------------
                Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
                a. a maior e a menor altura do grupo;
                b. média de altura dos homens;
                c. o número de mulheres.
              -----------------------------------------
*/
package previousExercises;

import java.util.ArrayList;
import java.util.Random;

public class ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> alturaHomens = new ArrayList<>();
        ArrayList<Integer> alturaMulheres = new ArrayList<>();
        ArrayList<Integer> todasAlturas = new ArrayList<>();
        int contMulheres = 0;
        int menorAltura = 210;
        double maiorAltura = 0;
        double media = 0;

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = (random.nextInt(211 - 130) + 130);
            int numeroSexo = random.nextInt(2);
            if (numeroSexo == 1){
                contMulheres++;
                alturaMulheres.add(numeroAleatorio);
                todasAlturas.add(numeroAleatorio);
            }else{
                alturaHomens.add(numeroAleatorio);
                todasAlturas.add(numeroAleatorio);
            }
        }
        for (int i = 0; i < todasAlturas.size(); i++) {
            if(todasAlturas.get(i) > maiorAltura){
                maiorAltura = todasAlturas.get(i);
            } else if (todasAlturas.get(i) < menorAltura){
                menorAltura = todasAlturas.get(i);
            }
        }

        for (int i = 0; i < alturaHomens.size(); i++) {
            media += alturaHomens.get(i);
        }
        double mediaHomens = media / alturaHomens.size();
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("O número de mulheres foi: " + contMulheres);
        System.out.println("A média de altura dos homens foi de: " + mediaHomens);

    }


}
