package n1exercici2;

public class GenericMethods {
	
	public <T> void f (T valor1, T valor2, T valor3) {
				
		System.out.println("Mètode f");
		System.out.println(valor1+" "+ valor2 + " "+ valor3 + "\n");
	}
	
	//creo un metode que retorni un valor de clase generica
	public <T> T g (T valor1, T valor2, T valor3) {
		T t;
		t=valor1;
		t=valor2;
		t=valor3;
		//t=valor1+valor2;
		System.out.println("Metode g");
		System.out.println(t+"\n");
		return t;
	}
	
}
