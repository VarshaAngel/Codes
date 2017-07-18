import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for(int i=a;i<=b;i++) {
		    if(i%X==0) {
		    sum += i;
		    }
		}
		System.out.println(sum);
        sc.close();
	}

}
