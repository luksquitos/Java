public class buscarElementos {

    public static void achaValor(int valor){
        int[] array = {64, 137, -16, 43, 67, -90, 212, 10, 75};
        for(int i = 0; i < array.length; i++){
            if(array[i]==valor){
                System.out.println("Encontrei o elemento" + valor + "na posição" + i);
            }

        }
//        System.out.println("Não encontrei em lugar nenhum");

    }

    public static void achaValor(int[] entrada){
        for(int i = 0; i < entrada.length ; i++){
            achaValor(entrada[i]);
        }
    }


    public static void main(String[] args) {
        achaValor(new int[] {1, 2, 3}); // Irá procurar cada elemento do array dentro do array fornecido
        achaValor(64); //Irá procurar um único valor

    }

}

