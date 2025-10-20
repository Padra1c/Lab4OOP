//Padraic O Loughlin
//20/10/2025
//Lab 6

package ie.atu;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

public class TryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter file name: ");
        String fileName = sc.nextLine().trim();

        System.out.println("Please enter a name to save: ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true)))
        {
            out.println(name);
            System.out.println("Saved to" + fileName);
        }
        catch (IOException ex)
        {
            System.out.println("Could not write to file: " + ex.getMessage());
        }
    }
}

