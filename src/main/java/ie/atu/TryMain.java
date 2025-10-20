//Padraic O Loughlin
//20/10/2025
//Lab 6

package ie.atu;

import java.util.Scanner;

public class TryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
            System.out.print("Enter your age");
            String text = sc.nextLine().trim();
            try{
                age = Integer.parseInt(text);
                System.out.println("Thanks! You entered age = " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input" + e.getMessage());
            }
    }
