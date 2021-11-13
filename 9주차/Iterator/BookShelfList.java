package iterator;

import java.util.ArrayList;

public class BookShelfList implements Aggregate{
	
	private ArrayList<Book> books;
	private int last=0;
	
	public BookShelfList() {
		books = new ArrayList<Book>();
	}
	
	public Book getBookat(int last) {
		return books.get(last);
	}
	
	public void appendBook(Book book) {
		this.books.add(last, book);
		last++;
	}
	
	public int getSize() {
		// TODO Auto-generated method stub
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfListIterator(this);
	}

	

}
