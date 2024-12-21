class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

_______________________________________________________________________________________________________
  import java.util.HashMap;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            if (charIndexMap.containsKey(s.charAt(end))) {
                start = Math.max(charIndexMap.get(s.charAt(end)) + 1, start);
            }
            charIndexMap.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); 
        System.out.println(lengthOfLongestSubstring("bbbbb"));   
        System.out.println(lengthOfLongestSubstring("pwwkew"));  
    }
}

_______________________________________________________________________________________________________
  class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        
        return reverse == xcopy;        
    }
}

_______________________________________________________________________________________________________
  import java.util.Scanner;
public class IfElseHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("yes);
        }
        if(n%2==0)
        {
            if(n>=2 && n<=5)
            {
                System.out.println("no");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("yes");
            }
            else if(n>20)
            {
                System.out.println("No");
            }
        }
    }
}
_______________________________________________________________________________________________________
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
        
        scanner.close();
    }
}
