package fixedClasses;
import visitor.Visitor;

public class WinRouter extends Router {

	@Override
	public void send(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receive(String data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void accept(Visitor v) {
		v.accept(this);
	}
}
