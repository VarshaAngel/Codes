private static void subPal(String str) {
        String s1 = "";
        int N = str.length(), count = 0;
        Set<String> palindromeArray = new HashSet<String>();
        System.out.println("Given string : " + str);
        System.out.println("******** Ignoring single character as substring palindrome");
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int k = i + j - 1;
                if (k >= N)
                    continue;
                s1 = str.substring(j, i + j);
                if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                    palindromeArray.add(s1);
                }
            }

        }
        System.out.println(palindromeArray);
        for (String s : palindromeArray)
            System.out.println(s + " - is a palindrome string.");
        System.out.println("The no.of substring that are palindrome : "
                + palindromeArray.size());
    }



import java.util.*;

import java.lang.*;


public class PalindromeMaking {
	

	public static int pali_check(String s){
		
                  if(s.length() == 0 || s.length() == 1)

			return 0;

		if(s.charAt(0) == s.charAt(s.length()-1))

			return 1 + pali_check(s.substring(1, s.length()-1));
		
                else
 
			return Math.max(pali_check(s.substring(1,s.length())), pali_check(s.substring(0,s.length()-1)));

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String user_input = in.next();

		int num_of_digits = pali_check(user_input);

		System.out.println(user_input.length() - (num_of_digits*2));

	}


}
