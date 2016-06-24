package util;

public class Pair2<K, V> {

    private final K val1;
    private final V val2;

    public static <K, V> Pair2<K, V> createPair(K element0, V element1) {
        return new Pair2<K, V>(element0, element1);
    }

    public Pair2(K val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public K getVal1() {
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

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair2 other = (Pair2) obj;
		if (val1 == null) {
			if (other.val1 != null)
				return false;
		} else if (!val1.equals(other.val1))
			return false;
		if (val2 == null) {
			if (other.val2 != null)
				return false;
		} else if (!val2.equals(other.val2))
			return false;
		return true;
	}

    
}