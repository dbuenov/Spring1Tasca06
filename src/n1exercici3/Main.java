package n1exercici3;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods objecte1 = new GenericMethods();
		
		objecte1.f("un", "dos","tres","quatre", 5);
		objecte1.f(1, 2, "tres", 4.0F, -5);
		objecte1.f("un", 2, "tres", -4, "cinc", 6.000001F);
		
		Nova objecteNou = new Nova();
		
		objecte1.f("un", objecteNou, "tres");	
		objecte1.f("un", objecteNou, "dos", objecteNou, "tres", objecteNou);
	}
}


//clase per provar diferents tipus de variable
class Nova{

	@Override
	public String toString() {
		return "ClaseNova";
	}
	
}
