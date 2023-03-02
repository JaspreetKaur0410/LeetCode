/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Knapasack01.KnapSack01_Memo;
import Knapasack01.KnapSack01_Recursion;
import Knapasack01.KnapSack01_TopDown;

/**
 *
 * @author jaspr_000
 */
public class Main {
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };
        int[] val = { 60, 100, 120 };
        KnapSack01_Recursion ks01 = new KnapSack01_Recursion();
        int result_ks01 = ks01.KS01(wt, val, 50, wt.length-1);
        System.out.println(" ************************************************** "+result_ks01);
        
        KnapSack01_Memo ksmemo = new KnapSack01_Memo();
        int result_ksmemo= ksmemo.KSMemo(wt, val, 50, wt.length-1);
        System.out.println(" ************************************************** "+result_ksmemo);
        
        KnapSack01_TopDown kstopdown = new KnapSack01_TopDown();
        int result_kstopdown= kstopdown.knapsackTopdown(wt, val, 50, wt.length-1);
        System.out.println(" ************************************************** "+result_kstopdown);
    }
    
}
