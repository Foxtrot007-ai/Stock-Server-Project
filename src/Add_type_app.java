
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
		
		private BooleanWrapper is_operation_finished;
		
		
		private List_of_types types;
		
		public  Add_type_app(List_of_types t)
		{
			//set basics
			types = t;
			is_operation_finished = new BooleanWrapper();
			f = new JFrame();
			
			//set swing ui
			J_y = 70;
			set_all_JLabels();
			set_all_JTextFields();
			set_button_1();
			set_button_2();
			set_close_button();
	
			//adding components to JFrame
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
		
		private JLabel create_JLabel(int y, int x, String text)
		{
			JLabel temp = new JLabel();
			temp.setBounds(y,x, JLabel_width, JLabel_height);
			temp.setText("Enter " + text +": ");
			return temp;
			
		}
		
		private JTextField create_JTextField(int y, int x)
		{
			JTextField temp = new JTextField();
			temp.setBounds(y,x, JTextField_width, JTextField_height);
			temp.setEditable(true);
			return temp;
			
		}
		
		private void set_all_JLabels()
		{
			JLabel_height = 20;
			JLabel_width = 100;
			L_name = create_JLabel(J_y,5,"name");
			L_x = create_JLabel(J_y,55,"x");
			L_y = create_JLabel(J_y,105,"y");
			L_z = create_JLabel(J_y,155,"z");
			L_weight = create_JLabel(J_y,205,"weight");
		}
		
		private void set_all_JTextFields()
		{
			JTextField_height = 20;
			JTextField_width = 150;
			TF_name = create_JTextField(J_y, 30);
			TF_x = create_JTextField(J_y, 80);
			TF_y = create_JTextField(J_y, 130);
			TF_z = create_JTextField(J_y, 180);
			TF_weight = create_JTextField(J_y, 230);
		}

		private void set_button_1()
		{
			b1 = new JButton("Anuluj");
			b1.setBounds(55,265,75, 30);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
						
					is_operation_finished.setTrue();
					f.setVisible(false);
							
				}
			});
		}
		
		private void set_button_2()
		{
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
						&& !TF_weight.getText().equals("")
						)
					{
						Type_of_package temp 
						= new Type_of_package(TF_name.getText(),
								Float.parseFloat(TF_x.getText()),
								Float.parseFloat(TF_y.getText()),
								Float.parseFloat(TF_z.getText()),
								Float.parseFloat(TF_weight.getText()));
						if(!types.contains(temp))
						{
							types.add_type(temp);
							is_operation_finished.setTrue();
							f.setVisible(false);
						} else JOptionPane.showMessageDialog(f, "This type already exists.");				
						//System.out.println(types.get_name(0));
					}else {
						JOptionPane.showMessageDialog(f, "Some fields are empty.");
					}			
				}
			});
		}
		
		private void set_close_button()
		{
			f.addWindowListener(new java.awt.event.WindowAdapter() {
			    @Override
			    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
			    	f.setVisible(false);
					is_operation_finished.setTrue();
			    }
			});
		}
		
		public void actionPerformed(ActionEvent e)
		{
			is_operation_finished.setFalse();
			f.setVisible(true);
			
		}
		
		public BooleanWrapper get_info()
		{
			return is_operation_finished;
		}
	
	}


