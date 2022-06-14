package controller;

import model.Candidato;

public interface IAcrescimoPontuacao {

	public int calculaPontuacao(Candidato c);
	public void proximaPontuacao(Candidato c);
	
}
