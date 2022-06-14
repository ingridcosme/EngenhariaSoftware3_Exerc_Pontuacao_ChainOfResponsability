package controller;

import model.Candidato;

public class AcrescimoPorSuperiorCompleto implements IAcrescimoPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int acrescimo = 0;
		if (c.isEnsinoSuperiorCompleto()) {
			acrescimo = 10;
		}
		return c.getPontosProva() + acrescimo;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));

		AcrescimoPorRegistroEntidadeClasse acrescPorRegistroEC = new AcrescimoPorRegistroEntidadeClasse();
		acrescPorRegistroEC.proximaPontuacao(c);

	}

}
