package fixedClasses;

import visitor.Visitor;

public class LinuxRouter extends Router {

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
		// TODO Auto-generated method stub
		v.accept(this);
	}

}
