package listStaff;

public class ProductStaff extends Staff {
	private double salary;
	private double hours;
	
	public ProductStaff() {
		super();
		salary = 0;
		hours = 0;
	}
	
	public ProductStaff(String id, String name, String phone, double _salary, double _hours) {
		super(id, name, phone);
		salary = _salary;
		hours = _hours;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(super.toString());
		s.append("\nSalary: " + salary);
		s.append("\nHours: " + hours);
		return s.toString();
	}
}
