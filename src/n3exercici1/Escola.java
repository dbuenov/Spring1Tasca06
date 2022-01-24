package n3exercici1;

public class Escola <T>{
	
	T t;
	
	public Escola(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Aquesta escola té aquest valor: " + t;
	}
	
}
