package implementation;

public class LinkedListImplementation extends LinkedList {

	public static void main(String[] args) {

		LinkedListImplementation list = new LinkedListImplementation();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addFirst(5);
		list.addLast(60);
		list.remove(40);
		list.remove(60);

		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}

	}

}

class LinkedList {
	class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	Node head;
	Node root;

	// // This is add with O(1)
	// public void add(int data) {
	// if (head == null) {
	// head = new Node(data);
	// root = head;
	// } else {
	// if (root.next == null) {
	// root.next = new Node(data);
	// root = root.next;
	// }
	// }
	// }

	// This is add with O(n)
	public void add(int data) {
		Node temp = head;
		if (head == null) {
			head = new Node(data);

		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}

	}
	
	public void addFirst(int data){
		Node temp;
		if(head == null){
			head = new Node(data);
		}
		else {
			temp = new Node(data);
			temp.next = head;
			head = temp;
			
		}
	}
	
	public void addLast(int data){
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new Node(data);
	}
	
	public void remove(int data){
		Node temp = head;
		
		if(temp.data == data){
			head = head.next;
		}else {
			 while(temp.next.data != data){
				 
				 temp = temp.next;
			 }
			  temp.next = temp.next.next;
			
		}
	}
}
