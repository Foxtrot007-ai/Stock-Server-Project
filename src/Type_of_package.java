
public class Type_of_package {
	private String name_of_type;
	private Three_dimensional_parameters form; 
	private float weight;
	public Type_of_package(String name, float x, float y, float z, float weight)
	{
		name_of_type = name;
		form = new Three_dimensional_parameters(x,y,z);
		this.weight = weight;
	}
	
	public Three_dimensional_parameters get_form()
	{
		return form;
	}
	
	public String toString()
	{
		return name_of_type;
	}
	
	public float time_to_pick_up()
	{
		return weight / 30;
	}
	
}
