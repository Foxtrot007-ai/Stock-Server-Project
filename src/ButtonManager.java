import javax.swing.JButton;

public class ButtonManager extends Thread{
	private JButton b_type;
	private JButton b_item;
	private int size;
	private BooleanWrapper operation;
	public ButtonManager(JButton type, JButton item)
	{
		
		b_type = type;
		b_item = item;
		size = 2;
	}
	
	public void run()
	{
		disable_buttons();
		
		while(!operation.getValue())
		{
			System.out.println("operation: " + operation + "\n");
		}
		enable_buttons();
		return;
		
	}
	
	private void enable_buttons()
	{
		b_type.setEnabled(true);
		b_item.setEnabled(true);
	}
	
	private void disable_buttons()
	{
		b_type.setEnabled(false);
		b_item.setEnabled(false);
	}
	
	public void select_operation(BooleanWrapper operation)
	{
		this.operation = operation;
	}

}
