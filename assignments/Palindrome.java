package week1.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int originalNum=34343;
          int check=0; int temp=0;
          for(int num=originalNum;num!=0;num=num/10)
          {
        	  temp=num%10;
        	  check=(check*10)+temp;
          }
if(check==originalNum)
{
	System.out.println(originalNum+ " is a Palindrome");
}
else
{
	System.out.println(originalNum+ " is not a Palindrome");
}
	}

}
