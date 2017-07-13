package stage1;

public class MonologueTexteAlire extends MonologueTexte {
	
	public MonologueTexteAlire(double taille, double num, double nbMots)
	{
		super(taille, num, nbMots);
	}

	@Override
	public void getTextInformation() {
		// TODO Auto-generated method stub
		System.out.println("Ce texte est un monologue qui sera lu par le participant, sa taille est"+taille+"son num est"+num+"son nb de mots est"+nbMots);
	}

}
