import java.security.InvalidParameterException;
import java.util.Arrays;

public class MyArraylistT <T>{
	private T[] data;
	private int size ;
	
	public MyArraylistT() {
		size = 0;
		data = (T[])(new Object[10]);
	}
	
	public void add(T x) {
		if(size >= data.length) {
			T [] data2 = (T[])(new Object[data.length*2]);
			for( int i = 0; i < data.length; i++) {
				data2[i] = data[i];
			}
			data = data2; //increase size, reference back and old data deleted garbage collector
		}
		data[size] = x; // replace data at blank
		size++;
	}
	
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of bound: "+ index);
		}
		return data[index];
	}
	
	public void set(T x, int index) {
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of bound: "+ index);
		}
		data[index] = x;
	}
	
	public T[] toArray() {
		T [] x = (T[])(new Object[size]);
		for(int i = 0; i < x.length; i++) {
			x[i] = data[i];
		}
		return x;
	}
	
	public String toString() {
		T [] x  = toArray();
		return Arrays.toString(x);
	}
	
	public int size() {
		return size;
	}
	
	public void removeAt(int index) {
		if(index < 0 || index >= size) {
			throw new InvalidParameterException("index out of bound: "+ index);
		}
		
		for (int i = index; index < size; index++) {
			data[i] = data[i+1];
		}
		size--;
	}
	
}
