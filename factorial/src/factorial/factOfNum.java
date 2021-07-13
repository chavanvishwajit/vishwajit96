package factorial;

public class factOfNum {
	public static void main(String[]args) {
		
		int num=5;
		int b=1;
		// using while loop;
		int c=num;
		
		while(c>=1)
		{
			b=b*c;
			c--;
		}
	
		System.out.println("factorial of "+num +" is "+b);
		
		//using for loop:
		b=1;
		num=10;
		for(int a=num;a>0;a--)
		{
			b=b*a;
		}
		System.out.println("factorial of "+num +" is "+b);
	}

}
