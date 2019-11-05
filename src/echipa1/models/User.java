package echipa1.models;


import java.util.ArrayList;

//POJO=Plain Old Java Object 
public class User {
	private String username;
	private String password;
	private String adresaMail;
	private String numarTelefon;
	
	private ArrayList<User> friends = new ArrayList<User>();
	private ArrayList<Order> orders = new ArrayList<Order>(); 
	
	public User(String username, String password, String adresaMail, String numarTelefon) {
		super();
		this.username = username;
		this.password = password;
		this.adresaMail = adresaMail;
		this.numarTelefon = numarTelefon;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<User> getFriends() {
		return friends;
	}
	public ArrayList<Order> getOrders() {
		return orders;
	}
	public String getAdresaMail () {
		return adresaMail;
	}
	public void setAdresaMail (String adresaMail) {
		this.adresaMail = adresaMail;
	}
	public String getNumarTelefon () {
		return numarTelefon;
	}
	public void setNumarTelefon (String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", adresaMail=" + adresaMail
				+ ", numarTelefon=" + numarTelefon + "]";
	}
	
	
	
}