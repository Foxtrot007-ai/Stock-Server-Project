


import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Main_server_app{
		private JFrame f;
		private JButton b1;
		private JButton b2;
		private List_of_types types;
		private List_of_items items;
		private Add_type_app app_t;
		private Add_item_app app_i;
		private JFrame items_app;
		private JFrame types_app;
		private ButtonManager b_manager;
		
		

		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public  Main_server_app()
		{
						
			f = new JFrame();
			
			types = new List_of_types();
		 	items = new List_of_items();
		 	app_t = new Add_type_app(types);
	        app_i = new Add_item_app(types,items);
	        
	        
	        
			
			b1 = new JButton("Dodaj nowy typ");
			b1.setBounds(100,250,100, 100);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					app_t.actionPerformed(evt);
					b_manager = new ButtonManager(b1,b2);
					b_manager.select_operation(app_t.get_info());
					b_manager.start();
					
				}
			});
			
			b2 = new JButton("Dodaj nowy przedmiot");
			b2.setBounds(400,250,100, 100);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					items_app.setVisible(true);
					

				}
			});
			b_manager = new ButtonManager(b1, b2);
			
			f.add(b1);
			f.add(b2);    
			
			f.setSize(600,600);
			f.setLayout(null); 
			f.setVisible(true);
			
		}
		
		
		
		
	}





