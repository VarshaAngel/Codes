import java.util.*;
import java.util.Arrays;

class ArraysProg
{
 public static void main(String[] args)
 {
 int i;
 int[] a=new int[5];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter elements:");
 for(i=0;i<a.length;i++)
   a[i]=sc.nextInt();
 int sum=0,avg;
 for(i=0;i<a.length;i++)
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
 System.out.println("Enter the search element");
 int key=sc.nextInt();
 for(i=0;i<a.length;i++)
 {
  if(a[i]==key)
    break;
 }    
 System.out.println(i);
 }
}
