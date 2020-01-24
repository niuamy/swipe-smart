package org.swiperight.swipesmart;

import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        System.out.print("hello world");
    }
    /**
     * Prompts for and returns swipe amount
     *
     * @return swipe amount
     */
    private static int swipeAmount(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your swipe amount: ");
        String input = s.nextLine();
        while(!canParseInt(input)){
            System.out.print("Error! Swipe value must be numeric. Enter your swipe amount: ");
            input = s.nextLine();
        }
        return Integer.parseInt(input);
    }

    /**
     * Checks whether the given {@code String} represents a valid integer value
     * in the range Integer.MIN_VALUE..Integer.MAX_VALUE.
     *
     * @param s
     *            the {@code String} to be checked
     * @return true if the given {@code String} represents a valid integer,
     *         false otherwise
     * @ensures canParseInt = [the given String represents a valid integer]
     */
    public static boolean canParseInt(String s) {
        assert s != null : "Violation of: s is not null";
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
