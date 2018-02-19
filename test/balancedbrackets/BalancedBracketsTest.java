/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancedbrackets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Angel
 */
public class BalancedBracketsTest {
    
    public BalancedBracketsTest() {
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
     * Test of main method, of class BalancedBrackets.
     */
    @Test
    public void testMain() {
        String expected = "NO";
        assertEquals(expected, BalancedBrackets.isBalanced(""));
    }
    
    @Test
    public void testParentesisPareja(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("()"));
    }
    
    @Test
    public void testCorchetesPareja(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("{}"));
    }
    
    @Test
    public void testLlavesPareja(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("{}"));
    }
    
    @Test
    public void TestMuchosParentesis(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("((()))"));
    }
    
    @Test
    public void TestMuchasLlaves(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("{{{}}}"));
    }
    
    @Test
    public void TestCombinacionLlaves(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("[{()}]"));
    }
    
    @Test
    public void TestCombinacionLlavesDescontinuado(){
        String expected = "YES";
        assertEquals(expected, BalancedBrackets.isBalanced("[{()}]({})"));
    }
    
    @Test
    public void TestDesequilibrio(){
        String expected = "NO";
        assertEquals(expected, BalancedBrackets.isBalanced("["));
    }
    
    @Test
    public void TestDesequilibrioVariasLlaves(){
        String expected = "NO";
        assertEquals(expected, BalancedBrackets.isBalanced("[{})"));
    }
}