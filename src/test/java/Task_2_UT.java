package test.java;

import main.java.Task2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Task_2_UT {
    private Task2 a;

    @BeforeMethod
    public void beforeTest() {
        a = new Task2();
    }

    @Test
    public void Test1() {

        String name = "Andrii";
        String x = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
        assertEquals(x, a.printName());
    }

    @Test
    public void Test2() {

        String name = "Andrii";
        String x = "";
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                x += name + " ";
            }
            x += "\n";
        }
        assertNotEquals(x, a.printName());
    }
    @Test
    public void Test3() {
        assertEquals(355, a.printName().length());
    }

}
