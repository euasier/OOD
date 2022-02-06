package fixedClasses;

import visitor.Visitor;

public abstract class Router {

	public abstract void send(String data);
	public abstract void receive(String data);
	
	public abstract void accept(Visitor v);
}
