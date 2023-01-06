package week1.day2.assignments;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number =-16;
System.out.println("Transformation of negative number to positive number");
System.out.println("=====================================================");
if(number<0)
{
	System.out.println("Number is negative:"+number);
	number=number*-1;
	System.out.println("Which need to be converted:" +number);
}
else if(number>0)
{	
	System.out.println("Number is postive :" +number);
	number=number*-1;
	System.out.println("which need to be converted: " +number);
}

	}

}
