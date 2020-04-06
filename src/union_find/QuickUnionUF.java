package union_find;

public class QuickUnionUF {
	private int[] id;

	public QuickUnionUF(int n) {
		this.id = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			id[i] = i;
		}
	}

	public void Union(int q, int p) {
		int proot = root(p);
		int qroot = root(q);
	    id[qroot] = proot;
	}

	boolean Connected(int q, int p) {
		return root(p) == root(q);
	}

	private int root(int p) {
		while (id[p] != p) {
			p = id[p];
		}
		return p;
	}
	public static void main(String args[]) {
		QuickUnionUF uf = new QuickUnionUF(10);
		uf.Union(1, 2);
		System.out.println(uf.Connected(2, 1));
	}
}
