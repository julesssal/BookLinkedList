package edu.monmouth.hw2;

import edu.monmouth.book.Book;

public class ListNode {

  private Node head; 

  public ListNode() {
    head = null;
  }
  
  public Node removeFirst() {
	  if(head == null)
	  {
		  return null;
	  }
	  Node removedNode = head;
	  head = head.getNext();
	return removedNode;
  }
  
  
  public Node first() {
	    
	return head;
  }
  
  public Node last() {
	  if(head == null)
	  {
		  return null;
	  }

	  
	 Node temp = head;
	 while(temp.getNext()!= null)
	 {
		 temp = temp.getNext();
		
	 }
	return temp;
  }

  public void insert(Book book1) {
    Node newNode = new Node(book1);
    newNode.setNext(head);
    head = newNode;
  }

  public void insertEnd(Book book4) {
	  
	  Node newNode = new Node(book4);
	  Node last = head;
	  while(last.getNext() != null) 
	  {
		  last = last.getNext();
	  }
	  last.setNext(newNode);
	  

}

 public boolean isEmpty() { 

	 if(size() == 0)
	 {
		 return true;
	 }else
	 {
		 return false;
	 }            
  }
  
  public int size() {
    Node temp = head;
    int count = 0;
    while(temp != null)
    {
    	count++;
    	temp.getNext();
    }
    return count;
  }
    
  public void clear() {
    head = null;
  }

@Override
  public String toString() {
	StringBuilder logString = new StringBuilder();
    Node node;
    node = head;
    int count = 0;
    
    while (node != null) {
      count++;
      logString.append(count + " . " + node.getInfo() + "\n");
      node = node.getNext();
    }
    return logString.toString();
  }
}
