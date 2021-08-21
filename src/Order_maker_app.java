	import java.util.ArrayList;
import java.util.List;
	import javax.swing.*;



	import java.awt.*;
	import java.awt.event.*;
	import java.util.Random;



	public class  Order_maker_app implements ActionListener{
			private JFrame f;	
			private JButton b1;
			private JButton b2;
			private JButton b3;
			private JList<String>  lst_orders;
			
			private List_of_items items;
			private List<Order> orders;
			private Order rand_order;
			
			private DefaultListModel<String> l1;	
					
			private BooleanWrapper is_operation_finished;
			
			public  Order_maker_app(List_of_types t, List_of_items i)
			{
				
				
				items = i;
				is_operation_finished = new BooleanWrapper();
				orders = new ArrayList<Order>();
				
				
				f = new JFrame();
				l1 = new DefaultListModel<>(); 
				
				
				
				
				
				lst_orders = new JList<>(l1); 
				lst_orders.setBounds(40,50, 200, 200); 
				
				
				
			    
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
						Order temp = orders.get(lst_orders.getSelectedIndex());
						if(temp.in_progress())
						{
							JOptionPane.showMessageDialog(f, "Order in progress");
						}else{
							
							f.setVisible(false);
							is_operation_finished.setTrue();
						}
							
					}
				});
				
				b3 = new JButton("Dodaj nowy");
				b3.setBounds(105,10,75, 30);
				b3.setEnabled(true);
				b3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) {
						
							
							orders.add(rand_order.get_random_order(i));
							f.setVisible(false);
							is_operation_finished.setTrue();
						
							
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
				
			
				
				f.add(lst_orders);
				
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
				for(int i = 0; i < orders.size(); i++)
				{
					String at = (orders.get(i).in_progress()) ? "@" : " ";
					String sharp = (orders.get(i).is_taken()) ? "#" : " ";
					l1.add(i,orders.get(i).get_id() +"| " + at + " | " + sharp +" |");
				}
				
			}
			
			
			public void actionPerformed(ActionEvent e)
			{
				is_operation_finished.setFalse();
				update_list();
				f.setVisible(true);
				
			}
		
		}

