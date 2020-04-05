package list;

public interface List {
	public void clear();
	public boolean isEmpty();
	public int length();
	public Object get(int i);
	public void insert(int i ,Object x);
	public void  remove (int i );
	public  int indexOf(Object o);
	public void display ();
} 
