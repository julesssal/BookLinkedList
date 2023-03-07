package edu.monmouth.book;

public class BookException extends Exception {
	public void bookException()
	{
		System.err.println("Unable to create book");
	}
	public void bookException(String inputMessage)
	{
		System.err.println(inputMessage);
	}

}
