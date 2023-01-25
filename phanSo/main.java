
public class main {
	public static void main(String[] args) throws NumberFormatException, java.io.IOException{
		// TODO Auto-generated method stub
		System.out.println("Hello world!!");
		
		phanSo a = new phanSo();
		phanSo b = new phanSo();
		a.nhap();
		b.nhap();
		phanSo s = a.sum(b);
		System.out.println(s.toString());
		s.reduce();
		System.out.println(s.toString());
	}
}
