package controller;

import model.Candidato;

public class AcrescimoPorExperiencia implements IAcrescimoPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int acrescimo = 0;
		if (c.getAnosExperiencia() > 0) {
			acrescimo = c.getAnosExperiencia() * 2;
		}
		return c.getPontosProva() + acrescimo;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));

	}

}
