package stage1;

public class TextAlire implements Texte {

	@Override
	public DialogueTexte creerDialogueTexte(double taille, double num, double nbRepliques) {
		// TODO Auto-generated method stub
		return new DialogueTexteAlire(taille,num,nbRepliques);
	}

	@Override
	public MonologueTexte creerMonologueTexte(double taille, double num, double nbMots) {
		// TODO Auto-generated method stub
		return new MonologueTexteAlire(taille,num,nbMots);
	}
	
}
