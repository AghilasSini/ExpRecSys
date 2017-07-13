package stage1;

public class Native extends Participant {

	public Native(double id)
	{
		super(id);
	}
	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println("Votre participant est native et son identifiant est: "+this.getId());
	}

	@Override
	public boolean estNative() 
	{
		// TODO Auto-generated method stub
		return true;
	}	
}
