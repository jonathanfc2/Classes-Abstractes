package Practica;

public class ex1_Main {
	public static void main(String[] args) {

		EX1_Caixer c1 = new EX1_Caixer("Juan", "Barcelona", "Barcelona", 8);
		ex1_Neteja n1 = new ex1_Neteja("Wendoline", "Medellín", "Barcelona");
		ex1_Mostrador m1 = new ex1_Mostrador("Laura", "Cornellà de Llobregat", "Barcelona", 250);

		System.out.println("INFO DEL CAIXER");
		System.out.println("Nom: " + c1.getNom());
		System.out.println("Ciutat d'Origen: " + c1.getCiutatOrigen());
		System.out.println("Hores treballades/dia: " + c1.getHoresTreballades());
		System.out.println("Salari: " + c1.salariDiari());
		System.out.println(" ");
		System.out.println("INFO DE LA NATEJA");
		System.out.println("Nom: " + n1.getNom());
		System.out.println("Ciutat d'Origen: " + n1.getCiutatOrigen());
		System.out.println("Salari: " + n1.salariDiari());
		System.out.println(" ");
		System.out.println("INFO DEL MOSTRADOR");
		System.out.println("Nom: " + m1.getNom());
		System.out.println("Ciutat d'Origen: " + m1.CiutatOrigen);
		System.out.println("Número de vendes: " + m1.getVendes());
		System.out.println("Salari: " + m1.salariDiari());
	}
}
