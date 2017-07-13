package stage1;

public class ExpertDealingWithNative extends Experimentateur {

	@Override
	protected Participant CreerParticipant(double id) {
		// TODO Auto-generated method stub
		return new Native(id);
	}

}
