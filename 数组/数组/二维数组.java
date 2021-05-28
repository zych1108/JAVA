/**
 * 
 */
package com.atguigu.java;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月24日下午3:47:29
 */

/*1.对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。其实，从数组底层的运行机制来看，其实没
有多维数组。
* 2.二维数组的使用
 *	 ①二维数组的声明和初始化
 *	 ②如何调用数组的指定位置的元素②如何调用数组的指定位置的元素
 *   ③如何获取数组的长度
 *   ④如何遍历数组
 *   ⑤数组元素的默认初始化值  见ArrayTest3.java
 *   ⑥数组的内存解析

*/
public class ArrayTest2 {
	public static void main(String[] args) {
		//1.二维数组的声明和初始化
		//静态初始化
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];//第一个[]必须有值
		//正确的，不标准
		String[] arr4[] = new String[3][];
		
		//2.如何调用数组的指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		//System.out.println(arr3[1][0]);//报错
		//为了不报错
		arr3[1]=new String[4];
		System.out.println(arr3[1][0]);//null
		
		//3.如何获取数组的长度
		System.out.println(arr1.length);//3
		System.out.println(arr1[1].length);//2 加了序号是指的是内层数组
		
		//4.如何遍历数组
		for(int i = 0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"  ");
			}
		}
		
	}

}
