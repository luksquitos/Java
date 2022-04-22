//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
// Em seguidam mostrar os dados do funcionário(nome e salário líquido).
// Em seguida aumentar o salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetado pela porcentagem)
// e mostrar novamente os dados do funcionário.

class Funcionario{
    public String nome;
    public double salario_b;
    public double imposto;

    public String toString(){
        return "Nome: " + nome + ", Salário líquido: " + salario_b * (imposto / 100);
    }

    public double aumento(double taxa){
        return salario_b * (taxa / 100 + 1);
    }
}

public class Ex09_DadosDeUmFuncionario {
    public static void main(String[] args){
        Funcionario jorge = new Funcionario();
        jorge.nome = "Jorge Cegatine";
        jorge.salario_b = 1200.00;
        jorge.imposto = 12.5;

        System.out.println(jorge.aumento(14));
        System.out.println(jorge);


    }
}
