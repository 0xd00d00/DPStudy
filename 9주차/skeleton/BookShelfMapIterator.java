package iterator;

public class BookShelfMapIterator implements Iterator {

	private BookShelfMap bookShelfMap;
	private int index;
	
	public BookShelfMapIterator(BookShelfMap bookShelfMap) {
		// TODO Auto-generated constructor stub
		this.bookShelfMap = bookShelfMap;
	}
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index<bookShelfMap.getSize()) {
			return true;
		}
		
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelfMap.getBookat(index);
		index++;
		return book;
	}

}
