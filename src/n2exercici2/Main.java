package n2exercici2;

public class Main {

	public static void main(String[] args) {
		
		ImplementadoraDoble implementadora = new ImplementadoraDoble();
		
		implementadora.metodeInterficie1();
		implementadora.metodeInterficie2();
		
		ClaseGenerica claseGenerica = new ClaseGenerica();
		
		claseGenerica.metode1(implementadora);
		claseGenerica.metode2(implementadora);
		

	}

}
