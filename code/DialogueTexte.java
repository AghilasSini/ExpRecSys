 package stage1;

public abstract class DialogueTexte {
	
	protected double taille;
	protected double num;
	protected double nbRepliques;

	public DialogueTexte(double taille, double num, double nbRepliques)
	{
		this.taille = taille;
		this.num = num;
		this.nbRepliques = nbRepliques;
	}
	
	public abstract void getTextInformation();
}
