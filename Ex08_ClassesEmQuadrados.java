//Fazer um programa para ler os valores da largura e altura de um retângulo.
// Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe.

import java.util.Scanner;
import java.lang.Math;

class Retangulo{
    public double largura;// Metros
    public double altura; // Metros

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * largura + 2 * altura;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString(){
        return "largura: " + largura + ", altura: " + altura;
    }
}

public class Ex08_ClassesEmQuadrados {
    public static void main(String[] args){
        Retangulo q1 = new Retangulo();
        q1.altura = 3.00;
        q1.largura = 4.00;

        System.out.println(q1);
        System.out.println("Área: "+ q1.area());
        System.out.println("Perímetro: " + q1.perimetro());
        System.out.println("Diagonal: "+ q1.diagonal());

    }

}
