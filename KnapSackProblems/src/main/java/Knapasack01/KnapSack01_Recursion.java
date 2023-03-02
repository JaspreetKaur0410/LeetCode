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

/*
We have items with their Weights(w) and Values(v) respectively
And we have bag of Capacity W(maximum weight a bag can hold)
We have to choose items to keep in the bag so we get maximum profit(maximum value)
Its not mandatory that our bag gets fully filled - we have to just maximise profit and sum of weights of items 
should be less than maximum capacity of Bag(W)
*/


public class KnapSack01_Recursion {
    
    public int KS01(int wt[], int val[], int W, int n){
        if(n==0 || W==0)
            return 0;
        if(wt[n] <= W){
            return max( (val[n]+KS01(wt,val,W-wt[n],n-1)), KS01(wt,val,W,n-1) );
        }
        else{
            return KS01(wt, val, W, n-1);
        }
    }
    
}
