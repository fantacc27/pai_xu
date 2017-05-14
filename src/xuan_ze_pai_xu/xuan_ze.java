/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuan_ze_pai_xu;
/**
 *
 * @author Xiao
 */
public class xuan_ze {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i =0;i<N;i++){
            int min = i;
            for(int j =i+1;j<N;j++){
                if(less(a[j],a[i])){
                    min = j;
                }
                exch(a,i,min);
            }
        }
    }
}
