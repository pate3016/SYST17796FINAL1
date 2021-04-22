/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetSalary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damini
 */
public class net_SalaryIT {
    
    public net_SalaryIT() {
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
     * Test of calculateNet method, of class net_Salary.
     */
    @Test
    public void testCalculateNet() {
        int hours = 6;
        int rate = 8;
        int tax = 10;
        net_Salary test = new net_Salary();
        int result = test.calculateNet(hours,rate,tax);
        assertEquals(38,result);
    }   
}
