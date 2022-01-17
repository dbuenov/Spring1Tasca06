package n1exercici4;

import java.util.ArrayList;

public class GenericMethods {
	
	//mostra per pantalla el primer element del array
	public <T> void f (ArrayList<T> array) {
		System.out.println("Mètode generic");	
		
		if(array.size()==0 || array == null) {
			System.out.println("No hay elementos");
		}else {
			System.out.println(array.get(0).toString());	
		}
		
	}
	
}
