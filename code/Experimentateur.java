package stage1;
import java.util.*;

public abstract class Experimentateur {

	protected List<Participant> participants = new ArrayList<Participant>();
	protected List<Participant> partiNatives = new ArrayList<Participant>();
	protected List<Participant> partiNonNatives = new ArrayList<Participant>();
	
	protected abstract Participant CreerParticipant(double id);

	public void nouvParticipant(double id)
	{
		Participant participant = this.CreerParticipant(id);
		participant.getInformation();
		participants.add(participant);		
	}
	
	public void nouvParticipantNative(double id)
	{
		Participant participant = this.CreerParticipant(id);
		participant.getInformation();
		if (participant.estNative())
		{
			partiNatives.add(participant);
		}else
		{
			partiNonNatives.add(participant);
		}
	}
	
	public static void main(String[] args)
	{
		Experimentateur exp;
		exp = new ExpertDealingWithNative();
		exp.nouvParticipant(23);
		exp.nouvParticipantNative(23);
	    exp = new ExpertDealingWithNoneNative();
	    exp.nouvParticipant(25);
	    exp.nouvParticipantNative(25);
	    
	    System.out.println("\n");
	    Scanner read = new Scanner(System.in);
	    Texte txt;
	    System.out.print("Vous voulez rediger un texte a lire (1) ou un texte a repeter (2):");
	    double choice = read.nextDouble();
	    read.close();
	    if (choice == 1)
	    	txt = new TextAlire();
	    else
	    	txt = new TexteArepeter();
	    txt.creerDialogueTexte(100,100,100).getTextInformation();
	}
}
   