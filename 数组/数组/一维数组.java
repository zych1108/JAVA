/**
 * 
 */
package com.atguigu.java;

import java.io.OutputStream;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月23日下午5:32:30
 */

/*
 * 一、数组的概述
 * 1.数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式
 * 对这些数据进行统一管理。
 * 2.数组的相关概念
 * >数组名
 * >下标
 * >角标、下标、索引
 * >数组的长度：元素的个数
 * 
 * 3.数组的特点：
 * 1）有序排列
 * 2）数组本身是引用数据类型，而数组中的元素可以是任何数据类型，包括基本数据类型和引用数据类型。
 * 3）创建数组对象会在内存中开辟一整块连续的空间，而数组名中引用的是这块连续空间的首地址。
 * 4）数组的长度一旦确定，就不能修改。
  我们可以直接通过下标(或索引)的方式调用指定位置的元素，速度很快。
 * 4.数组的分类
 * 	①按照维数：一维、二维、
 *  ②按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
 * 5.一维数组的使用
 *	 ①一维数组的声明和初始化
 *	 ②如何调用数组的指定位置的元素②如何调用数组的指定位置的元素
 *   ③如何获取数组的长度
 *   ④如何遍历数组
 *   ⑤数组元素的默认初始化值  见ArrayTest1.java
 *   ⑥数组的内存解析
 *
 *
 *
 
 */
public class ArrayTest {
	 public static void main(String[] args) {
		//①一维数组的声明和初始化
		 int[] ids;//声明
		 //1.1静态初始化:数组的初始化和数组元素的赋值同时进行
		 ids = new int[]{10001,10002,10003,10004};
		 //1.2动态初始化：数组的初始化和数组元素的赋值分开进行
		 String[] names = new String[5];
		 //总结：数组一旦初始化完成，其长度就确定了。
		 
		//2如何调用数组的指定位置的元素②如何调用数组的指定位置的元素
		 //数组的角标是从0开始，最大为n-1
		 names[0]="章鱼0";
		 names[1]="章鱼1";
		 names[2]="章鱼2";
		 names[3]="章鱼3";
		 names[4]="章鱼4";
	 
		 //3.③如何获取数组的长度 
		 //属性：length
		 System.out.println(names.length);//5
		 System.out.println(ids.length);
		 // 4.如何遍历数组
		 for(int i = 0;i<names.length;i++) {
			 System.out.println(names[i]);
		 }
		 
		 
		
		 
		 
		 
		 
				 
	}
}
