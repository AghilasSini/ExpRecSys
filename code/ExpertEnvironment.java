package stage1;
import java.util.*;
import javax.sound.sampled.TargetDataLine;

public class ExpertEnvironment extends Sujet {
	
	protected Hashtable<String,Integer> taches = new Hashtable<String,Integer>();
	protected Hashtable<Parametre,Integer> parametres;
	
	public Hashtable<String,Integer> gettaches()
	{
		return this.taches;
	}
	
	public void definirTache(String tache)
	{
		taches.put(tache,0); //Quand la clé tache est ajouté, elle est dans un 1er temps non validée
		notifie();
	}
	
	public void validerTache(String tache)
	{
		if (taches.containsKey(tache))		
			taches.put(tache,1); //puisque la clé tache existe deja elle s'ajoute pas mais elle change de valeur
		notifie();
	}
	
	public void reglerParametre(Parametre parametre)
	{
		if (parametres.containsKey(parametre))
			parametres.put(parametre,1);
	}
	
	public void setParole(TargetDataLine parole)
	{
		this.parole = parole;
	}
}
