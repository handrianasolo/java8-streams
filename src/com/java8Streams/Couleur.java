package com.java8Streams;

public enum Couleur {
	MARRON("marron"),
	BLEU("bleu"),
	VERT("vert"),
	VERRON("verron"),
	INCONNU("non d�termin�"),
	ROUGE("rouge mais j'avais piscine...");
	
	private String name = "";
	
	Couleur(String n){
		name = n;
	}
	
	public String toString() {
		return name;
	}
}

