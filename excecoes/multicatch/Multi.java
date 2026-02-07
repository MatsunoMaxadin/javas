public class Multi{
	public static void main(String [] args){
		
		try {
			tipos(false);
		} catch (IllegalArgumentException | ArithmeticException e){
			System.err.print(e.getMessage());
		}
	}

	public static void tipos(boolean op) throws IllegalArgumentException, ArithmeticException{
		
		if (op){
			throw new IllegalArgumentException("sou um argumento ilegal!");
		} else {
			throw new ArithmeticException("sou um erro aritmetico!");
		}
	}
}
