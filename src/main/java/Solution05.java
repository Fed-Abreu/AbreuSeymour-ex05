import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution05 {
    /*

    print "What is your first number?"
        Add Scanner Scan String Num1 = input
    print "What is the second number?"
        Scan String Num2 = input
    int newNum1 = integer.parseInt("Num1")
    int newNum2 = integer.parseInt("Num2")

    int sum = newNum1 + newNum2
    int diff = newNum1 - newNum2
    int prod = newNum1 * newNum2
    int quot = newNum1 / newNum2

    print newNum1 + "+" + newNum2 + "=" + sum
    print newNum1 + "-" + newNum2 + "=" + diff
    print newNum1 + "*" + newNum2 + "=" + prod
    print newNum1 + "/" + newNum2 + "=" + quot




     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first number? ");
            String Num1 = input.nextLine();
        System.out.print("What is your second number? ");
            String Num2 = input.nextLine();
        int newNum1 = Integer.parseInt(Num1);
        int newNum2 = Integer.parseInt(Num2);

        int sum = newNum1 + newNum2;
        int diff = newNum1 - newNum2;
        int prod = newNum1 * newNum2;
        int quot = newNum1 / newNum2;

        System.out.println(newNum1 + " + " + newNum2 + " = " + sum);
        System.out.println(newNum1 + " - " + newNum2 + " = " + diff);
        System.out.println(newNum1 + " * " + newNum2 + " = " + prod);
        System.out.println(newNum1 + " / " + newNum2 + " = " + quot);

    }
}
