import java.util.Scanner;

import javax.swing.JFrame;

public class main {
	 public static void main(String[] args) {
	        
	        Add_type_app a = new Add_type_app();
	        JFrame f = a.get_frame();
	        Scanner reader = new Scanner(System.in); 
	        
	        
	        while(true)
	        {
	        	System.out.println("Enter a number: ");
		        int n = reader.nextInt(); 
		        if(n == 1)
	        	f.setVisible(true);
	        	
	        }
	        
	        
	 }
}

