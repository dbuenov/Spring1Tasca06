package n1exercici3;

public class GenericMethods {
	
	public <T> void f (T valor1, T valor2, T ... valor3) {
		
		System.out.println("Mètode generic");
		System.out.print(valor1+" "+ valor2+" ");
		
		for (T t : valor3) {
			System.out.print(t+" ");
		}
		System.out.println();
		
	}
	
}
