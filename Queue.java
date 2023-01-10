public class Queue {
	Node head;

	class Node {
		Node next;
		int value;

		public Node(int value) {
			this.value = value;
			next = null;
		}

		public Queue add(int value, Queue queue) {
			Node node = new Node(value);
			if (head == null) {
				head = node;
			} else {
				Node last = queue.head;
				while (last.next != null) {
					last = last.next;
				}
				last.next = node;
			}
			return queue;
		}
	}
}
