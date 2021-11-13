package iterator;

public class BookShelfListIterator implements Iterator {
	
	private BookShelfList bookShelfList;
	private int index;
	
	public BookShelfListIterator(BookShelfList bookShelfList) {
		this.bookShelfList = bookShelfList;
	}
	
	@Override
	public boolean hasNext() {
		
		if(index<bookShelfList.getSize()) {
			return true;
		}
			
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Book book  = bookShelfList.getBookat(index);
		++index;
		
		return book;
	}
	
	
	

}
