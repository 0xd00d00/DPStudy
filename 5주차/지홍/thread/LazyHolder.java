package singleton;

public class LazyHolder {

	//private static LazyHolder instance;
	// JVM에게 객체의 초기화를 떠님기는 방식으로, 멀티스레드 환경에서도 객체의 단일성을 보장할 수 있다. 
	// Class 를 로딩하고 초기화하는건 JVM 의 영역이고 Thread Safe 를 보장한다.

		private LazyHolder() {
		}
	
		public static LazyHolder getInstance() {
	
			return InLazyHolder.Instance;
		}
		
		private static class InLazyHolder {
			private static final LazyHolder Instance = new LazyHolder();
		}
	
}
