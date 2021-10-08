package singleton;

public class Sync {

	private static Sync instance;
	
	private Sync() {}
	
	public synchronized static Sync getInstance() {
		
		if(instance==null) {
			instance = new Sync();
		}
		
		return instance;
	}
}
