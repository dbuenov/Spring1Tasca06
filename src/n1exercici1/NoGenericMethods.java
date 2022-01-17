package n1exercici1;

public class NoGenericMethods <T> {
	
	private T objecte1;
	private T objecte2;
	private T objecte3;
	
	public NoGenericMethods(T objecte1, T objecte2, T objecte3) {
		this.objecte1 = objecte1;
		this.objecte2 = objecte2;
		this.objecte3 = objecte3;		
	}

	public T getObjecte1() {
		return objecte1;
	}

	public void setObjecte1(T objecte1) {
		this.objecte1 = objecte1;
	}

	public T getObjecte2() {
		return objecte2;
	}

	public void setObjecte2(T objecte2) {
		this.objecte2 = objecte2;
	}

	public T getObjecte3() {
		return objecte3;
	}

	public void setObjecte3(T objecte3) {
		this.objecte3 = objecte3;
	}
	
	
	
}
