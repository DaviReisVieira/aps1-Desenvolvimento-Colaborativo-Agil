package br.edu.insper.desagil.aps1;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	public void increaseQuantidade() {
		this.quantidade += 1;
	}
	
	public double getTotalPrice() {
		return (this.produto.getPreco())*this.quantidade;
	}

}
