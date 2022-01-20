package n2exercici1;

public class Generica {
		
	public <T extends MiInterfaz> void metodeGeneric(T t) {
		System.out.println("Metode generic de Generica");
		t.metode1();
		t.metode2();
		
		//no puc cridar el mètode 3 perque no està definit a la interficie
	}
	
}
