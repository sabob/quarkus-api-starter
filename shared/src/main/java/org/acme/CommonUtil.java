package org.acme;

public class CommonUtil{

    public static String reverseString(String input){
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

}
