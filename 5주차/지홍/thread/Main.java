package singleton;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			new Thread() {

				@Override
				public void run() {

					Singleton instance = Singleton.getInstance();
					Singleton instance2 = Singleton.getInstance();
					//LazyHolder instance =LazyHolder.getInstance();
					//LazyHolder instance2 =LazyHolder.getInstance();
					//Sync instance = Sync.getInstance();
					//Sync instance2 = Sync.getInstance();
					
					
					System.out.println("1 :" + instance.hashCode());
					System.out.println("2 :" + instance2.hashCode());

				}

			}.start();

		}
		for (int i = 0; i < 5; i++) {
			new Thread() {

				@Override
				public void run() {

					Singleton instance = Singleton.getInstance();
					Singleton instance2 = Singleton.getInstance();
					//LazyHolder instance =LazyHolder.getInstance();
					//LazyHolder instance2 =LazyHolder.getInstance();
					//Sync instance = Sync.getInstance();
					//Sync instance2 = Sync.getInstance();
					
					System.out.println("3 :" + instance.hashCode());
					System.out.println("4 :" + instance2.hashCode());

				}

			}.start();

		}
		


	}

}
