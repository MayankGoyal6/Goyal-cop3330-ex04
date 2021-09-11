/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 4
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a noun: ");
    String noun = scanner.nextLine();

    System.out.print("Enter a verb: ");
    String verb = scanner.nextLine();     

    System.out.print("Enter an adjective: ");
    String adjective = scanner.nextLine();

    System.out.print("Enter an adverb: ");
    String adverb = scanner.nextLine();

    System.out.println("Do you walk your " + adjective + " " + noun + " " + adverb + " " + "?" + " That's hilarious!");
  
  }
}