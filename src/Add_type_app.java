
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Add_type_app{
		private JFrame f;
		
		private JButton b1;
		private JButton b2;
		
		private JLabel L_name;
		private JLabel L_x;
		private JLabel L_y;
		private JLabel L_z;
		private JLabel L_weight;
		
		private JTextField TF_name;
		private JTextField TF_x;
		private JTextField TF_y;
		private JTextField TF_z;
		private JTextField TF_weight;
		
		private List_of_types types;
		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public  Add_type_app()
		{
			
			
			f = new JFrame();
	        
			TF_name = new JTextField();  
			TF_name.setBounds(100,50, 100,20);  
			TF_name.setEditable(true);

			TF_x = new JTextField();  
			TF_x.setBounds(100,50, 100,20);  
			TF_x.setEditable(true);
			
			TF_y = new JTextField();  
			TF_y.setBounds(100,50, 100,20);  
			TF_y.setEditable(true);
			
			TF_z = new JTextField();  
			TF_z.setBounds(100,50, 100,20);  
			TF_z.setEditable(true);
			
			TF_weight = new JTextField();  
			TF_weight.setBounds(100,50, 100,20);  
			TF_weight.setEditable(true);
		    
			b1 = new JButton("Anuluj");
			b1.setBounds(50,150,100, 40);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
						
					f.setVisible(false);
							
				}
			});
			
			b2 = new JButton("Dodaj");
			b2.setBounds(150,150,100, 40);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					f.setVisible(false);
					
				}
			});
		
			
			f.add(b1);
			f.add(b2);    
			f.setSize(300,300);
			f.setLayout(null); 
			f.setVisible(false);
			
		}
		
		
		
		public JFrame get_frame()
		{
			return f;
			
							
		}
	
	}


