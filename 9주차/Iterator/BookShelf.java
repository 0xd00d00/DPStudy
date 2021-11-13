package iterator;

public class BookShelf implements Aggregate {
	
	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize]; //books 배열 선언
	}
	
	public Book getBookAt(int index) {
		return books[index]; //books 배열 출력
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;//books 배열에 요소 추가
		last++;
	}
	
	public int getLength() {
		return last;//books 배열 길이
	}
	
	@Override
	public Iterator iterator() { //인터페이스를 통해 호출됨
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	

}
