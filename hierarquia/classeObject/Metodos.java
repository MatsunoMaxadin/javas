

public class Metodos{
	public static void main(String [] args){
		Combatente mano1 = new Combatente();
		Guerreiro mano2 = new Guerreiro();

		System.out.println(mano1.getClass());
		System.out.println(mano2.getClass());



		System.out.println(mano1.equals(mano2));

		System.out.println(mano1.hashCode());
		System.out.println(mano2.hashCode());
	}
}
