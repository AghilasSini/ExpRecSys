package stage1;

public class TexteArepeter implements Texte {

	@Override
	public DialogueTexte creerDialogueTexte(double taille, double num, double nbRepliques) {
		// TODO Auto-generated method stub
		return new DialogueTexteArepeter(taille,num,nbRepliques);
	}

	@Override
	public MonologueTexte creerMonologueTexte(double taille, double num, double nbMots) {
		// TODO Auto-generated method stub
		return new MonologueTexteArepeter(taille,num,nbMots);
	}

}
