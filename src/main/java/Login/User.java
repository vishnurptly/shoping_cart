package Login;
public class User {
	
	private int id;
	private String username,password;
	
	public User() {
		super();
	}

	public User(int id, String username,  String password) {
		super();
		this.id = id;
		this.username = username;
		
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User []";
	}
	
	
}
