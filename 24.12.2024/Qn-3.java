import java.util.*;
import java.io.*;
public class loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr = new int[t][3];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            arr[i][0] = a; 
            arr[i][1] = b; 
            arr[i][2] = n; 
        }
        in.close();
        for (int k = 0; k < t; k++) {
            int a = arr[k][0];
            int b = arr[k][1];
            int n = arr[k][2];
            int sum = a;

            for (int j = 0; j < n; j++) {  
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum);
                if (j < n - 1) { 
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
