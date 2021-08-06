import javax.swing.JButton;

public class ButtonManager extends Thread{
	private JButton buttons[];
	private int size;
	private boolean operation;
	public ButtonManager(JButton type, JButton item)
	{
		buttons = new JButton[2];
		buttons[0] = type;
		buttons[1] = item;
		size = 2;
	}
	
	public void run()
	{
		disable_buttons();
		while(operation)
		{
			System.out.println("operation: " + operation + "\n");
		}
		enable_buttons();
	}
	
	private void enable_buttons()
	{
		for(int i=0; i<size;i++)
		{
			buttons[i].enable();
		}
	}
	
	private void disable_buttons()
	{
		for(int i=0; i<size;i++)
		{
			buttons[i].disable();
		}
	}
	
	public void select_operation(boolean operation)
	{
		this.operation = operation;
	}

}
