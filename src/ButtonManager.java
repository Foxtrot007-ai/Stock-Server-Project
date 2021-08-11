import javax.swing.JButton;

public class ButtonManager extends Thread{
	private JButton b_type_adder;
	private JButton b_item_adder;
	private JButton b_load;
	private JButton b_item_manager;
	private JButton b_type_manager;
	private BooleanWrapper operation;
	public ButtonManager(JButton type, JButton item, JButton load, JButton type_manager, JButton item_manager)
	{
		
		b_type_adder = type;
		b_item_adder = item;
		b_load = load;
		b_item_manager = item_manager;
		b_type_manager = type_manager;
		
	}
	
	public void run()
	{
		disable_buttons();
		while(!operation.getValue())
		{
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		enable_buttons();
		return;
	}
	
	private void enable_buttons()
	{
		b_type_adder.setEnabled(true);
		b_item_adder.setEnabled(true);
		b_load.setEnabled(true);
		b_type_manager.setEnabled(true);
		b_item_manager.setEnabled(true);
	}
	
	private void disable_buttons()
	{
		b_type_adder.setEnabled(false);
		b_item_adder.setEnabled(false);
		b_load.setEnabled(false);
		b_type_manager.setEnabled(false);
		b_item_manager.setEnabled(false);
	}
	
	public void select_operation(BooleanWrapper operation)
	{
		this.operation = operation;
	}

}
