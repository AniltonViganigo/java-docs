package util;

public class CurrencyConverter {

	public static final double TAXA = 0.06;

	public static double dollarToReal(double price, double quantidade) {
		return quantidade * price *  ( 1 + TAXA);
	}
}
