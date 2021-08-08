


import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Main_server_app{
		private JFrame f;
		private JButton b1;
		private JButton b2;
		private JButton b3;
		private JButton b4;
		private JButton b5;
		
		private JFrame items_app;
		private JFrame types_app;
		
		private List_of_types types;
		private List_of_items items;
		
		private Add_type_app app_t;
		private Add_item_app app_i;
		
		private ButtonManager b_manager;
		

		public  Main_server_app()
		{
						
			f = new JFrame();
			
			
			
			types = new List_of_types();
		 	items = new List_of_items();
		 	app_t = new Add_type_app(types);
	        app_i = new Add_item_app(types,items);
	        
	        
	        
			
			b1 = new JButton("Dodaj nowy typ");
			b1.setBounds(70,400,200, 100);
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
			b2.setBounds(320,400,200, 100);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					
					app_i.actionPerformed(evt);
					b_manager = new ButtonManager(b1,b2);
					b_manager.select_operation(app_i.get_info());
					b_manager.start();
					

				}
			});
			
			b3 = new JButton("Zaladuj listy");
			b3.setBounds(190,100,200, 100);
			b3.setEnabled(true);
			b3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					
					

				}
			});
			b4 = new JButton("Zarzadzaj przedmiotami");
			b4.setBounds(70,250,200, 100);
			b4.setEnabled(true);
			b4.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					
					

				}
			});
			b5 = new JButton("Zarzadzaj typami");
			b5.setBounds(320,250,200, 100);
			b5.setEnabled(true);
			b5.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					
					

				}
			});
			b_manager = new ButtonManager(b1, b2);
			
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);
			
			f.setSize(600,600);
			f.setLayout(null); 
			f.setVisible(true);
			
		}
		
		
		
		
	}





