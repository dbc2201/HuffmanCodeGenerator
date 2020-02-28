/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a string value: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        scanner.close();
    }
}
