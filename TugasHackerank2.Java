import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         String kata = input.nextLine();
         int x = input.nextInt();
         int y = input.nextInt();
         System.out.println(kata.substring(x,y));
    }
    
}
