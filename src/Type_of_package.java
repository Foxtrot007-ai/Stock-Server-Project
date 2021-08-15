import java.io.Serializable;

public class Type_of_package  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
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
	
	public float get_weight()
	{
		return weight;	
	}
	
	public float time_to_pick_up()
	{
		return weight / 30;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
        if (this == obj)
            return true;
        
        if (obj == null)
            return false;
        
        if (getClass() != obj.getClass())
        	return false;
        
        Type_of_package other = (Type_of_package) obj;
        
		if(!name_of_type.equals(other.toString())
				|| !form.equals(other.get_form())
				|| weight != other.get_weight())
			return false;
		
		return true;
	}
}
