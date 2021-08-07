
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Add_type_app implements ActionListener{
		private JFrame f;
		private int J_y;
		private JButton b1;
		private JButton b2;
		
		private int JLabel_height;
		private int JLabel_width;
		
		private JLabel L_name;
		private JLabel L_x;
		private JLabel L_y;
		private JLabel L_z;
		private JLabel L_weight;
		
		
		
		private int JTextField_height;
		private int JTextField_width;
		
		private JTextField TF_name;
		private JTextField TF_x;
		private JTextField TF_y;
		private JTextField TF_z;
		private JTextField TF_weight;
		
		private BooleanWrapper operation;
		
		
		private List_of_types types;
		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public  Add_type_app(List_of_types t)
		{
			types = t;
			operation = new BooleanWrapper();
			
			f = new JFrame();
			JTextField_height = 20;
			JTextField_width = 150;
			JLabel_height = 20;
			JLabel_width = 100;
			
			J_y = 70;
			
			L_name = new JLabel();  
			L_name.setBounds(J_y,5, JLabel_width, JLabel_height);
			L_name.setText("Enter name: ");
			
			TF_name = new JTextField();  
			TF_name.setBounds(J_y,30, JTextField_width, JTextField_height);  
			TF_name.setEditable(true);
			
			L_x = new JLabel();  
			L_x.setBounds(J_y,55, JLabel_width, JLabel_height);  
			L_x.setText("Enter x: ");
			
			TF_x = new JTextField();  
			TF_x.setBounds(J_y,80, JTextField_width, JTextField_height);  
			TF_x.setEditable(true);
			
			L_y = new JLabel();  
			L_y.setBounds(J_y,105, JLabel_width, JLabel_height);
			L_y.setText("Enter y: ");
			
			TF_y = new JTextField();  
			TF_y.setBounds(J_y,130, JTextField_width, JTextField_height);  
			TF_y.setEditable(true);
			
			L_z = new JLabel();  
			L_z.setBounds(J_y,155, JLabel_width, JLabel_height);
			L_z.setText("Enter z: ");
			
			
			TF_z = new JTextField();  
			TF_z.setBounds(J_y,180, JTextField_width, JTextField_height);  
			TF_z.setEditable(true);
			
			L_weight = new JLabel();  
			L_weight.setBounds(J_y,205, JLabel_width, JLabel_height);
			L_weight.setText("Enter weight: ");
			
			TF_weight = new JTextField();  
			TF_weight.setBounds(J_y,230, JTextField_width, JTextField_height);  
			TF_weight.setEditable(true);
		    
			b1 = new JButton("Anuluj");
			b1.setBounds(55,265,75, 30);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
						
					operation.setTrue();;
					f.setVisible(false);
							
				}
			});
			
			b2 = new JButton("Dodaj");
			b2.setBounds(155,265,75, 30);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					
					if(!TF_name.getText().equals("")
						&& !TF_x.getText().equals("")
						&& !TF_y.getText().equals("")
						&& !TF_z.getText().equals("")
						&& !TF_weight.getText().equals(""))
					{
						Type_of_package temp 
						= new Type_of_package(TF_name.getText(),
								Float.parseFloat(TF_x.getText()),
								Float.parseFloat(TF_y.getText()),
								Float.parseFloat(TF_z.getText()),
								Float.parseFloat(TF_weight.getText()));
						types.add_type(temp);
						operation.setTrue();
						f.setVisible(false);
						//System.out.println(types.get_name(0));
					}else {
						JOptionPane.showMessageDialog(f, "Some fields are empty.");
					}
					
					
					
				}
			});
		
			
			f.add(b1);
			f.add(b2);    
			
			f.add(L_name);
			f.add(L_weight);
			f.add(L_x);
			f.add(L_y);
			f.add(L_z);
			
			f.add(TF_name);
			f.add(TF_weight);
			f.add(TF_x);
			f.add(TF_y);
			f.add(TF_z);
			f.setSize(300,350);
			f.setLayout(null); 
			f.setVisible(false);
			
		}
		
		
		
		public JFrame get_frame()
		{
			return f;
						
		}
		
		public void actionPerformed(ActionEvent e)
		{
			operation.setFalse();
			f.setVisible(true);
			
		}
		
		public BooleanWrapper get_info()
		{
			return operation;
		}
	
	}


