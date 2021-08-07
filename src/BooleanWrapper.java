
public class BooleanWrapper {
	private boolean b;
	public BooleanWrapper()
	{
		b = true;
	}
	
	public BooleanWrapper(boolean b)
	{
		this.b = b;
	}
	
	public void setTrue()
	{
		b = true;
	}
	
	public void setFalse()
	{
		b = false;
	}
	
	public boolean getValue()
	{
		return b;
	}
}
