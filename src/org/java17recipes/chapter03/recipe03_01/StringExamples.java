package org.java17recipes.chapter03.recipe03_01;

public class StringExamples {
    public static void main(String[] args) {
        String quote = "The only thing we have to fear is fear itself";
        String person = "Franklin D. Roosevelt";
        substringExamples(quote, person);
    }

    public static void substringExamples(String quote, String person) {
        System.out.println(quote + " - " + person);
        System.out.println("String length: " + quote.length());
        System.out.println(quote.substring(0, 30));
        System.out.println(quote.substring(31));
        System.out.println(person);
    }
}
