package stage1;
import javax.sound.sampled.*;

public abstract class AbstractControler {

	protected AbstractModel m;
	protected TargetDataLine parole;
	protected String p1;
	protected String p2;
	protected String p3;
	protected String p4;
	protected String p5;
	protected String p6;
	protected String p7;
	protected String p8;
	protected String p9;
	protected String[] t = {p1,p2,p3,p4,p5,p6,p7,p8,p9};
	
	public AbstractControler(AbstractModel m)
	{
		this.m = m;
	}
	
	//definit la parole
	public void setParole(TargetDataLine parole)
	{
		this.parole = parole;
		controlaudio();
	}
	public void setp(String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		this.p9 = p9;
		controltext();
	}
	public void setpi(String pi, int i) {
		
		this.t[i] = pi;
		controltext();
	}
	
	
	public abstract void controlaudio();
	public abstract void controltext();

	
}
