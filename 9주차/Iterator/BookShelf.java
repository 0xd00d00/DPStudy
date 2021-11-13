package iterator;

public class BookShelf implements Aggregate {
	
	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize]; //books �迭 ����
	}
	
	public Book getBookAt(int index) {
		return books[index]; //books �迭 ���
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;//books �迭�� ��� �߰�
		last++;
	}
	
	public int getLength() {
		return last;//books �迭 ����
	}
	
	@Override
	public Iterator iterator() { //�������̽��� ���� ȣ���
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}
	

}
