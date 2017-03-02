package state;

public class User {

	private String firstName;
	private String username;
	private String ipAddress;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", username=" + username + ", ipAddress=" + ipAddress + "]";
	}
	public User(String firstName, String username, String ipAddress) {
		super();
		this.firstName = firstName;
		this.username = username;
		this.ipAddress = ipAddress;
	}
	public User() {
		super();
	}
	
	
	
}
