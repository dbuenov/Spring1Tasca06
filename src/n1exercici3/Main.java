package n1exercici3;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods objecte1 = new GenericMethods();
		
		objecte1.f("un", "dos","tres");
		objecte1.f(1, 2, "tres");
		objecte1.f("hola", 2, "tres");
		
		Nova objecteNou = new Nova();
		
		objecte1.f("hola", objecteNou, "tres");			
	}
}

//clase per provar diferents tipus de variable
class Nova{
	
}
