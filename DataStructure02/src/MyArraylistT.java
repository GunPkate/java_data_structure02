import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArraylistT {
	private int[] data;
	private int size ;
	
	public MyArraylistT() {
		size = 0;
		data = new int[10];
	}
	
	public void add(int x) {
		if(size >= data.length) {
			int [] data2 = new int[data.length*2];
			for( int i = 0; i < data.length; i++) {
				data2[i] = data[i];
			}
			data = data2; //increase size, reference back and old data deleted garbage collector
		}
		data[size] = x; // replace data at blank
		size++;
	}
	
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of bound: "+ index);
		}
		return data[index];
	}
	
	public void set(int x, int index) {
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of bound: "+ index);
		}
		data[index] = x;
	}
	
	public int[] toArray() {
		int[] x = new int[size];
		for(int i = 0; i < x.length; i++) {
			x[i] = data[i];
		}
		return x;
	}
	
	public String toString() {
		int [] x = toArray();
		return Arrays.toString(x);
	}
}
