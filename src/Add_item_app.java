

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Add_item_app implements ActionListener{
		private JFrame f;
		
		private JButton b1;
		private JButton b2;
		
		
		private int J_y;
		private int JLabel_height;
		private int JLabel_width;
		
		private JLabel L_name;
		private JLabel L_info;
		private JLabel L_types;
		
		
		private int JTextField_height;
		private int JTextField_width;
		
		private JTextField TF_name;
		private JTextField TF_info;
		
		private JList<String>  Lst_types;
		private List_of_items items;
		private List_of_types types;
		private DefaultListModel<String> l1;
		
		private Id_gen_item gen;
		
		private boolean ended;
		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public  Add_item_app(List_of_types t, List_of_items i)
		{
			items = i;
			types = t;
			
			gen = new Id_gen_item();
			
			f = new JFrame();
			l1 = new DefaultListModel<>(); 
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
			//list
			L_types = new JLabel();  
			L_types.setBounds(J_y,55, JLabel_width, JLabel_height);
			L_types.setText("Select type: ");
			
			
			Lst_types = new JList<>(l1); 
			Lst_types.setBounds(J_y,80, JTextField_width, JTextField_height+60); 
			
			//list
			L_info = new JLabel();  
			L_info.setBounds(J_y,165, JLabel_width + 10, JLabel_height);  
			L_info.setText("Enter information: ");
			
			TF_info = new JTextField();  
			TF_info.setBounds(J_y,190, JTextField_width, JTextField_height + 40);  
			TF_info.setEditable(true);
			
		    
			b1 = new JButton("Anuluj");
			b1.setBounds(55,265,75, 30);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					ended = false;
					f.setVisible(false);
							
				}
			});
			
			b2 = new JButton("Dodaj");
			b2.setBounds(155,265,75, 30);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					System.out.println("Enter a number: " + types.get_name(0));
					if(!TF_name.getText().equals("")
						&& !TF_info.getText().equals("")
						&& !Lst_types.isSelectionEmpty())
					{
						Item temp 
						= new Item(gen.next_id(),TF_name.getText(),types.get_type(Lst_types.getSelectedIndex()),
								TF_info.getText());
						items.add_item(temp);
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
			f.add(L_types);
			f.add(L_info);
			
			
			f.add(TF_name);
			f.add(Lst_types);
			f.add(TF_info);
			f.setSize(300,350);
			f.setLayout(null); 
			f.setVisible(false);
			
		}
		public boolean if_operation_ended()
		{
			return ended;
		}
		
		public void update_list()
		{
			l1.clear();
			for(int i = 0; i < types.size(); i++)
			{
				l1.add(i,types.get_name(i));
				
			}
			
		}
		
		public JFrame get_frame()
		{
			return f;						
		}
		public void actionPerformed(ActionEvent e)
		{
			ended = false;
			update_list();
			f.setVisible(true);
			
		}
	
	}


