//Faça um programa para ler a cotação do dolar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
// Informar quantos reais a pessoa vai pagar pelos dólares, considerando que a pessoa terá que pagar 6% de IOF sobre o
// valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.

import java.util.Scanner;

class CurrencyConverter{
    static final double COTACAO = 5.01;
    static final double IOF = 1.06;

    static void converter(double valor){
        double reais = COTACAO * valor * IOF;
        System.out.printf("Amount to be paid in reais: %.2f", reais);
    }
}

public class Ex11_CotacaoDolar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String pessoa = sc.nextLine();
        System.out.println("Okay "+ pessoa +". How many dollar will be bought ?");
        CurrencyConverter.converter(sc.nextDouble());

        sc.close();
    }
}
