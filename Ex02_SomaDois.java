import java.util.Scanner;

public class Ex02_SomaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.printf("A soma dos valores é %d", n1 + n2);
        scanner.close(); //Não sei o porquê disso.
    }
}
