package union_find;

public class UF {
	private int[] id;

	public UF(int n ) {
		this.id = new int[n+1];
		for (int i=1 ;i<=n;i++ ) {
			id [i]=i;
		}
	}

	void Union(int p , int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i=1; i<=this.id.length;i++) {
			if (id[p]==pid) {
				id[p]=qid;
			}
		}
	}

	boolean connected(int q, int p) {
		if (this.id[q] == this.id[p]) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String args[]) {
		UF uf = new UF(10);
		uf.Union(1, 2);
		System.out.println(uf.connected(1, 2));
	}

}
