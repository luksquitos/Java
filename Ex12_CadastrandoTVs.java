import java.util.ArrayList;

class TV{
    String marca;
    double valor;
    //static int quantidade = 0;
    static ArrayList<String> marcas_registradas = new ArrayList<>();

    TV(String marca, double valor){
        this.marca = marca;
        this.valor = valor;

        if(!marcas_registradas.contains(marca)){
            marcas_registradas.add(marca);
            //quantidade++;
        }
    }

}

public class Ex12_CadastrandoTVs {

    public static void main(String[] a){

        TV tv1 = new TV("Panasonic", 1500.00);
        TV tv2 = new TV("Sony", 3000.00);
        TV tv3 = new TV("Sony", 6000.00);

        System.out.println(TV.marcas_registradas);
    }
}