package test.java;

import main.java.lessons2;
import org.testng.annotations.Test;

public class test {

        @Test
        public  void Test1 (){
            lessons2 obj = new lessons2();
            obj.setAge(29);
            obj.setName("Andrii");

            System.out.println(obj.getName());
            System.out.println(obj.getAge());
            System.out.println(obj.getAgeGroup());
        }
}

