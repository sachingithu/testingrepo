package com.mlab;

import java.util.Arrays;
import java.util.Collections;
 
public class SortEx{
    public static void main(String[] args)
    {
       
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
 
       
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.printf("Sorterd Array is :"+Arrays.toString(arr));
    }
}