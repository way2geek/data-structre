package list;

public class Linear_list implements List {

	private Object[] listElem;
	private int curLen;

	public Linear_list(int size) {
		curLen = 0;
		listElem = new Object[size];
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
			if (curLen==0) {
				listElem[i] = x;
				curLen++;
			}else {
			for (int j = curLen-i+1;j>0 ; j--) {
				listElem[j+i-1] = listElem[j+i-2];
			}
			listElem[i] = x;
			curLen++;
		}} else {
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
	public void indexOf(Object o) {
		for (int i = 0; i < curLen; i++) {
			if (listElem[i].equals(o)) {
				System.out.print(i);
			}
		}

	}

	@Override
	public void display() {
		for (int i = 0; i < curLen; i++) {
			System.out.println(listElem[i].toString());
		}
	}

	public static void main(String args[]) {
		Linear_list l = new Linear_list(100);
		l.insert(0, "123");
		l.insert(1, "1234");
		l.insert(1, "12345");
		l.insert(1, "1234567");
		l.insert(1, "12345678");
		l.remove(1);
		l.display();
		l.indexOf("12345678");
		l.clear();
		l.display();
	}

}
