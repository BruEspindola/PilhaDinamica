package View;

import Controller.PilhaDinamica;

public class Principal {

	public static void main(String[] args) {

		PilhaDinamica PD = new PilhaDinamica();

		PD.empilha(10); 
		PD.empilha(11);
		PD.empilha(12);
		PD.empilha(13);
		PD.empilha(14);

		System.out.println(PD.percorre());
		System.out.println("Desempilha: " + PD.desempilha());
		System.out.println(PD.percorre());
		System.out.println("Desempilha: " + PD.desempilha());
		System.out.println(PD.percorre());
		System.out.println("Desempilha: " + PD.desempilha());
		System.out.println(PD.percorre());
		System.out.println("Desempilha: " + PD.desempilha());
		System.out.println(PD.percorre());

	}

}