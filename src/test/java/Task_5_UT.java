package test.java;

import main.java.Task5;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Task_5_UT {
    private Task5 a;

    @BeforeMethod
    public void beforeTest() {
        a = new Task5 ();
    }

    @Test
    public void Test1() {
        String str = "Hello world!!!";
        assertEquals("!!!dlrow olleH", a.reverseArray(str));
    }

    @Test
    public void Test2() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 1);
        assertEquals("H", a.reverseArray(lastChar));
    }

    @Test
    public void Test3() {
        String s = "!!!dlrow olleH";
        String lastChar = s.substring(s.length() - 5);
        assertEquals("Hello", a.reverseArray(lastChar));
    }

}
