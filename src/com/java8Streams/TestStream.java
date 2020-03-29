package com.java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		List<Personne> listP = Arrays.asList(
				new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
				new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
				new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
				new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
				new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
				new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
				new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
		);
		
		// On parcourt la collection avec la méthode stream (=iterator) pour afficher la liste
		Stream<Personne> sp = listP.stream();
		System.out.println("***** Le contenu de la liste : *****");
		sp.forEach(System.out::println);
		
		System.out.println("");
		
		// On filtre les données de la liste qu'on veut avec la méthode filter()
		Stream<Personne> st = listP.stream();
		System.out.println("***** La liste des personnes qui ont le poids > 50 : *****");
		st.filter(x->x.getPoids() > 50).forEach(System.out::println);
		
		System.out.println("");
		
		// On filtre les données de la liste qu'on veut avec la méthode filter() et le map()
		Stream<Personne> sm = listP.stream();
		sm.filter(x->x.getPoids() > 50)
			.map(x->x.getPrenom())
			.forEach(System.out::println);
	}

}
