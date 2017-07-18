import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudDeptClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, String> map = new LinkedHashMap<String, String>();
		for(int i=0;i<n;i++){
		    map.put(sc.next(), sc.next());
		}
		String dept = sc.next();
		for(Map.Entry<String, String> m: map.entrySet()) {
		    if(m.getValue().equals(dept)) {
		        System.out.println(m.getKey());
		    }
		}
       sc.close();
	}

}
