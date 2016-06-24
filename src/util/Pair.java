package util;

public class Pair<V> {

	private V val1;
	private V val2;

	public Pair(Object val1, Object val2) {
		
		this.val1 = (V) val1;
		this.val2 = (V) val2;
		
	}
	
	public V getVal1() {
		return val1;
	}
	
	public V getVal2() {
		return val2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((val1 == null) ? 0 : val1.hashCode());
		result = prime * result + ((val2 == null) ? 0 : val2.hashCode());
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
		Pair other = (Pair) obj;
		if (val1 == null) {
			if (other.val1 != null) {
				return false;
			}
		} else if (!val1.equals(other.val1)) {
			return false;
		}
		if (val2 == null) {
			if (other.val2 != null) {
				return false;
			}
		} else if (!val2.equals(other.val2)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pair [val1=" + val1 + ", val2=" + val2 + "]";
	}
	
}
