package main.java;

public class Task2 {
    public static void main(String[] args) {
    }

    public static String printName () {
        String name = "Andrii";
        String str = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                str += name + " ";
            }
            str += "\n";
        }
        return str;
    }

}



