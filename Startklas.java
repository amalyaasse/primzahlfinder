package Primzahlfinder;

public class Startklas {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Primzahl_finder eins = new Primzahl_finder();
		Primzahl_finder zwei = new Primzahl_finder();
		Primzahl_finder drei = new Primzahl_finder();
		
		eins.setZahl(5);
		zwei.setZahl(400);
		drei.setZahl(97);
		
		
		
		eins.start();
		zwei.start();
		drei.start();

	}
	
}
