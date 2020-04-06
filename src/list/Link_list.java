package list;

public class Link_list {
	public Entry head;

	public Link_list() {
		head = new Entry();
	}

	class Entry {
		int data;
		Entry next;

		public Entry(int val) {
			this.data = val;
			next = null;
		}

		public Entry() {
			this.data = -1;
			next = null;
		}
	}

	public void insert(Entry node, int i) {
		if (this.head.next==null) {
			this.head.next=node;
		}else {
			Entry x = head;
			for (int j = 1; j <=i; j++) {
				  x = x.next;
			}
			if(x!=null) {
				node.next=x.next;
				x.next=node;
			}else {
				x.next=node;
			}
		}
	}
	public void display() {
		Entry x = head;
		while(x.next!=null) {
			System.out.println(x.next.data);
			x.next = x.next.next;
		}
	}
	public static void main(String args[]) {
		Link_list l = new Link_list();
		Link_list.Entry x = l.new Entry(123);
		Link_list.Entry y = l.new Entry(1234);
		Link_list.Entry z = l.new Entry(1235);
		Link_list.Entry k = l.new Entry(1236);
	    l.insert(x, 1);
	    l.insert(z, 1);
	    l.insert(y, 1);
	    l.insert(k, 1);
	    l.display();
	}
}
