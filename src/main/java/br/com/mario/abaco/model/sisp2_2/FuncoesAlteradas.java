package br.com.mario.abaco.model.sisp2_2;

import br.com.mario.abaco.model.Contagem;

public class FuncoesAlteradas extends Contagem {
	
	private Contagem contagem;
	private int fatorDeImpacto;
	
	public FuncoesAlteradas(Contagem pfIncluido, int fatorDeImpacto, String descricao) {
		super(descricao);
		this.contagem = pfIncluido;
		this.fatorDeImpacto = fatorDeImpacto;
	}
	
	@Override
	public double total() {
		double total = contagem.total();
		total += super.total() * (fatorDeImpacto/100);
		return total;
	}
	
	

}