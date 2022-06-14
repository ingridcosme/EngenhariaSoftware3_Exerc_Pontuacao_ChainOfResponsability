package controller;

import model.Candidato;

public class AcrescimoPorMedioPublico implements IAcrescimoPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int acrescimo = 0;
		if (c.isEnsinoMedioPublico()) {
			acrescimo = 5;
		}
		return c.getPontosProva() + acrescimo;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));

		AcrescimoPorSuperiorCompleto acrescPorSuperiorC = new AcrescimoPorSuperiorCompleto();
		acrescPorSuperiorC.proximaPontuacao(c);

	}

}
