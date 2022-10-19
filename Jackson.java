//Lucas Martins Caetano - 2120474

import java.util.ArrayList;

class Produto{
	public String nome;
	public double preco;
	public int quant;
	
	public Produto(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quant=" + quant + "]";
	}
	
}

class Carrinho{
	public String nome;
	public String metodo_pagamento;
	public ArrayList<Produto> carrinho;
	
	public Carrinho(String nome, String metodo_pagamento) {
		this.nome = nome;
		this.metodo_pagamento = metodo_pagamento;
		this.carrinho = new ArrayList<Produto>();
	}
	public void add_produto(Produto produto) {
		this.carrinho.add(produto);
	}
	
	public double soma_carrinho() {
		double preco = 0;
		for(Produto produto: this.carrinho) {
			preco += produto.preco;
		}
		return preco;
	}
	
}


public class Jackson {
	public static void main(String [] args) {
		Produto coca_cola = new Produto("Coca cola", 3.50, 40);
		Produto salame = new Produto("Salame", 40.0, 20);
		Carrinho c1 = new Carrinho("Jackson", "Crédito");
		c1.add_produto(coca_cola);
		c1.add_produto(salame);
		System.out.println(c1.soma_carrinho());
	}
}