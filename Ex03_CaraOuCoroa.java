//O que era pra ser um simples jogo de cara ou coroa...

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Ex03_CaraOuCoroa {
    public static void main(String[] args) {
        String op = "s";
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("CARA");
        opcoes.add("COROA");

        System.out.println("=== CARA ou COROA ===");

        while (Objects.equals(op, "s")) {
            System.out.println("1- CARA\n2- COROA");
            int escolha = (new Scanner(System.in).nextInt()) - 1;
            int jogada = new Random().nextInt(2);
            if (escolha == jogada) {
                System.out.printf("Você venceu. Deu %s\n", opcoes.get(jogada));
            } else {
                System.out.printf("Você perdeu. Deu %s\n", opcoes.get(jogada));
            }
            System.out.println("Você gostaria de continuar ?");
            op = new Scanner(System.in).next();
        }System.out.println("Programa encerrado.");
    }
}
