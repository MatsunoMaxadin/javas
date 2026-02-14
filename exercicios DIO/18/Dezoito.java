public class Dezoito{
	public static void main (String [] args){
		
		Altura altura1 = new Altura("Francisco", 1.50, 0.02);
		Altura altura2 = new Altura("Sara", 1.10, 0.03);
		int anos = 0;
		while (altura1.getAltura() >= altura2.getAltura()){
			altura1.crescer();
			altura2.crescer();
			anos++;
		}

		System.out.println("Francisco levará " + anos + " para ficar MENOR que Sara.");
	}
}
