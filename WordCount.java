package com.pack1;

public class WordCount {

    public static void main(String[] args) {
        String str = "hello akesh raj yara";
        System.out.println("Given string is: " + str);
        int count = 1; 

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("The number of words in the string is: " + count);
    }
}

