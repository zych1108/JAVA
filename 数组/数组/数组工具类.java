/**
 * 
 */
package com.atguigu.java;

import java.util.Arrays;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月27日上午11:04:27
 */
/*
 * java.util.Arrays：操作数组的工具类，里面定义了很多操作数组的方法
 * 
 */
public class ArraysTest {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b)	:判断两个数组是否相等
    	int[] arr1 = new int[] {1,2,3,4};
    	int[] arr2 = new int[] {1,3,2,4};
    	boolean isEquals = Arrays.equals(arr1, arr2);
    	System.out.println(isEquals);
    	
    	//2.StringtoString(int[] a):输出数组的信息
    	System.out.println(Arrays.toString(arr1));
    	
    	//3.void fill(int[] a,int val)将指定值填充到数组之中。
    	Arrays.fill(arr1, 10);
    	System.out.println(Arrays.toString(arr1));
    	
    	//4.void sort(int[] a)对数组进行排序。
    	Arrays.sort(arr2);
    	System.out.println(Arrays.toString(arr2));
    	
    	//5.int binarySearch(int[] a,int key)对排序后的数组进行二分法检索指定的值
    	int[] arr3 = new int[] {-98,-34,2,34,54,66,79,105,210,333};
    	int index = Arrays.binarySearch(arr3, 211);
    	if(index>0) {
    		System.out.println(index);
    	}else {
    		System.out.println("未找到");
    	}
    	
    	
}
}
