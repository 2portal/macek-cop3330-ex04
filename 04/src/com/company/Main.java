package com.company;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner nouninput = new Scanner (System.in);
        String noun = nouninput.next();

        System.out.print("Enter a verb: ");
        Scanner verbinput = new Scanner (System.in);
        String verb = verbinput.next();

        System.out.print("Enter an adjective: ");
        Scanner adjectiveinput = new Scanner (System.in);
        String adjective = adjectiveinput.next();

        System.out.print("Enter an adverb: ");
        Scanner adverbinput = new Scanner (System.in);
        String adverb = adverbinput.next();



        System.out.println("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? that's hilarious!");
    }
}