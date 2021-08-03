import java.util.Scanner;

import javax.swing.JFrame;

public class main {
	 public static void main(String[] args) {
	        
		 	List_of_types types = new List_of_types();
		 	List_of_items items = new List_of_items();
		 	
		 	Add_type_app b = new Add_type_app(types);
	        Add_item_app a = new Add_item_app(types,items);
	        JFrame f1 = a.get_frame();
	        JFrame f2 = b.get_frame();
	        Scanner reader = new Scanner(System.in); 
	        
	        
	        while(true)
	        {
	        	
	        	a.update_list();
	        	System.out.println("Enter a number: ");
		        int n = reader.nextInt(); 
		        if(n == 1)
		        f1.invalidate();
		        f1.validate();
		        f1.repaint();
	        	f1.setVisible(true);
		        if(n == 2)
		        f2.setVisible(true);
	        	
	        }
	        
	        
	 }
}

