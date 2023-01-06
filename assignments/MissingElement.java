package week1.day2.assignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,3,5,6};
Arrays.sort(arr);
for(int i=arr[0];i<=arr.length;i++)
{
	if(i==arr[i-1])
	{
		continue;
	}
	else 
	{
		System.out.println("Missing elements in the array:"+i);
		break;
	}
	}
}
}


