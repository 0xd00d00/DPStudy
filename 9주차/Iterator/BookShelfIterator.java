package iterator;

public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	
	@Override
	public boolean hasNext() {
		
		if(index<bookShelf.getLength()) {
			return true;
		}
			
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book  = bookShelf.getBookAt(index);
		++index;
		
		return book;
	}
	

}
