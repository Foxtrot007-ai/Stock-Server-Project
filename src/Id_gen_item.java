
public class Id_gen_item {
	private char letters;
	private int numbers;
	public Id_gen_item()
	{
		letters = 'A';
		numbers = 0;
	}
	
	private String make_id()
	{
		String temp = "";
		temp += letters;
		
		if(numbers < 100)
		{
			if(numbers < 10) temp += "00";
			else temp += "0";
		}
		
		temp += Integer.toString(numbers);
		
		return temp;
	}
	
	private void increase()
	{
		if(!make_id().equals("Z999"))
		{
			numbers++;
		
			if(numbers > 999)
			{
				numbers = 0;
				letters++;
			}
		}
		
	}
	
	public String next_id()
	{
		String temp = make_id();
		increase();
		return temp;
	}
}
