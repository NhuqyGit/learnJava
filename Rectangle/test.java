package Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		Rec ds[] = new Rec[3];
        
        ds[0] = new Rec(new Point(1,2), new Point(3,4), new Point(0,0));
        ds[1] = new Rec(new Point(3,4), new Point(5,7), new Point(0,0));
        ds[2] = new Rec(new Point(1,2), new Point(8,9), new Point(10,0));
		
        while(true) {
        	System.out.println("1. Display");
        	System.out.println("2. Sum of triangles");
        	System.out.println("3. Show triangles with the smallest perimeter");
        	System.out.println("4. Show triangles with the largest perimeter");
        	System.out.println("5. Show triangles with the perimeter less than X");
        	System.out.println("6. Show center of the i-th triangle");
        	
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	char choice = (char)br.read();
        	
        	if(choice == '1') {
        		System.out.println("List of triangles");
        		for(Rec a:ds) {
        			System.out.println(a.toString());
        		}
        	}
        	
        	else if(choice == '2') {
        		System.out.println("Sum of triangles");
        		for(Rec a:ds) {
        			System.out.println(a.perimeterRec());
        		}
        	}
        	
        	else if(choice == '3') {
        		System.out.println("Show triangles with the smallest perimeter");
        		double max = Double.MIN_VALUE;
        		for(Rec a:ds) {
        			if(a.perimeterRec() > max)
        				max = a.perimeterRec();
        		}
        	}
        	
        	
        }
	}
	
	

}
