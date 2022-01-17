package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		String parametre1 = "Pau";
		String parametre2 = "Marc";
		String parametre3 = "Dani";
		
		NoGenericMethods<String> nouObjecte1 = new NoGenericMethods<String>(parametre1, parametre2, parametre3);
		
		System.out.println(nouObjecte1.getObjecte1());
		System.out.println(nouObjecte1.getObjecte2());
		System.out.println(nouObjecte1.getObjecte3());
		System.out.println();
		
		NoGenericMethods<String> nouObjecte2 = new NoGenericMethods<String>(parametre2, parametre1, parametre3);
		
		System.out.println(nouObjecte2.getObjecte1());
		System.out.println(nouObjecte2.getObjecte2());
		System.out.println(nouObjecte2.getObjecte3());
		System.out.println();
		
		NoGenericMethods<String> nouObjecte3 = new NoGenericMethods<String>(parametre3, parametre2, parametre1);
		
		System.out.println(nouObjecte3.getObjecte1());
		System.out.println(nouObjecte3.getObjecte2());
		System.out.println(nouObjecte3.getObjecte3());
				
	}

}
