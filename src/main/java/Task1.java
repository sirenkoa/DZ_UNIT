package main.java;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(min(5,6,3));
    }

    public static int min(int a, int b, int c) {
        if(a<b&&a<c) return a;
        if(b<a&&b<c) return b;
        if(c<b&&c<a) return c;
        return 0;
    }

}
