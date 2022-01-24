package n3exercici1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<String> alumnes = new ArrayList<String>();
		
		alumnes.add("Pep");
		alumnes.add("Dani");
		alumnes.add("Marc");
		alumnes.add("Pau");
		
		Escola<List<?>> escola1 = new Escola<List<?>>(alumnes);
		
		Generic generic = new Generic();
		
		//amb escola puc accedir al metode generic1 i a qualsevol mètode de la clase Escola
		generic.metodeGeneric1(escola1);
		System.out.println(escola1.getT());
		System.out.println(escola1.toString());
		
		//i a la llista puc accedir a qualsevol mètode de l'ArrayList
		System.out.println(escola1.getT().get(0));
		System.out.println(escola1.getT().size());
		
		System.out.println();
		
		List<Escola<?>> escoles = new ArrayList<Escola<?>>();
				
		escoles.add(new Escola("Sant Jordi"));
		escoles.add(new Escola("Salvador Espriu"));
		escoles.add(new Escola("Cultural"));
		escoles.add(new Escola("Blanquerna"));
		
		//amb la llista puc accedir al metode generic2 i a qualsevol mètode del ArrayList
		generic.metodeGeneric2(escoles);
		System.out.println(escoles.size());
		
		//amb l'escola puc accedir a qualsevol mètode de la clase Escola
		System.out.println(escoles.get(0).getT());
		System.out.println(escoles.get(0).toString());
		
		
		

	}

}
