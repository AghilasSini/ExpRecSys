package stage1;
import java.util.*;

public class VueExpertEnvironment implements Observateur {
	
	protected ExpertEnvironment eenvironment;
	protected ArrayList<String> tachesAfaire = new ArrayList<String>();
	

	@Override
	public void actualise()
	{
		// TODO Auto-generated method stub
		Hashtable<String, Integer> h = eenvironment.gettaches();
		Enumeration<String> en = h.keys();
		while (en.hasMoreElements())
		{
			String k = en.nextElement();
			if (h.get(k) ==0)
			tachesAfaire.add(k);
		}
		
			
	}
	
	public void affiche()
	{
		
		for (String t: tachesAfaire)
			System.out.println(t);
	}
	
	public VueExpertEnvironment(ExpertEnvironment eenvironment)
	{
		this.eenvironment = eenvironment;
		eenvironment.ajoute(this);
		actualise();
	}
}
