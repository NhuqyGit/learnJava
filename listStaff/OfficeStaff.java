package listStaff;

public class OfficeStaff extends Staff {
	private double salary;
	
	public OfficeStaff() {
		super();
		salary = 0;
	}
	
	public OfficeStaff(String id, String name, String phone, double _salary) {
		super(id, name, phone);
		salary = _salary;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("Salary: " + salary);
		return s.toString();
	}
}
