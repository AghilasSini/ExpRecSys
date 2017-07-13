package stage1;

public abstract class MonologueTexte {
	
	protected double taille;
	protected double num;
	protected double nbMots;
	
	public MonologueTexte(double taille, double num, double nbMots)
	{
		this.taille = taille;
		this.num = num;
		this.nbMots = nbMots;
	}
	
	public abstract void getTextInformation();

}
