
public class ThreadCreation {

	public static void main(String[] args)
	{
		System.out.println("main thread");
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY-2);
		
		FirstThread firstThread=new FirstThread();
		SecondThread secondThread=new SecondThread();
		
		Thread threadOne=new Thread(firstThread);
		Thread threadTwo=new Thread(secondThread);
		
		firstThread.start();
		firstThread.start();
		
	}
	}
	
class FirstThread extends Thread
{
public void run()
{
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println("second method:" +i);
		}
		System.out.println("first method:" +i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
class SecondThread implements Runnable
{
	Resource resource;

	//public void run()
	//{
		//for(int i=1;i<=10;i++)
			//if(i%2==0)
			//{
				//System.out.println("second method:" +i);
			//}
		
			
			//try {
				//Thread.sleep(2000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
//}}
	


class Resource
{
	public void display(String message)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(message+""+i);
		}
	}
}

		}
	}
	
}