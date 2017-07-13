package stage1;
import java.util.*;
import javax.sound.sampled.*;

public abstract class AbstractModel implements Observable {
	
	protected TargetDataLine parole;
	protected String p1;
	protected ArrayList<Observer> listObserver = new ArrayList<Observer>();

	public abstract void setParole(TargetDataLine parole);
	public abstract void setp1(String p1);
	
	public void addObserver(Observer obs)
	{
		this.listObserver.add(obs);
	}
	
	public void removeObserver()
	{
		listObserver = new ArrayList<Observer>();
	}
	
	public void notifyObserver()
	{
		for (Observer obs: listObserver)
			obs.update();
	}
}
