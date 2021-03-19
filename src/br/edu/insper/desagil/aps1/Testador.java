package br.edu.insper.desagil.aps1;

public class Testador {
	
	private double valorTotal;
	private double valorEsperado;
	
	public boolean testeA() { // Nenhum produto.
	    return false;
	}

	public boolean testeB() { // Uma unidade de um produto sem desconto.
	    return false;
	}

	public boolean testeC() { // Uma unidade de um produto com desconto.
	    return false;
	}

	public boolean testeD() { // Uma unidade de um produto com desconto e duas de um produto sem desconto.
		Carrinho carrinhoTesteD = new Carrinho();
		
		Produto produto1TesteD = new Produto(2001, "Itaipavo", 12.99);
		Produto produto2TesteD = new Produto(2002, "Brahama", 15.95);
		
		carrinhoTesteD.adicionaProduto(produto1TesteD);
		carrinhoTesteD.adicionaProduto(produto2TesteD);
		carrinhoTesteD.adicionaProduto(produto2TesteD);
		
		Caixa caixaTesteD = new Caixa();
		
		caixaTesteD.adicionaDesconto(produto1TesteD, 40);
		
		valorTotal = caixaTesteD.totalCarrinho(carrinhoTesteD);
		valorEsperado = 12.99*(1-0.4) + 2*15.95;
		return valorEsperado == valorTotal;
	}

	public boolean testeE() { // Duas unidades de um produto com desconto e uma de um produto sem desconto.
		Carrinho carrinhoTesteE = new Carrinho();
		
		Produto produto1TesteE = new Produto(2001, "Rainequem", 52.20);
		Produto produto2TesteE = new Produto(2002, "Biatz", 21.40);
		
		carrinhoTesteE.adicionaProduto(produto1TesteE);
		carrinhoTesteE.adicionaProduto(produto1TesteE);
		carrinhoTesteE.adicionaProduto(produto2TesteE);
		
		Caixa caixaTesteE = new Caixa();
		
		caixaTesteE.adicionaDesconto(produto1TesteE, 15);
		
		valorTotal = caixaTesteE.totalCarrinho(carrinhoTesteE);
		valorEsperado = 2*52.20*(1-0.15) + 21.40;
		return valorEsperado == valorTotal;
	}
}
