import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class phanSo {
	private int mauSo;
	private int tuSo;
	
	public phanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	
	public phanSo(int a, int b) {
		tuSo = a;
		mauSo = b;
	}
	
	public int getMauSo() {
		return mauSo;
	}
	
	public int getTuSo() {
		return tuSo;
	}
	
	public void setMauSo(int Mau) {
		mauSo = Mau;
	}
	
	public void setTuSo(int Tu) {
		tuSo = Tu;
	}
	
	public phanSo sum(phanSo b) {
		phanSo re = new phanSo();
		re.tuSo = this.tuSo * b.mauSo + b.tuSo * this.mauSo;
		re.mauSo = this.mauSo * b.mauSo;
		return re;
	}
	
	public phanSo sub(phanSo b) {
		phanSo re = new phanSo();
		re.tuSo = this.tuSo * b.mauSo - b.tuSo * this.mauSo;
		re.mauSo = this.mauSo * b.mauSo;
		return re;
	}
	
	public phanSo multi(phanSo b) {
		phanSo re = new phanSo();
		re.tuSo = this.tuSo * b.tuSo;
		re.mauSo = this.mauSo * b.mauSo;
		return re;
	}
	
	public phanSo div(phanSo b) {
		phanSo re = new phanSo();
		re.tuSo = this.tuSo * b.mauSo;
		re.mauSo = this.mauSo * b.tuSo;
		return re;
	}
	
	public int gcd(int a, int b) {
		int tmp;
	    while(b != 0) {
	        tmp = a % b;
	        a = b;
	        b = tmp;
	    }
	    return a;
	}
	
	public void reduce(){
		int tmp = gcd(this.tuSo, this.mauSo);
		this.mauSo /= tmp;
		this.tuSo /= tmp;
	}
	
	public void nhap() throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap tu so: ");
        tuSo=Integer.parseInt(br.readLine());
        System.out.print(("Nhap mau so: "));
        mauSo=Integer.parseInt(br.readLine());
    }
	
	public String toString() {
		if(tuSo == 0)
			return 0 + "";
		if(mauSo == 1) {
			return tuSo + "";
		}
		return tuSo + "/" + mauSo;
	}
	

}
