package listStaff;

public class Staff {
	private String id;
	private String name;
	private String phoneNumber;
	
	public Staff(){
		id = "";
		name = "";
		phoneNumber = "";
	}
	
	public Staff(String _id, String _name, String _phone) {
		id = _id;
		name = _name;
		phoneNumber = _phone;
	}
	
	public void setID(String i) {
		id = i;
	}
	
	public void setName(String n) {
		id = n;
	}
	
	public void setPhone(String p) {
		id = p;
	}
	
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phoneNumber;
	}
	
	public String toString() {
		return String.format("Name: %s\nID: %s\nPhone number: %s", name, id, phoneNumber);
	}
}
