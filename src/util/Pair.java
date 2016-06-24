package util;

public class Pair<V, V2> {

	private V val1;
	private V val2;

	public Pair(V val1, V val2) {
		
		this.val1 = val1;
		this.val2 = val2;
		
	}
	
	public V getVal1() {
		return this.val1;
	}
	
	public V getVal2() {
		return this.val2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.val1 == null) ? 0 : this.val1.hashCode());
		result = prime * result + ((this.val2 == null) ? 0 : this.val2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pair<?, ?> other = (Pair<?, ?>) obj;
		if (this.val1 == null) {
			if (other.val1 != null) {
				return false;
			}
		} else if (!this.val1.equals(other.val1)) {
			return false;
		}
		if (this.val2 == null) {
			if (other.val2 != null) {
				return false;
			}
		} else if (!this.val2.equals(other.val2)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pair [val1=" + this.val1 + ", val2=" + this.val2 + "]";
	}
	
}
