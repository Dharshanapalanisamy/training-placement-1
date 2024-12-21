1)
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        
        in.close();
    }
}

--------------------------------------------------------------------------------------------------------------------

  2)
port java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}

--------------------------------------------------------------------------------------------------------------------

  3)
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        
        in.close();
    }
}

--------------------------------------------------------------------------------------------------------------------

  4)
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}

--------------------------------------------------------------------------------------------------------------------
  5)
# Solution

import java.util.Scanner;

public class Solution {
    static int breadth;
    static int height;
    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if (breadth <= 0 || height <= 0) {
            throw new Exception("Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        int area = breadth * height;
        System.out.println(area);
    }
}

--------------------------------------------------------------------------------------------------------------------
  6)
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            sc.close();
    }
}

--------------------------------------------------------------------------------------------------------------------
  7)
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
{ 
    static int B; 
    static int H; 
    static boolean 
    flag = true;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive"); 
            flag = false;
        }
    }

}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

--------------------------------------------------------------------------------------------------------------------
  8)
  import java.util.*;

class Solution {
    public static void main(String[] args) {
        List<String> events = Arrays.asList("event1", "event2", "event3");
        List<Student> remainingStudents = new ArrayList<>();
        remainingStudents.sort((s1, s2) -> {
            if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
                return Double.compare(s2.getCGPA(), s1.getCGPA());
            }
            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }
            return Integer.compare(s1.getID(), s2.getID());
        });

        for (String event : events) {
            System.out.println(event);
        }

        Collections.sort(remainingStudents, (s1, s2) -> {
            if (Double.compare(s2.getCGPA(), s1.getCGPA()) != 0) {
                return Double.compare(s2.getCGPA(), s1.getCGPA());
            }
            if (!s1.getName().equals(s2.getName())) {
                return s1.getName().compareTo(s2.getName());
            }
            return Integer.compare(s1.getID(), s2.getID());
        });

        for (Student student : remainingStudents) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private double cgpa;
    private String name;
    private int id;

    public Student(double cgpa, String name, int id) {
        this.cgpa = cgpa;
        this.name = name;
        this.id = id;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}

--------------------------------------------------------------------------------------------------------------------
  9)

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}

--------------------------------------------------------------------------------------------------------------------
  10)

public class WelcomeToJava {

	public static void main(String[] args) {
		System.out.println("Hello, World.");
		System.out.println("Hello, Java.");

	}
}
