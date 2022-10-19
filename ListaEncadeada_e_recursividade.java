class No{
    private double valor;
    private No proximo;

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }
}

class List {
    private No head;

    public void add(double valor){
        No no = new No();
        no.setValor(valor);
        no.setProximo(this.head);
        this.head = no;
    }

    public No show(No proximo){
        if(proximo != null){
            System.out.println(proximo);
            return show(proximo.getProximo());
        }
        return null;
    }

    public No getHead() {
        return head;
    }
}


public class ListaEncadeada_e_recursividade {
    public static void main(String[] args) {
        List list = new List();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(13);
        list.add(90);
        list.add(21);
        list.show(list.getHead());

    }

}
