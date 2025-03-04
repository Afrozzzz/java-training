package HMSystem;
public class staff {
private int id;
private String name;
private String role;
private String contact_number;
public staff(int id, String name, String role, String contact_number) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
	this.contact_number = contact_number;
}
@Override
public String toString() {
	return "Staff [id=" + id + ", name=" + name + ", role=" + role + ", contact_number=" + contact_number + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getContact_number() {
	return contact_number;
}
public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}
 
}