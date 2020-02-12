import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class addTest {

    add t=new add();

    @Test
    public void addNum() {

        assertEquals(4,t.addNum(2,2));
    }




    @Test
    public void show() {
        String str = "";
        Random rd = new Random();
        String num = String.valueOf(rd.nextInt(10));
        String str1 = str +" "+ num + " Big Monkey";

        assertEquals(str1,t.show("") );

    }


}