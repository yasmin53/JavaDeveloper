/* 
 *  Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimete
 */
import java.util.*;
public class Second {
	public static void main(String[] args) {
		int l,b,a;
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		b=s.nextInt();
		a=l*b;
		System.out.println(a);
		 double p;
		 p=2*(l+b);
		 System.out.println(p);
		 
		
	}

}
