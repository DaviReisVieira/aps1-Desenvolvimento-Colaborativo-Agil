package br.edu.insper.desagil.aps1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;

	public Caixa() {
		super();
		this.descontos = new HashMap<Integer, Integer>();
	}
	
	public void adicionaDesconto(Produto produto, int desconto) {
		if (desconto > 0 && desconto < 100) {
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double totalCarrinho (Carrinho carrinho) {
		double total = 0.0;
		for (Pedido pedido : carrinho.getPedidos()) {
			if (this.descontos.containsKey(pedido.getProduto().getCodigo())) {
				total += pedido.totalPedido()*(1 - (double) this.descontos.get(pedido.getProduto().getCodigo())/100);
			}
			else {
				total +=  pedido.totalPedido();
			}
		}
		
		return total;
				
	}

}
