
public class AnonymousConcrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2()
		{
			public void display()
			{
				System.out.println("good morning");
			}
		};
		t.display();
		
	}
}
		
		class Test2
		{
			public void display()
			{
				System.out.println("hi");
			
			}
		}
		
		interface Test3
		{
		public	void display()
		{
			System.out.println("hello");
		}
		}


