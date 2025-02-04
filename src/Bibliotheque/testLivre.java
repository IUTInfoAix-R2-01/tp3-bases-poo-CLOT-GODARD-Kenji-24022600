package Bibliotheque;

public class testLivre {

	public static void main(String[] args) {
		Livre Livre1 = new Livre();
		Livre Livre2 = new Livre();
		Livre1.setName("Jojo");
		Livre1.setPrice(6.99f);
		Livre1.setQuantity(7);
		Livre2.setName("Berserk");
		Livre2.setPrice(8.99f);
		Livre2.setQuantity(18);
		System.out.println("Livre 1" + Livre1 );
		System.out.println("Livre 2" + Livre2 );
	}

}
