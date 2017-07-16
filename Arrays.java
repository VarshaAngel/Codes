import java.util.*;
import java.util.Arrays;

class Arrays
{
 public static void main(String[] args)
 {
 int[] a=new int[5];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter elements:");
 for(int i=0;i<a.length;i++)
   a[i]=sc.nextInt();
 int sum=0,avg;
 for(int i=0;i<a.length;i++)
 {
  sum+=a[i];
 }
 avg=sum/a.length;
 System.out.println("Sum: "+sum+" Average: "+avg);
 int max,min;
 Arrays.sort(a);
 min=a[0];
 max=a[a.length-1];
 System.out.println("Maximum: "+max+" Minimum: "+min);    
 }
}
