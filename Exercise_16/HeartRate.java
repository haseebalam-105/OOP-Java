import java.util.Scanner;
public class HeartRate
{
	public static void main(String[] args)
	{
		
		Machine p1 = new Machine("Haseeb" , "Alam" , 6 , 6 , 2004);
		
		p1.Date();
		System.out.printf("First name: %s %n",p1.getFirstName());
		System.out.printf("Last name: %s %n",p1.getLastName());
		System.out.printf("DOB:  %d / %d / %d  %n",p1.getDay(),p1.getMonth(),p1.getYear());
		System.out.printf("Age: %d %n",p1.Age());
		System.out.printf("Heart rate: %.2f beats per minute %n",p1.MaxHeartRate());
		System.out.printf("Target heart range is from %.2f to %.2f %n",p1.RangeHeart50(),p1.RangeHeart85());

	}
}