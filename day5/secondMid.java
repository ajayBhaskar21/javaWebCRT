import java.util.*;
class secondMid {

	static int secMid(LinkedList<Integer> head) {
		return head.get(head.size() / 2) ;
	}

	public static void main(String[] args) {	
		LinkedList<Integer> head = new LinkedList<>();
		head.add(1);
		head.add(2);
		head.add(3);
		head.add(4);
		head.add(5);
		head.add(6);
		head.add(7);
		head.add(8);
		System.out.println(secMid(head));
	}
}