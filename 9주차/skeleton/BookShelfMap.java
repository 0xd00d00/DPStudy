package iterator;

import java.util.HashMap;
import java.util.Map;

public class BookShelfMap implements Aggregate{

	private Map<Integer, Book> bookShelfMap;
	private int index=0;
	
	public BookShelfMap() {
		this.bookShelfMap = new HashMap<Integer, Book>();
	}
	
	public void appendBook(Book book) {
		bookShelfMap.put(index, book);
		index++;
	}
	
	public Book getBookat(int index) {
		return bookShelfMap.get(index);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return bookShelfMap.size();
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfMapIterator(this);
	}

}
