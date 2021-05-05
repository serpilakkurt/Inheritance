public class User {
   
   int id;
   String firstName;
   String lastname;
   String email;
   
	public User() {
		
}
	public User(int id, String firstName, String lastname, String email) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
   
   
}
