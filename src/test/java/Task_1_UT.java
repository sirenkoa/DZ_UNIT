package test.java;

import main.java.Task1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task_1_UT {
        private Task1 a;

        @BeforeMethod
        public void beforeTest() {
            a = new Task1();
        }

        @Test
        public void test1() {

            assertEquals(0, a.min(0, 3, 5));
        }

        @Test
        public  void test2() {
            assertEquals(-3, a.min(-1, -2, -3));
        }

        @Test
        public  void test3() {

            assertEquals(-1, a.min(-1, 0, 1));
        }


}
