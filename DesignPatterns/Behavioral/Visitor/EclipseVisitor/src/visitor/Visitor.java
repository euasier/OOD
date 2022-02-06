package visitor;

import fixedClasses.LinuxRouter;
import fixedClasses.Router;
import fixedClasses.WinRouter;

public interface Visitor {
	public void accept(WinRouter wr);
	public void accept(LinuxRouter wr);
}
