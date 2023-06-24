
class Node {
	int val;
	Node next;
	Node (int data) {
		this.val = data;
		this.next = null;
	}
}

class revSingle {

    static Node head;
	
	static Node insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}

	static void show() {
		Node p = head;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}

    static Node rev() {
        Node prev = null;
        Node curr = head;
        Node Next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = Next;
            if (curr == null) break;
            Next = curr.next;

        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {

        head = null;
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        show();

        head = rev();
        show();



    }
}