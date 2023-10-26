package Primzahlfinder;
import java.util.ArrayList; 

public class Primzahl_finder extends Thread {

	private int zahl; 
	// i wird durch e geteilt

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}

	

	
	public void run()
	{
	//ArrayList erzeugen um zahlen zu speichern
	ArrayList<Integer> zahlliste = new ArrayList<Integer>();
	
	
		for(int i=2; i==zahl/2; i++) {
		if (zahl%i == 0) {
			
			System.out.println("kein primzahl");
			}
		
			else {System.out.println("primzahl");
				zahlliste.add(getZahl());}
		
		System.out.println(zahlliste);
		}}
				
		
		
		
	}
	
	
	


