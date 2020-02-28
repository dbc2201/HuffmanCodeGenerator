/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package main;

import binaryGenerator.BinaryGenerator;
import huffmanGenerator.HuffmanGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a string value: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        BinaryGenerator binaryGenerator = new BinaryGenerator(userInput);
        String binaryString = binaryGenerator.convertNormalStringToBinaryString();
        HuffmanGenerator huffmanGenerator = new HuffmanGenerator(userInput);
        String huffmanString = huffmanGenerator.convertNormalStringToHuffmanString();
        int lengthOfBinaryString = binaryString.length();
        int lengthOfHuffmanString = huffmanString.length();
        System.out.println("The binary string has " + lengthOfBinaryString + " characters.");
        System.out.println("The huffman string has " + lengthOfHuffmanString + " characters.");
        System.out.println("Compression Ratio (Huffman/Binary): " + (lengthOfHuffmanString / lengthOfBinaryString) + "%");
        scanner.close();
    }
}
