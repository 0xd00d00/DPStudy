package iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("1번책"));
		bookShelf.appendBook(new Book("2번책"));
		bookShelf.appendBook(new Book("3번책"));
		bookShelf.appendBook(new Book("4번책"));
		
		BookShelfList bookShelfList = new BookShelfList();
		bookShelfList.appendBook(new Book("5번책"));
		bookShelfList.appendBook(new Book("6번책"));
		bookShelfList.appendBook(new Book("7번책"));
		bookShelfList.appendBook(new Book("8번책"));
		
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		} 
		Iterator it2 = bookShelfList.iterator();
		while(it2.hasNext()) {
			Book book2 = (Book)it2.next();
			System.out.println(book2.getName());
		}
	
	}

}
