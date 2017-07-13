package stage1;

public abstract class Participant {
	protected double id;
	
	public double getId() 
	{
		return this.id;
	}
	
	Participant(double id) 
	{
		this.id = id;
	}
	
	public abstract void getInformation() ;
	public abstract boolean estNative();
}
