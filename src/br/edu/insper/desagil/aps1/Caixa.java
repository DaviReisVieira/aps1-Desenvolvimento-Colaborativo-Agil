package br.edu.insper.desagil.aps1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Double> descontos;

	public Caixa() {
		super();
		descontos = new HashMap<Integer, Double>();
	}
	
	public Map<Integer, Double> adicionaDesconto(Produto produto, int desconto) {
		if (desconto > 0 && desconto < 100) {
			descontos.put(produto.getCodigo(), (double) desconto/100);
		}
		
		return descontos;
	}
	
	public double totalCarrinho (Carrinho carrinho) {
		double total = 0.0;
		for (Pedido pedido : carrinho.getPedidos()) {
			if (this.descontos.containsKey(pedido.getProduto().getCodigo())) {
				total += pedido.totalPedido()*(1 - descontos.get(pedido.getProduto().getCodigo()));
			}
			else {
				total +=  pedido.totalPedido();
			}
		}
		
		
		return total;
				
	}

}
