package interview.nimGame;

import java.util.Scanner;

public class NimGame {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int n = new Scanner(System.in).nextInt();
        System.out.println(nimGame(n));
    }

    public static boolean nimGame(int n){
        return (n % 4 != 0);
    }
}
