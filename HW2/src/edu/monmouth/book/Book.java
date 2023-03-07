package edu.monmouth.book;

public class Book {
	private int numberOfPages;
	private BookTypes bookType;
	private String title;
	private double price;
	
	public Book (int numberOfPages,double price , String title, BookTypes bookType) throws BookException
	{
		setNumberOfPages(numberOfPages);
		setBookType(bookType);
		setTitle(title);
		setPrice(price);
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public BookTypes getBookType() {
		return bookType;
	}

	public void setBookType(BookTypes bookType) {
		this.bookType = bookType;
	}

	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	  public String toString() {
		  /* change to invoke Book's toString */
		  return "\nTitle: "+  this.getTitle() + "\nPrice: " + this.getPrice() +"\nNumber Of Pages: " + this.getNumberOfPages() +"\nBook Type: " + this.getBookType();
	  }

}
