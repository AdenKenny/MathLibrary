package util;

import java.util.ArrayList;
import java.util.List;

public class Vector {

	List<Number> elements;
	
	public Vector(Number... elements) {
		
		this.elements = new ArrayList<>();
		
		for(Number n : elements) {
			this.elements.add(n);
		}
	}
	
	public int numbElements() {
		return this.elements.size();
	}
	
	public Number[] getElements() {
		return (Number[]) this.elements.toArray();
	}
	
	public List<Number> getElementsList() {
		return this.elements;
	}
	
	public Number getElement(int index) {
		return this.elements.get(index);
	}
	
}
