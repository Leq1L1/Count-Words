/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.leqili.countwords;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }



public class countWords {
    public int wordCounter(String words) {
        int wordCount = 0;
        char[] wordChars = words.toCharArray();
        boolean lastCharWasLetter = false;
        for(int i = 0; i <= words.length(); i++){
            if (wordChars[i] == ' '){

            }
        }
        
        return wordCount;
    }
}

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
