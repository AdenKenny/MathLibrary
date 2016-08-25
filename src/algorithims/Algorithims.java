package algorithims;

import java.util.Stack;

public class Algorithims {

	private static int ak(int m, int n) { // Ackerman's recursive.

		if (m == 0) {
			return n + 1;
		}

		else if (m > 0 && n == 0) {
			return ak(m - 1, 1);
		}

		else {
			return ak(m - 1, ak(m, n - 1));
		}

	}

	private static int a(int m, int n) { // Ackerman's iterative.
		Stack<Integer> sm = new Stack<>();
		sm.push(m);
		while (sm.size() != 1 || sm.peek() != 0) {
			int tm = sm.pop();
			if (tm == 0) {
				n++;
			}

			else if (tm > 0 && n == 0) {
				sm.push(tm - 1);
				n = 1;
			}

			else {
				sm.push(tm - 1);
				sm.push(tm);
				n--;
			}
		}

		return ++n;
	}

}
