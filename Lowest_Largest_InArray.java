import java.util.Scanner;

class Arrays{
    public static int lowest(int [] arr)
    {
        int lowestNum = arr[0];
        for(int i =1 ; i<arr.length ; i++)
        {
            if(arr[i]<lowestNum)
            {
                lowestNum = arr[i];
            }
        }
        return lowestNum;
    }
    public  int largest(int [] arr)
    {
        int largestNum = arr[0];
        for(int i=1 ; i<arr.length ; i++)
        {
            if(largestNum < arr[i])
            {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }
}
public class Lowest_Largest_InArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];

//Loop for thr input of array elements
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

//Calling the method of lowest by using the class name because we make the static method
        int low = Arrays.lowest(arr);

//Calling the method by using the objects because method is without the static
        Arrays obj1 = new Arrays();
        int high = obj1.largest(arr);

        System.out.println("Lowest number in the array is " + low);
        System.out.println("Largest number in the array is " + high);
    }
}
