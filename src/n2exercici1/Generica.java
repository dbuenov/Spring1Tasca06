package n2exercici1;

public class Generica {
		
	public <T extends MiInterfaz> void metodeGeneric(T t) {
		System.out.println("Metode generic de Generica");
		t.metode1();
		t.metode2();
		
		//no puc cridar el m�tode 3 perque no est� definit a la interficie
	}
	
}
