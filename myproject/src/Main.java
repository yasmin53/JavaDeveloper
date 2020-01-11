
class Outer {
	int x = 10;
	static int y = 20;

	static class Inner {
		public void display() {

			System.out.println(y);
		}
	}
}

 public class Main {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.display();
	}
}
