package stage1;

public class NonNative extends Participant {

	public NonNative(double id)
	{
		super(id);
	}
	
	@Override
	public void getInformation()
	{
		// TODO Auto-generated method stub
        System.out.println("Votre participant est non native et son identifiant est:"+this.getId());
	}
	
	@Override
	public boolean estNative() 
	{
		// TODO Auto-generated method stub
		return false;
	}	
}
 