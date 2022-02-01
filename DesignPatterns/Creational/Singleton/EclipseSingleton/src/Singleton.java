
public class Singleton {

	private static Singleton instance = null;
	
	private Singleton() {
	}
	
	public Singleton getInstance() {
		if(Singleton.instance==null) {
			Singleton.instance = new Singleton();
		}
		
		return Singleton.instance;
	}
}
