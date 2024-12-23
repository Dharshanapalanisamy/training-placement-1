import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String n="";
        char c;
        for (int i=0;i<A.length();i++)
        {
            c=A.charAt(i);
            n=c+n;
        }
        if(n.equalsIgnoreCase(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
