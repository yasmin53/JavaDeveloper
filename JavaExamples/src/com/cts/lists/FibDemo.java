package com.cts.lists;

public class FibDemo {

	public static void main(String[] args)
	{
	
	int n = 10, a = 0, b = 1;
   
    for (int i = 1; i <= n; ++i)
    {
        int sum = a + b;
        a = b;
        b = sum;
        System.out.println(sum);
    }
}
}
