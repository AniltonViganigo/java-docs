package entities;

public class Bhaskara {

	public double a;
	public double b;
	public double c;
	public double raiz1;
	public double raiz2;
	public double delta;

	public double calculaDelta() {
		return delta = Math.pow(b, 2.0) - 4.0 * a * c;
	}

	public double calculaRaiz1() {
		return raiz1 = (-b + Math.sqrt(calculaDelta())) / (2.0 * a);
	}

	public double calculaRaiz2() {
		return raiz2 = (-b - Math.sqrt(calculaDelta())) / (2.0 * a);
	}
}
