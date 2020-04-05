package list;

public class Linear_list implements List {

	private Object[] listElem;
	private int curLen;

	public Linear_list(int size) {
		curLen = 0;
		listElem = new Object[size];
	}

	public static void merge(Linear_list list1, Linear_list list2) {
		Linear_list list = new Linear_list(list1.curLen + list2.curLen);
//		list.listElem[list1.curLen]= list1.listElem[list1.curLen];
//		list.curLen=list1.curLen;
//		list.display();
		for (int i = 0; i < list1.curLen; i++) {
			list.insert(i, list1.listElem[i]);
		}
		// list2.display();
		for (int i = 0; i < list2.curLen; i++) {
			if (list.indexOf(list2.listElem[i]) == -1) {
				// System.out.println(list.indexOf(list2.listElem[i]));
				list.insert(list.curLen, list2.listElem[i]);
			}
		}
		list.display();
	}

	@Override
	public void clear() {
		for (int i = 0; i <= curLen; i++) {
			listElem[i] = null;
		}
		curLen = 0;
	}

	@Override
	public boolean isEmpty() {
		if (curLen > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int length() {

		return curLen;
	}

	@Override
	public Object get(int i) {

		return listElem[i];
	}

	@Override
	public void insert(int i, Object x) {
		if (i <= curLen) {
			if (curLen == 0||i==curLen) {
				listElem[i] = x;
				curLen++;
			} else {
				for (int j = curLen - i + 1; j > 0; j--) {
					listElem[j + i - 1] = listElem[j + i - 2];
				}
				listElem[i] = x;
				curLen++;
			}
		} else {
			System.out.print("invalid index");
		}

	}

	@Override
	public void remove(int i) {
		for (int j = i; j <= curLen - i; j++) {
			listElem[j - 1] = listElem[j];
		}
		curLen--;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < curLen; i++) {
			if (this.listElem[i].equals(o)) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public void display() {
		for (int i = 0; i < curLen; i++) {
			System.out.println(listElem[i].toString());
		}
	}

	public static void main(String args[]) {
		Linear_list l1 = new Linear_list(100);
		Linear_list l2 = new Linear_list(100);
		l1.insert(0, "123");
		l1.insert(1, "1234");
		l1.insert(1, "12345");
		l1.insert(1, "1234567");
		l1.insert(1, "12345678");
		l2.insert(0, "321");
		l2.insert(1, "3210");
		l2.insert(1, "12345");
		l2.insert(1, "12333");
		l2.insert(1, "1234678");
		l2.insert(5, "1234678");
		merge(l1, l2);

	}

}
