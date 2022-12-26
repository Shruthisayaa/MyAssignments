package week1.day1;

public class NewMobile 
{
   public void makeacall()
   {
	   String MobileModel="Apple";
	   float MobileWeight=3.3f; 
	   System.out.println("My mobile model is :"+MobileModel);
	   System.out.println("My mobile weight is :"+MobileWeight);
   }
   public void sendSms()
   {
	   boolean ChargeFull=true;
	   int MobCost= 15000;
	   System.out.println("My mobile is fully charged:"+ChargeFull);
	   System.out.println("My mobile cost is :"+MobCost);
   }
   
	public static void main(String[] args) 
	{
		NewMobile s1= new NewMobile();
        s1.makeacall();
        s1.sendSms();
        System.out.println("This is my Mobile");
	}

}
