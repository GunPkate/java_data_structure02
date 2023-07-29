//Arraylist = resizable array 
public class MyArraylistTest {

	public static void main(String args[]) {
		MyArraylist l = new MyArraylist();
		for(int i =0; i <10; i++) {
			l.add((int) (Math.random()*100) );
		}
		l.set(4400, 2);
		l.get(3);
		l.add(3);
		System.out.println(l.toString());
		System.out.println(l.get(3));
	}
}
