

class Node {
	int val;
	Node next;
	Node (int data) {
		this.val = data;
		this.next = null;
	}
}

class secM {
	static Node head;
	secM () {
		this.head = null;
	}
	Node insert(int data) {
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

	int count(Node head) {
		int c = 0;
		Node t = head;
		while (t != null) {
			c++;
			t = t.next;
		}
		return c;
	}

	int findMid2 () {
		Node l = head;
		Node r = head;

		while (r != null && r.next != null) {
			l = l.next;
			r = r.next.next;
		}

		return l.val;

	}

	int findMid(Node head) {
		int n = count(head);
		int i = 0;
		while (i != n / 2) {
			head = head.next;
			i++;
		}
		return head.val;
	}

	void show(Node head) {
		Node p = head;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		secM obj = new secM();
		obj.head = obj.insert( 1);
		obj.head = obj.insert( 2);
		obj.head = obj.insert( 3);
		obj.head = obj.insert( 4);
		obj.head = obj.insert( 5);
		obj.head = obj.insert( 6);
		obj.head = obj.insert( 7);
		obj.head = obj.insert( 8);
		obj.show(obj.head);
		System.out.println(obj.findMid(obj.head));
		System.out.println(obj.findMid2());
	}
}