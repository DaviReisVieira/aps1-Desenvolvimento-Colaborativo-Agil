package br.edu.insper.desagil.aps1;

public class Testador {
	private static double DELTA = 0.000001;
	
	public boolean testeA() { // Nenhum produto.
		Carrinho carrinhoTesteA = new Carrinho();
		
		Caixa caixaTesteA = new Caixa();
		
		double totalCompraA = caixaTesteA.totalCarrinho(carrinhoTesteA);
		double totalEsperadoCompraA = 0.0;
		
		if (Math.abs(totalCompraA - totalEsperadoCompraA) < DELTA) {
			return true;
		}
		else {
			return false;
		}	
	}

	public boolean testeB() { // Uma unidade de um produto sem desconto.
		Carrinho carrinhoTesteB = new Carrinho();		
		
		Produto produto1TesteB = new Produto(2001, "Itaipavo", 12.99);
		carrinhoTesteB.adicionaProduto(produto1TesteB);
		
		Caixa caixaTesteB = new Caixa();
		
		double totalCompraB = caixaTesteB.totalCarrinho(carrinhoTesteB);
		double totalEsperadoCompraB = 1*12.99;
		
		if (Math.abs(totalCompraB - totalEsperadoCompraB) < DELTA) {
			return true;
		}
		else {
			return false;			
		}
	}

	public boolean testeC() { // Uma unidade de um produto com desconto.
		Carrinho carrinhoTesteC = new Carrinho();		
		
		Produto produto1TesteC = new Produto(2001, "Itaipavo", 12.99);
		carrinhoTesteC.adicionaProduto(produto1TesteC);
		
		Caixa caixaTesteC = new Caixa();
		
		caixaTesteC.adicionaDesconto(produto1TesteC, 10);
		
		double totalCompraC = caixaTesteC.totalCarrinho(carrinhoTesteC);
		double totalEsperadoCompraC = 1*12.99*(1-0.1);
		
		if (Math.abs(totalCompraC - totalEsperadoCompraC) < DELTA) {
			return true;
		}
		else {
			return false;			
		}
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
		
		double totalCompraD= caixaTesteD.totalCarrinho(carrinhoTesteD);
		double totalEsperadoCompraD= 12.99*(1-0.4) + 2*15.95;
		
		if (Math.abs(totalCompraD - totalEsperadoCompraD) < DELTA) {
			return true;
		}
		else {
			return false;			
		}
		
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
		
		double totalCompraE = caixaTesteE.totalCarrinho(carrinhoTesteE);
		double totalEsperadoCompraE = 2*52.20*(1-0.15) + 21.40;
		
		if (Math.abs(totalCompraE - totalEsperadoCompraE) < DELTA) {
			return true;
		}
		else {
			return false;			
		}
	}
}
