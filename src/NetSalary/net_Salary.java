/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetSalary;

/**
 *
 * @author Damini
 */
public class net_Salary {
    public int calculateNet(int hours, int rate, int tax){
        int netSalary = hours * rate - tax;
        return netSalary;
    }
}
