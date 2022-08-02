package by.academy.lesson15.linkedList;

import java.util.LinkedList;

public class LinkedListCustom <T>{
	private Node head;
	 private Node tail;
	 private int size = 0;

	 public void add(T value) {
	  Node node = new Node(value);
	  if (head == null) {
	   head = node;
	   tail = node;
	  } else {
	   tail.next = node;
	   node.prev = tail;
	   tail = node;
	  }
	  size++;
	 }

	 public int getSize() {
	  return size;
	 }

	 public void add(int index, T value) {

	  if (size < index || index < 0) {
	   System.out.println("Ошибка");
	   return;
	  } else if (size == index) {
	   add(value);
	   return;
	  } else {
	   Node node = new Node(value);
	   int counter = 0;
	   Node current = head;
	   while (counter < index) {
	    current = current.next;
	    counter++;
	   }
	   node.next = current;
	   node.prev = current.prev;
	   current.prev.next = node;
	   current.prev = node;
	   size++;
	  }
	 }

	 public void remove(int index) {
		if (size==1 && index==0) {
			head=null;
			tail=null;
			size=0;
			return;
		}
		 if (index==size-1) {
			 Node prev=tail.prev;
			 prev.next=null;
			 tail=prev;
			 size--;
			 return;
		 }
					
//		if (index>=0 && index<size) {
//			Node node=getNode(index);
//			Node prev=node.prev;
//			Node next=node.next;
//		 if (index==0) {
//			 head=next;
//		 }
//		} 
		 
	 }
	 
	 
	 
	 public T get(int index) {

	  Node current = head;
	  int counter = 0;

	  while (counter < index) {
	   current = current.next;
	   counter++;
	  }

	  return current.value;
	 }

	 public void print() {
	  Node current = head;
	  while (current != null) {
	   System.out.println(current.value);
	   current = current.next;
	  }
	 }

	 class Node {

	  T value;
	  Node next;
	  Node prev;

	  Node(T value) {
	   this.value = value;
	  }

	  @Override
	  public String toString() {
	   StringBuilder builder = new StringBuilder();
	   builder.append("Node [value=");
	   builder.append(value);
	   builder.append(", next=");
	   builder.append(next);
	   builder.append(", prev=");
	   builder.append(prev);
	   builder.append("]");
	   return builder.toString();
	  }

	 }
}
