package n1exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods objecte1 = new GenericMethods();
		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		ArrayList<Nova> array3 = new ArrayList<Nova>();
		
		array1.add("hola");
		array2.add(2);
		
		Nova nou = new Nova();		
		array3.add(nou);
		
		objecte1.f(array1);
		objecte1.f(array2);
		objecte1.f(array3);			
		
	}

}

//clase per provar diferents tipus de variable
class Nova{

	@Override
	public String toString() {
		return "Objecte de la clase Nova";
	}
	
}
