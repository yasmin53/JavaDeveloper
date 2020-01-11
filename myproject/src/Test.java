/*
 * Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.

 */
import java.util.*;
import java.util.Scanner;
public class Test {
	public static void main(String[] args)
	{
		int t1,t2;
		Scanner s=new Scanner(System.in);
				t1=s.nextInt();
		        t2=s.nextInt();
		        float a;
		        a=(t1+t2)/2;
		        if((t1>75 && t2>75 && a>=80))
		        {
		        	System.out.println("selected");
		        }
		        	
		        
		        	else
		        	System.out.println("rejected");
		        
	}

}
