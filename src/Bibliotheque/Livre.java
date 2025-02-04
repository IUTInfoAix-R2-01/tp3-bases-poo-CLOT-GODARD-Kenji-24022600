package Bibliotheque;

public class Livre {
	private String name;
	private float price;
	private int quantity;
	
	public Livre() {
		name = "Vagabond";
		price = 6.99f;
		quantity = 7;
	}
	
	public Livre(String name,float price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
	
	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}
	
	public String toString() {
		return " [ Name = " + this.name + " Price = " + this.price + " Quantity = " + this.quantity + ']';
	}
}
