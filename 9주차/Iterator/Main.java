package iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("1��å"));
		bookShelf.appendBook(new Book("2��å"));
		bookShelf.appendBook(new Book("3��å"));
		bookShelf.appendBook(new Book("4��å"));
		
		BookShelfList bookShelfList = new BookShelfList();
		bookShelfList.appendBook(new Book("5��å"));
		bookShelfList.appendBook(new Book("6��å"));
		bookShelfList.appendBook(new Book("7��å"));
		bookShelfList.appendBook(new Book("8��å"));
		
		
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
