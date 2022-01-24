package n3exercici1;

import java.util.List;

public class Generic {
	
	public void metodeGeneric1(Escola<List<?>> escola){
		
		System.out.println("Mètode generic, l'escola te una llista d'alumnes");
		
	}
	
	public void metodeGeneric2(List<Escola<?>> llista){
		
		System.out.println("Mètode generic, llista d'escoles");
		
	}
}
