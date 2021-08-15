import java.io.Serializable;

public class Three_dimensional_parameters  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float x;
	private float y;
	private float z;
	public Three_dimensional_parameters(float a, float b, float c)
	{
		x = a;
		y = b;
		z = c;
	}
	
	public float get_x()
	{
		return x;
	}
	
	public float get_y()
	{
		return y;
	}
	
	public float get_z()
	{
		return z;
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
        
        Three_dimensional_parameters other = (Three_dimensional_parameters) obj;
        
		if(x != other.get_x()
		&& y != other.get_y()
		&& z != other.get_z())
			return false;
		
		return true;
	}
}
