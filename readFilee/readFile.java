package readFilee;

import java.io.*;
import java.util.Scanner;

public class readFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url = "C:\\Users\\DELL\\eclipse-workspace\\learn\\src\\readFilee\\test.txt";
		// 		READFILE WITH SCANNER METHOD
		//		FileInputStream fileInputStream = new FileInputStream(url);
		//		Scanner scanner = new Scanner(fileInputStream);
		//		
		//		
		//		try {
		//			while(scanner.hasNextLine()) {
		//				System.out.println(scanner.nextLine());
		//			}
		//		}finally {
		//			scanner.close();
		//			fileInputStream.close();
		//		}
		
		
		//		READFILE WITH BUFFEREDREADER METHOD
		//		FileInputStream fileInputStream = null;
		//		BufferedReader bufferedReader = null;
		//		
		//		try {
		//			fileInputStream = new FileInputStream(url);
		//			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		//			
		//			String line = bufferedReader.readLine();
		//			while(line != null) {
		//				System.out.println(line);
		//				line = bufferedReader.readLine();
		//			}
		//		}finally {
		//			fileInputStream.close();
		//			bufferedReader.close();
		//		}
				
	}

}
