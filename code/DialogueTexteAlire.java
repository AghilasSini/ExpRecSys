package stage1;

public class DialogueTexteAlire extends DialogueTexte {
	
	public DialogueTexteAlire(double taille, double num, double nbRepliques)
	{
		super(taille, num, nbRepliques);
	}

	@Override
	public void getTextInformation() {
		// TODO Auto-generated method stub
        System.out.println("Ce texte est sous forme d'un dialogue qui sera lu par les participants, de taille"+taille+", son numero est"+num+"est le nombre de ses repliques est"+nbRepliques);
	}

}
