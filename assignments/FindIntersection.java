package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1= {3,2,8,9,11,16};
int[] array2= {1,2,5,8,11,16};
for(int i=0;i<array1.length;i++)
{
	for(int j=0;j<array2.length;j++)
	{
		if(array1[i]== array2[j])
		{
			System.out.println("Intersection number :" +array1[i]);
		}
	}
}

}
	}
