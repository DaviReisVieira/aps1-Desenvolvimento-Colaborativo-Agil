package br.edu.insper.desagil.aps1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		super();
		pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public List<Pedido> AdicionaProduto (Produto novoProduto) {
		for (int i=0; i< this.pedidos.size(); i++) {
			Produto produtoCarrinho = this.pedidos.get(i).getProduto();
			
			if (produtoCarrinho.getCodigo() == novoProduto.getCodigo()) {
				this.pedidos.get(i).incrementaQuantidade();			
			}
			else {
				Pedido novoPedido = new Pedido ();
				this.pedidos.add(novoPedido);
			}
		}
		
		return pedidos; // retorno a Lista de pedidos ou nada? (void)
	}

}
