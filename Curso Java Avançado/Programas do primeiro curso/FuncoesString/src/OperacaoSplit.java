
public class OperacaoSplit {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		// esse comando "recorta" a string//
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		       

		
	}

}
