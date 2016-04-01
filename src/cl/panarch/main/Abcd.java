package cl.panarch.main;

public class Abcd {
	int x = 10;
	static int y = 20;
	
	private int valor = 9;
	
	public String toString(){
		return "x:"+this.x+" y:"+y+" valor:"+valor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int y) {
		Abcd.y = y;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
