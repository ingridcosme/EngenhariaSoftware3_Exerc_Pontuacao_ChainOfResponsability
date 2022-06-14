package controller;

import model.Candidato;

public class AcrescimoPorRegistroEntidadeClasse implements IAcrescimoPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int acrescimo = 0;
		if (c.getAnosRegistroEntidadeClasse() > 0) {
			acrescimo = c.getAnosRegistroEntidadeClasse();
		}
		return c.getPontosProva() + acrescimo;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));

		AcrescimoPorExperiencia acrescPorExperiencia = new AcrescimoPorExperiencia();
		acrescPorExperiencia.proximaPontuacao(c);

	}

}
