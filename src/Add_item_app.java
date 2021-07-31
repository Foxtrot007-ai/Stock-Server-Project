
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Add_item_app implements ActionListener{
		private JPanel f;
		private JButton b1;
		private JButton b2;
		private List_of_items items;
		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public Add_item_app()
		{
			
			
			f = new JPanel();
	        
		    
			b1 = new JButton("Anuluj");
			b1.setBounds(50,150,100, 40);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
						
			
							
				}
			});
			
			b2 = new JButton("Dodaj");
			b2.setBounds(150,150,100, 40);
			b2.setEnabled(false);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
							
				}
			});
		
			
			f.add(b1);
			f.add(b2);    
			f.setSize(300,300);
			f.setLayout(null); 
			f.setVisible(false);
			
		}
		
		
		
		public void actionPerformed(ActionEvent e)
		{
			
			f.setVisible(true);
			b1.setEnabled(true);
			b2.setEnabled(false);
							
		}
	
	}