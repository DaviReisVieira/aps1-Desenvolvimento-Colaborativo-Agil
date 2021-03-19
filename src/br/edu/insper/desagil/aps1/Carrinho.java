package br.edu.insper.desagil.aps1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	public void adicionaProduto (Produto novoProduto) {
		for (int i=0; i< this.pedidos.size(); i++) {
			Produto produtoCarrinho = this.pedidos.get(i).getProduto();
			
			if (produtoCarrinho.getCodigo() == novoProduto.getCodigo()) {
				this.pedidos.get(i).incrementaQuantidade();			
			}
			else {
				Pedido novoPedido = new Pedido(novoProduto);
				this.pedidos.add(novoPedido);
			}
		}
		
	}

}
