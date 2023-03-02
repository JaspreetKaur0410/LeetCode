/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Knapasack01;

import static java.lang.Integer.max;

/**
 *
 * @author jaspr_000
 */
public class KnapSack01_Memo {
    
    public int KSMemo(int wt[], int val[], int W, int n){
        int memo[][] = new int[n+1][W+1];
        return callMemo(wt, val, W, n, memo);
    }
    public int callMemo(int wt[], int val[], int W, int n, int memo[][]){
        if(n==0 || W==0)
            return 0;
        else if(memo[n][W]!= -1){
            System.out.println(n+" "+W);
            return memo[n][W];
        }
        else if(wt[n] <= W){
            return memo[n][W] = max( (val[n]+callMemo(wt,val,W-wt[n],n-1,memo)), callMemo(wt,val,W,n-1,memo) );
        }
        else{
            return memo[n][W] =  callMemo(wt, val, W, n-1, memo);
        }
    }
    
}
