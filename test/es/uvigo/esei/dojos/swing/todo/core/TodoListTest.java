/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
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

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
 System.out.println("moveUp");
 int i = 0;
 TodoList instance = new TodoList();
 String item = "sai"; //first entry name
 instance.add(item); // add entry to the list, position is 0, now size is 1
 item = "suresh"; //second entry name,
 instance.add(item); // add entry to the list, position is 1, now size is 2
 item = "aditya";// Third entry name
 instance.add(item);//add entry to the list, position is 2, now size is 3       
 instance.moveUp(1); // move 'suresh' up, so the position is 0 now
 String expResult = "suresh"; // expected string name is SURESH
 String result = instance.elementAt(0); // suresh is at position 0 now
 assertEquals(expResult, result); // expected result is suresh, actual result must be SURESH
 System.out.println("entry has been moved up to one position "+result);    
}

@Test
public void testMoveDown() 
{
System.out.println("movedown");
 int i = 0;
 TodoList instance = new TodoList();
 String item = "sai"; //first entry name
 instance.add(item); // add entry to the list, position is 0, now size is 1
 item = "suresh"; //second entry name,
 instance.add(item); // add entry to the list, position is 1, now size is 2
 item = "aditya";// Third entry name
 instance.add(item);//add entry to the list, position is 2, now size is 3       
 instance.moveUp(1); // move 'sai' down, so the position is 1 now          
 String expResult = "suresh";
 instance.moveDown(0);
 String actual = instance.elementAt(1); // sai is at position 1 now
 assertEquals(expResult, actual); // // expected result is SAI, actual result must be SAI
 System.out.println("entry has been moved down to one position "+actual);    
}

@Test
public void testAdd() 
{
 System.out.println("add");
 String item = "sai";
 TodoList instance = new TodoList();
 instance.add(item);
 int i = instance.size();
 assertTrue( i > 0);
 System.out.println("Entry is added to the list");  
}

@Test
public void testEditAt() 
{
 System.out.println("elementAt");
 int i = 0;
 TodoList instance = new TodoList();
 String item = "sai"; //first entry name
 instance.add(item); // add entry to the list, position is 0, now size is 1
 item = "suresh"; //second entry name,
 instance.add(item); // add entry to the list, position is 1, now size is 2
 item = "aditya";// Third entry name
 instance.add(item);//add entry to the list, position is 2, now size is 3       
 instance.moveUp(1); // move 'sai' down, so the position is 1 now   
 String expResult = "aditya";
 String result = instance.elementAt(2); // find aditya is there in the list
 assertEquals(expResult, result);
 System.out.println("entry is found"+result); 
}

@Test
public void testRemoveAt() 
{
System.out.println("removeAt");
 TodoList instance = new TodoList();
 String item = "sai";  
 instance.add(item); // adding entry 'suresh' to the list at position 0, so size is 1
 instance.removeAt(0); // removing entry 'suresh' at position zero, so size is 0 
 int i = instance.size(); // now the size of the array list i zero 
 assertTrue( i == 0); // check size is zero
 System.out.println("Entry is removed from the list");  
}

@Test
public void testSize() 
{
 System.out.println("size");
 TodoList instance = new TodoList();
 String item = "sai"; //first entry name
 instance.add(item); // add entry to list, now size is 1
 item = "suresh"; //second entry name,
 instance.add(item); // add entry to the list, now size is 2
 item = "aditya";// Third entry name
 instance.add(item);//add entry to the list, now size is 3
 int expResult = 3; //added 3 entries to the list, so size is 3 and expected result is 3
 int actual = instance.size(); // get the size of the array
 assertEquals(expResult, actual); // expresult is 3 and actual result must be 3
 System.out.println("Size of the array is "+actual);
}
    
}
