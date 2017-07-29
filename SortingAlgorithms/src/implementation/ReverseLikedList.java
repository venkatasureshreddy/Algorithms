package implementation;

public class ReverseLikedList extends LinkedLst {

	public Node reverseList(Node head) {
		
		Node current = head;
		Node previous = null;
		Node temp = null;
		if ((head == null) || (head.next == null)) {
			return head;
		} else {
			while (current != null) {
				temp = current.next;
				current.next = previous;
				previous = current;
				current = temp;
			}
			head = previous;
			
			return head;

		}
	}

	public static void main(String[] args) {

		LinkedLst list = new LinkedLst();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		Node temp = list.head;
		System.out.println("Normal list");
		while (temp != null) {
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}

		ReverseLikedList re = new ReverseLikedList();

		Node rev = re.reverseList(list.head);
		System.out.println("Reverse List");
		while (rev != null) {
			System.out.print(rev.data + "\t");
			rev = rev.next;
		}

	}
}

	


class LinkedLst {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

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

}

