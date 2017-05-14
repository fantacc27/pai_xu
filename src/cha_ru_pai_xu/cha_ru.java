/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cha_ru_pai_xu;

/**
 *
 * @author Xiao
 */
public class cha_ru {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i = 1; i<N;i++){
            for(int j = i; j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
}
