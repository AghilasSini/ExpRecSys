package stage1;
import java.util.*;

import javax.sound.sampled.TargetDataLine;

public abstract class Sujet {

	protected List<Observateur> observateurs = new ArrayList<Observateur>();
	protected TargetDataLine parole;

	public void ajoute(Observateur observateur)
	{
		observateurs.add(observateur);
	}
	
	public void retire(Observateur observateur)
	{
		observateurs.remove(observateur);
	}
	
	public void notifie()
	{
		for (Observateur o: observateurs)
			o.actualise();
	}
}
