package stage1;

public class MonologueTexteArepeter extends MonologueTexte {
	
	public MonologueTexteArepeter(double taille, double num, double nbMots)
	{
		super(taille, num, nbMots);
	}

	@Override
	public void getTextInformation() {
		// TODO Auto-generated method stub
		System.out.println("Ce texte est un monologue qui sera repeté par un participant, de taille"+taille+"son num est"+num+"son nombre de mots est"+nbMots);
	}

}

