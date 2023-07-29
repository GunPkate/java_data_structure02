//Arraylist = resizable array 
public class MyArraylistTest {

	public static void main(String args[]) {
		MyArraylist l = new MyArraylist();
		for(int i =0; i <100; i++) {
			l.add(i);
		}
		System.out.println(l.toString());
	}
}
