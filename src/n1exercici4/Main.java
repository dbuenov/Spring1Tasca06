package n1exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods objecte1 = new GenericMethods();
		
		objecte1.f("un");
		objecte1.f("un", "dos");
		objecte1.f(new Nova(), "dos", 3, 4.0F);
		
	}

}

//clase per provar diferents tipus de variable
class Nova{

	@Override
	public String toString() {
		return "ClaseNova";
	}
	
}
