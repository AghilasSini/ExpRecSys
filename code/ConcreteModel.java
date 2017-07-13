package stage1;

import javax.sound.sampled.TargetDataLine;

public class ConcreteModel extends AbstractModel {

	@Override
	public void setParole(TargetDataLine parole) {
		// TODO Auto-generated method stub
		//on stocke la parole
		this.parole = parole;
	}
	
	public void setp1(String p1) {
		this.p1 = p1;
	}

	
}
