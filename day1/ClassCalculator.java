package week1.day1;
public class ClassCalculator 
{
	public int addtwo(int a, int b) 
	{
		return a+b;
	}
	public int addThree(int a,int b,int c)
	{
		return a+b+c;
	}
	public int subTwo(int a,int b)
	{
		return a-b;
	}
	public double subOf3( int a, double b,double c)
	{
		return a-b-c;
	}
	public int mulof2(int a,int b)
	{
		return a*b;
	}
    public double mulof3(int a, double b,double c)
    {
    	return a*b*c;
    }
    public int divof2(int a, int b)
    {
    	return a/b;
    }
    public double divof(double a, int b)
    {
    	return a/b;
    }
	public static void main(String[] args) 
	{
     ClassCalculator s1=  new ClassCalculator();
     System.out.println("Add two number :\n"+' '+s1.addtwo(5, 5));
     int SumOf3=s1.addThree(10,30,50);
     System.out.println("Add three number :\n"+' '+SumOf3);  
     System.out.println("Subtract the two number:\n"+s1.subTwo(100, 80));
     double Sub= s1.subOf3(100, 70.55,20.78);
     System.out.println("Subtraction of Three number:\n"+Sub);
     System.out.println("Multiple of two number:\n"+s1.mulof2(8, 16));
     double multiple=s1.mulof3(90, 23.787,1.567);
     System.out.println("Multiplication of three numbers:\n"+multiple);
	 System.out.println("Division of Two number:\n"+s1.divof2(88, 2));
	 double division=s1.divof(12300.999, 3);
	 System.out.println("Division of two numbers:\n"+division);
	}
	
}
