package br.edu.insper.desagil.aps1;

public class Pedido {
	private Produto produto;
	private int quantidade;

	public Pedido() {
		super();
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public int incrementaQuantidade() {
		this.quantidade +=1;
		return quantidade;
	}
	
	public double totalPedido() {
		
		return this.produto.getPreco()*this.getQuantidade();
	}
	

}
