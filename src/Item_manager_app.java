



import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class  Item_manager_app implements ActionListener{
		private JFrame f;	
		private JButton b1;
		private JButton b2;
		private JList<String>  Lst_items;
		
		
		private List_of_items items;
		
		private DefaultListModel<String> l1;	
		
		
		private BooleanWrapper is_operation_finished;
		/*public JPanel show_window()
		{
			f.setLocation(800, 200);
			return f;
		}*/
		public  Item_manager_app(List_of_items i)
		{
	
			items = i;
			is_operation_finished = new BooleanWrapper();
			
			
			f = new JFrame();
			l1 = new DefaultListModel<>(); 
			
			
			
			
			
			Lst_items = new JList<>(l1); 
			Lst_items.setBounds(40,50, 200, 200); 
			
			
			
		    
			b1 = new JButton("Anuluj");
			b1.setBounds(55,265,75, 30);
			b1.setEnabled(true);
			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {	
					f.setVisible(false);
					is_operation_finished.setTrue();
				}
			});
			
			b2 = new JButton("Usun");
			b2.setBounds(155,265,75, 30);
			b2.setEnabled(true);
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt) {
					 
						String item_id = items.get_id(Lst_items.getSelectedIndex());
						if(items.delete_item(item_id))
						{
							f.setVisible(false);
							is_operation_finished.setTrue();
						}else {
							JOptionPane.showMessageDialog(f, "Something went wrong.");
						}
						
					}
						
				
			});
			f.addWindowListener(new java.awt.event.WindowAdapter() {
			    @Override
			    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
			    	f.setVisible(false);
					is_operation_finished.setTrue();
			    }
			});
		
			
			f.add(b1);
			f.add(b2);    
			
		
			
			f.add(Lst_items);
			
			
			f.setSize(300,350);
			f.setLayout(null); 
			f.setVisible(false);
			
		}
		
		public BooleanWrapper get_info()
		{
			return is_operation_finished;
		}
		
		public void update_list()
		{
			l1.clear();
			for(int i = 0; i < items.size(); i++)
			{
				l1.add(i,items.get_name(i));
				
			}
			
		}
		
		/*public JFrame get_frame() full app concept
		{
			return f;						
		}*/
		
		public void actionPerformed(ActionEvent e)
		{
			is_operation_finished.setFalse();
			update_list();
			f.setVisible(true);
			
		}
	
	}




