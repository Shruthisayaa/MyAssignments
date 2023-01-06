package week1.day2.assignments;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int input=49;
	    boolean flag = false;
	    for(int i=2;i<input;i++)
	    {
	    	if(input%i==0)
	    	{
	    		flag= true;
	    		break;
	    	}
	    }	
	    if(!flag)
	    {
	    	System.out.println(input+ " is a prime number");
	    }
	    else
	    {
	    	System.out.println(input+ " is not a prime number");
	    }
	}
}