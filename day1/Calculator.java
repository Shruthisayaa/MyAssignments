package week1.day1;

public class Calculator {
	public void sub() {
	int a=15;
	int b=5;
	System.out.println(a-b);
}
 public int mul(int a, int b) 
 {
	return (a*b);
 }
public static void main(String[] args)
{
	Calculator s1= new Calculator();
	s1.sub();
	int multiple= s1.mul(10,5);
	System.out.println(multiple);
}
}
