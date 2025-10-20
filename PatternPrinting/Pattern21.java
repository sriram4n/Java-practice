/*
6 6 6 6 6 6 6 6 6 6 6 
6 5 5 5 5 5 5 5 5 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 2 1 2 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 5 5 5 5 5 5 5 5 6 
6 6 6 6 6 6 6 6 6 6 6
*/

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();
        for(int i = 0; i < 2*n-1; i++){
            for(int j = 0; j < 2*n-1; j++){
                int top = i, left = j, right = (2 * n - 1 -1) - j, down = (2*n -1 -1) - i;
                System.out.print(n - Math.min(Math.min(top,down),Math.min(left, right)));
            }
            System.out.println();
        }
        scan.close();
    }
}