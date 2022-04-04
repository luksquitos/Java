//Recebendo valores do usuário e modificando valores em Arrays usando for loops.

import static java.lang.Math.pow;
import java.util.Scanner;

public class Ex04_ModificandoValoresEmArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5]; // Apenas 5 valores.
        int soma = 0;
        boolean lerUsuario = true;

        System.out.println("Digite 5 valores");


        for (int i = 0; i <= valores.length; i++) {
            if (i == valores.length && lerUsuario) {
                i = 0;
                lerUsuario = false;
            }if (lerUsuario){
                valores[i] = scanner.nextInt();
            }else{
                if (i == 5){
                    System.out.println("");
                    continue;
                }
                valores[i] = (int) pow(valores[i], 2); // Valor será elevado ao quadrado
                System.out.print(valores[i] + " ");
                soma += valores[i];

            }
        }
        System.out.printf("A soma dos valores deu %d", soma);

    }
}