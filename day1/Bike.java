package week1.day1;

public class Bike {
	
		public void applyBreak1()
		{
				System.out.println("Applied break in bike");
		}
			public void soundHorn1()
			{
				System.out.println("Sound Horn in bike");
			}
		public static void main(String[] args)
		{
			Car s1= new Car();
			Bike s2= new Bike();
			s1.applyBreak();
			s1.soundHorn();
			s2.applyBreak1();
			s2.soundHorn1();
		}
		
	}

