//Fazer um programa para ler o nome de um aluno e as três nota que obteve nos três trimestres do ano (primeiro trimestre
// vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual nota final do aluno no ano. Dizer também se o
// aluno está aprovado(PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para
// ser aprovado ( que é 60% da nota). Você deve criar uma classe Student para resolver este problema.

class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    private boolean cadastro = false;

    public Student(String name){
        this.nome = name;
    }

    public boolean cadastrarNotas(double n1, double n2, double n3){
        if(n1 > 30 || n2 > 35 || n3 > 35){
            return false;
        }else{
            this.nota1 = n1;
            this.nota2 = n2;
            this.nota3 = n3;
            this.cadastro = true;
            return true;
        }
    }

    public String notaFinal(){
        if(cadastro){
            double notaFinal = (nota1 + nota2 + nota3) / 3;
            double minimoAprovacao = (double)(100 / 3) * 0.6;
            boolean aprovacao = (notaFinal >= minimoAprovacao);
            if(aprovacao){
                return "PASS. Média: " + notaFinal;
            }else{
                return "FAILED: Faltam " + (minimoAprovacao - notaFinal) + "pontos";
            }
        }else{
            return "As notas não foram informadas ou estão incorretas.";
        }
    }
}

public class Ex10_NotasDeAlunos {
    public static void main(String[] args){
        Student carlinhos = new Student("Carlos");
        carlinhos.cadastrarNotas(30, 31, 30);

        System.out.println(carlinhos.notaFinal());
    }
}
