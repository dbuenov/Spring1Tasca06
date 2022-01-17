package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods objecte1 = new GenericMethods();
		
		//proves amb el mètode f
		objecte1.f("un", "dos", "tres");
		objecte1.f(1, 2, 3);
		objecte1.f("hola", 23, 12.7);
						
		Nova objecteNou = new Nova();
		
		objecte1.f("hola", 23, objecteNou);
		
		//proves amb el mètode g
		objecte1.g("un", "dos", "tres");
		objecte1.g(1, 2, 3);
		objecte1.g("hola", 23, 12.7);
		objecte1.g("hola", 23, objecteNou);
		
	}
}

//clase per provar diferents tipus de variable
class Nova{
	
}
