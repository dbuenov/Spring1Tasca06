package n2exercici2;

public class ClaseGenerica {
	
	public <T extends Interficie1> void metode1(T t) {
		System.out.println("metode1 de Clase Generica");
	}
	
	public <T extends Interficie2> void metode2(T t) {
		System.out.println("metode2 de Clase Generica");
		
	}
 	
}
