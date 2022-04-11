//Cadastro de pessoas usando Maps.

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Ex05_CadastrandoPessoas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map Cadastrados = new HashMap();
        Map gaveta = new HashMap();
        String nome;

        while(true){
            System.out.print("Nome: ");
            nome = sc.next();
            if(nome.equals("0")){
                break;
            }
            System.out.print("CPF: ");
            gaveta.put("CPF", sc.nextDouble());
            System.out.print("Data de Nascimento: ");
            gaveta.put("Data de nascimento",sc.next());
            System.out.print("Endereço: ");
            gaveta.put("Endereço", sc.next());

            Cadastrados.put(nome, gaveta);
            gaveta.clear();
            sc.close();

        }
    }
}
//Código com problema. Precisa de aprofundamento em Maps.