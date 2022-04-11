//Exercicio que o usuário escolherá valores para serem mostrados na tela.

import java.util.Scanner;

public class Ex06_FunçãodeContar {
    public static void Contador(int i, int f, int s){
        if (i > f) {
            for (; i >= f; i += s) {
                System.out.print(i + " ");
            }
        }
        else if (i < f){
            for (; i <= f; i += s){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){

        System.out.print("Inicio: ");
        int inicio = new Scanner(System.in).nextInt();
        System.out.print("Fim: ");
        int fim = new Scanner(System.in).nextInt();
        System.out.print("Frequência: ");
        int freq = new Scanner(System.in).nextInt();

        Contador(inicio, fim, freq);

    }
}
