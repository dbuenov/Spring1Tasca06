package n1exercici4;

import java.util.ArrayList;

public class GenericMethods {
	
	//mostra per pantalla el primer element del array
	public <T> void f (T ... valors) {
		System.out.println("Mètode generic");	
		
		for (T t : valors) {
			System.out.print(t+ " ");
		}
		System.out.println();
		
	}
	
}
