/**
 * 
 */
package com.atguigu.java;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月24日下午4:11:59
 */
/*  ⑤数组元素的默认初始化值  
 *    针对初始化方式一：比如int[][] arr = new int[4][3];
 *    外层元素的初始化值为：地址值
 *    内层元素的初始化值为：与一维数组初始化情况相同
 *    
 *    针对初始化方式二：比如：int[][] arr = new int[4][];
 *    外层元素的初始化值为：null
 *    内层元素的初始化值为：不能调用，否则报错。 
 *   
*   ⑥数组的内存解析
*   
*/
/*
 * 
 */
public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//地址值 [I@182decdb
		System.out.println(arr[0][0]);//0
		System.out.println(arr);//地址值
		
		String[][] arr2 = new String[4][2];
		System.out.println(arr2[1]);//地址值
	
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]);//null 因为arr3[1]是一个数组，属于引用数据类型，所以是null
		//System.out.println(arr3[1][2]);//报错
		
	    int[][] arr4 = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
	    int sum=0;
	    for(int i = 0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++) {
	    		sum+=arr[i][j];
	    	}
	    }
	    
	    //使用二维数组打印一个10 行杨辉三角
	    /*提示
	    1. 第一行有1 个元素, 第n 行有n 个元素
	    2. 每一行的第一个元素和最后一个元素都是1
	    3. 从第三行开始, 对于非第一个元素和最后一个元
	    素的元素。即：
	    */
	    //yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
	    //1.声明二维数组
	    int[][] yangHui = new int[10][];
	    //2.给数组赋值
	    for(int i=0;i<yangHui.length;i++) {
	    	yangHui[i]=new int[i+1];
	    	//2.1给首末元素赋值
	    	yangHui[i][0]=yangHui[i][i]=1;
	    	//2.2给非首末元素赋值
	    	if(i>1) {
	    	for(int j=1;j<yangHui[i].length-1;j++) {
	    		yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
	    	}
	    }
	    }
	    
	    
	    //3.遍历数组
	    for(int i = 0;i<yangHui.length;i++) {
	    	for(int j=0;j<yangHui[i].length;j++) {
	    		System.out.print(yangHui[i][j]+"  ");
	    	}
	    	System.out.println();
	    }
	//3.4 组数组涉的见法中涉及的常见算法
	    //1. 数组元素的赋值(杨辉三角、回形数等)
	    //2. 求数值型数组中元素的最大值、最小值、平均数、总和等
	    //3. 数组的复制、反转、查找(线性查找、二分法查找)
	    //4. 数组元素的排序算法
	}
}
