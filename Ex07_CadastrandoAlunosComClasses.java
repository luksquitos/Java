import java.util.ArrayList;

class Estudante {
    public String nome;
    public int idade;
    public double nota;

    public Estudante(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota; //Valores entre 0 e 10.
    }
}

class Curso {
    private String nome;
    public int max_alunos;
    private ArrayList<Estudante> cadastrados;
    public Curso(String nome, int max_alunos){
        this.nome = nome;
        this.max_alunos = max_alunos;
        this.cadastrados = new ArrayList<Estudante>();
    }
    public ArrayList<Estudante> retorna_lista() {
        return this.cadastrados;
    }
    public boolean cadastrar_aluno(Estudante aluno){
        if(retorna_lista().size() < this.max_alunos){
            retorna_lista().add(aluno);
            return true;
        }return false;
    }
    public double media_alunos(){
        double soma = 0;
        for(Estudante aluno: retorna_lista()){
            soma += aluno.nota;
        }
        return soma / retorna_lista().size();
    }
    public void maior_nota(){
        double maior_nota = retorna_lista().get(0).nota;
        String nome = retorna_lista().get(0).nome;
        for (Estudante aluno: retorna_lista()){
            if(aluno.nota > maior_nota){
                nome = aluno.nome;
                maior_nota = aluno.nota;
            }
        }
        System.out.println(nome + " : " + maior_nota);
    }
}

public class Ex07_CadastrandoAlunosComClasses {
    public static void main(String[] args){
        Estudante Pedro = new Estudante("Pedro", 20, 6.5);
        Estudante Ronaldo = new Estudante("Ronaldo", 45, 7.8);
        Estudante Eren = new Estudante("Tatakae", 21, 9.8);
        Estudante Blaze = new Estudante("Blaze", 20, 6.8);
        Estudante Kira = new Estudante("Light", 18, 10);
        Estudante Juliano = new Estudante("Juliano", 55, 4.7);

        Curso Dio = new Curso("Dio bootcamps", 6);
        Dio.cadastrar_aluno(Ronaldo);
        Dio.cadastrar_aluno(Eren);
        Dio.cadastrar_aluno(Pedro);
        Dio.cadastrar_aluno(Blaze);
        Dio.cadastrar_aluno(Kira);
        Dio.cadastrar_aluno(Juliano);

        System.out.printf("A media dos alunos cadastrados foi de %.2f pontos\n", Dio.media_alunos());
        Dio.maior_nota();

    }
}