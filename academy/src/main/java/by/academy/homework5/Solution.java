package by.academy.homework5;

//Дан указатель на последний элемент двусвязного списка(tail). Head/tail может быть null, это говорит
//о том, что список пуст, возвращаем null. Поменять порядок элементов в списке на обратный. Измените
//следующий(next) и предыдущий (prev) указатели всех узлов, чтобы направление списка изменилось. 
//Вернуть список на последний элемент измененного(перевернутого) списка. 
//Описание:
//Закончите функцию ниже, которая изменит порядок списка на обратный. Функция принимает следующие 
//параметры:
//head – указатель на последний элемент списка в DoublyLinkedList
//Формат ввода:
//Первая линия принимает integer t – количество элементов в списке
//Следующие n линий – представляют собой элементы двусвязного списка.
//Ограничения:
//0 <= n <= 1000
//0 <= DoubleLinkedListNode.data <= 1000
//Формат вывода:
//Должен вернуться указатель на последний элемент перевернутого списка.


import java.io.IOException;
import java.util.Scanner;

public class Solution {
	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			System.out.print(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	// Complete the reverse function below.

	/*
	 * For your reference:
	 *
	 * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
	 * DoublyLinkedListNode prev; }
	 *
	 */
	public static DoublyLinkedListNode reverse(DoublyLinkedList list) {
		DoublyLinkedListNode node = list.head;
		
		while (node!=null) {
			DoublyLinkedListNode t = node.next;
			node.next=node.prev;
			node.prev=t;
			
			node = t;
		} 
		
		node=list.head;
		list.head=list.tail;
		list.tail=node;
		
		return list.head;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		DoublyLinkedList llist = new DoublyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			llist.insertNode(llistItem);
		}		
		DoublyLinkedListNode llist1 = reverse(llist);

		printDoublyLinkedList(llist1, " ");
		scanner.close();
	}

}
