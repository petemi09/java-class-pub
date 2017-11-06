/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author petemi09
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void TestTask1(){
        System.out.println("task1");
        Integer i = 10;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 20;
        Integer result = instance.task1(i);
        assertEquals(expResult, result);
        i = 30;
        expResult = 60;
        result = instance.task1(i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestTask2(){
        System.out.println("task2");
        String s = "Mitch";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task2(s);
        assertEquals(expResult, result);
        s = "Petellin";
        expResult = 8;
        result = instance.task2(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestTask3(){
        System.out.println("task3");
        char m = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(m);
        assertEquals(expResult, result);
        m = 'p';
        expResult = 112;
        result = instance.task3(m);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestTask4(){
        System.out.println("task4");
        String o = "Mitchell";
        Ex4Driver instance = new Ex4Driver();
        char expResult = 'M';
        char result = instance.task4(o);
        assertEquals(expResult, result);
        o = "Petellin";
        expResult = 'P';
        result = instance.task4(o);
        assertEquals(expResult, result);
    }
    @Test
    public void TestTask5(){
        System.out.println("task5");
        Integer m = 11;
        Integer p = 7;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 18;
        Integer result = instance.task5(m, p);
        assertEquals(expResult, result);
        m = 111;
        p = 777;
        expResult = 888;
        result = instance.task5(m, p);
        assertEquals(expResult, result);
    }
    @Test
    public void TestTask6(){
        System.out.println("task6");
        String k = "Mitchell";
        Integer l = 6;
        Ex4Driver instance = new Ex4Driver();
        char expResult = 'l';
        char result = instance.task6(k, l);
        assertEquals(expResult, result);
        l = 2;
        expResult = 't';
        result = instance.task6(k, l);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestTask7(){
        System.out.println("task7");
        Integer[] m = new Integer[7];
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 7;
        Integer result = instance.task7(m);
        assertEquals(expResult, result);
        m = new Integer[11];
        expResult = 11;
        result = instance.task7(m);
        assertEquals(expResult, result);
    }
    @Test
    public void TestTask8(){
        System.out.println("task8");
        Integer[] m = new Integer[7];
        Integer p = 7;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = true;
        Boolean result = instance.task8(m, p);
        assertEquals(expResult, result);
        p = 11;
        expResult = false;
        result = instance.task8(m, p);
        assertEquals(expResult, result);
    }
    
    @Test
    public void TestTask9(){
        System.out.println("task9");
        ArrayList<String> m = new ArrayList<String>();
        for(int i = 0; i < 7; i++)
            m.add("");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 7;
        Integer result = instance.task9(m);
        assertEquals(expResult, result);
        m = new ArrayList<String>();
        for(int i = 0; i < 11; i++)
            m.add("");
        expResult = 11;
        result = instance.task9(m);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTask10(){
        System.out.println("task10");
        HashMap<Integer,String> m = new HashMap<Integer,String>();
        for(int i = 0; i < 12; i++)
            m.put(i,"");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task10(m);
        assertEquals(expResult, result);
        m = new HashMap<Integer,String>();
        for(int i = 0; i < 167; i++)
            m.put(i,"");
        expResult = 167;
        result = instance.task10(m);
        assertEquals(expResult, result);
    }
}
