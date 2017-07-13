package stage1;

public class ExpertDealingWithNoneNative extends Experimentateur {

	@Override
	protected Participant CreerParticipant(double id) {
		// TODO Auto-generated method stub
		return new NonNative(id);
	}

}
