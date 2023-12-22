import java.util.Arrays;
public class Program2 {
public static void main(String[] args)
{
int Arr[] = { 10, 20, 30, 40, 50 };
int Arr1[] = {10, 20, 30};
Arrays.sort(Arr, 1, 3);
int arrayslength = Arr.length;
System.out.println("Integer Array to Sort: " + Arrays.toString(Arr));
System.out.println("Integer Array toString: "+ Arrays.toString(Arr));
System.out.println("Integer Copy of Range: " + 
Arrays.toString(Arrays.copyOfRange(Arr, 1, 3)));
System.out.println("Integer Arrays on Equal Basis: "+ Arrays.equals(Arr, Arr1));
System.out.println("Length of Arrays is :" + arrayslength);
 }
}