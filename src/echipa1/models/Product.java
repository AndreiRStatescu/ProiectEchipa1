package echipa1.models;

public class Product {
	private String nume;
	private float pret;
	
	public Product(String nume, float pret) {
		this.nume = nume;
		this.pret = pret;
	}
	
	public String getNume() {
		return nume;
	}	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Product [nume=" + nume + ", pret=" + pret + "]";
	}
	
	
}
