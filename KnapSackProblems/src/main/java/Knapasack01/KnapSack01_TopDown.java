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
public class KnapSack01_TopDown {

    public int knapsackTopdown(int wt[], int val[], int W, int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
 
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w]
                        = max(val[i - 1]
                                  + K[i - 1][w - wt[i - 1]],
                              K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
 
        return K[n][W];
    }

}
