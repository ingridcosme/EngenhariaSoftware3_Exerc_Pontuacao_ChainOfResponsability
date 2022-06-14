package view;

import controller.AcrescimoPorMedioPublico;
import controller.IAcrescimoPontuacao;
import model.Candidato;

public class Principal {

	public static void main(String[] args) {
		Candidato c1 = new Candidato();
		c1.setId(1);
		c1.setNome("João");
		c1.setAnosExperiencia(10);
		c1.setAnosRegistroEntidadeClasse(0);
		c1.setEnsinoMedioPublico(false);
		c1.setEnsinoSuperiorCompleto(false);
		c1.setPontosProva(100);



		IAcrescimoPontuacao acresc = new AcrescimoPorMedioPublico();
		acresc.proximaPontuacao(c1);

		System.out.println(c1);

		Candidato c2 = new Candidato();
		c2.setId(2);
		c2.setNome("Maria");
		c2.setAnosExperiencia(0);
		c2.setAnosRegistroEntidadeClasse(6);
		c2.setEnsinoMedioPublico(false);
		c2.setEnsinoSuperiorCompleto(false);
		c2.setPontosProva(100);



		acresc = new AcrescimoPorMedioPublico();
		acresc.proximaPontuacao(c2);

		System.out.println(c2);

		Candidato c3 = new Candidato();
		c3.setId(3);
		c3.setNome("Joana");
		c3.setAnosExperiencia(0);
		c3.setAnosRegistroEntidadeClasse(0);
		c3.setEnsinoMedioPublico(true);
		c3.setEnsinoSuperiorCompleto(false);
		c3.setPontosProva(100);



		acresc = new AcrescimoPorMedioPublico();
		acresc.proximaPontuacao(c3);

		System.out.println(c3);

		Candidato c4 = new Candidato();
		c4.setId(4);
		c4.setNome("Ricardo");
		c4.setAnosExperiencia(0);
		c4.setAnosRegistroEntidadeClasse(0);
		c4.setEnsinoMedioPublico(false);
		c4.setEnsinoSuperiorCompleto(true);
		c4.setPontosProva(100);



		acresc = new AcrescimoPorMedioPublico();
		acresc.proximaPontuacao(c4);

		System.out.println(c4);

	}

}
