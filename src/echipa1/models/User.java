package echipa1.models;


import java.util.ArrayList;

//POJO=Plain Old Java Object 
public class User {
	private String username;
	private String password;
	
	private ArrayList<User> friends = new ArrayList<User>();
	private ArrayList<Order> orders = new ArrayList<Order>(); 
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
}