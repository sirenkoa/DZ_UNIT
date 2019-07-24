package main.java;

public class Task5 {

    public static void main(String[] args) {}


        public String reverseArray(String str ) {
            String result = "";
            char symbols[] = str.toCharArray();
            for (int i=symbols.length-1; i>=0; i--) {
                result += symbols[i];
            }

            return result;


        }
}

