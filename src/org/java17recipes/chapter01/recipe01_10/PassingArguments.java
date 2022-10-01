package org.java17recipes.chapter01.recipe01_10;

/* In Command Prompt run the following:
* javac PassingArguments.java
* java PassingArguments.java Nhan Truong
* java PassingArguments.java "Nhan Truong" "UAR Team"
* */

public class PassingArguments {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("Arguments that were passed to the program: ");
            for (String arg:args){
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments passed to the program.");
        }
    }
}
