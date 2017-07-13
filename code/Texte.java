package stage1;

public interface Texte {
	
	DialogueTexte creerDialogueTexte(double taille, double num, double nbRepliques);
	MonologueTexte creerMonologueTexte(double taille, double num, double nbMots);

}
