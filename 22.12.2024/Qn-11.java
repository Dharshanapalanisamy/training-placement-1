import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abc = 1;
        while (sc.hasNextLine()) {
            String l = sc.nextLine();
            System.out.println(abc + " " + l);
            abc++;
        }
        sc.close();
    }
}
