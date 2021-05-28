/**
 * 
 */
package com.atguigu.java;

import java.util.Arrays;

/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月27日上午11:46:13
 */
public class day07Test {
   public static void main(String[] args) {
//	   1.	使用冒泡排序，实现如下的数组从小到大排序。
	    int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i = 0;i<arr.length-1;i++) {
        	for(int j = 0;j<arr.length-1-i ;j++) {
        		if(arr[j]>arr[j+1]) {
        			int temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        		}
        	}
        }
        System.out.print(Arrays.toString(arr));
	    
//	  2.如何反转上面的数组。请代码实现
       // int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
        for(int i = 0;i<arr.length-1;i++) {
        	for(int j = 0;j<arr.length-1-i ;j++) {
        		if(arr[j]<arr[j+1]) {
        			int temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        		}
        	}
        }
        System.out.print(Arrays.toString(arr));
//	  3. 复制上述数组，得到一个新的数组
       System.out.println();
       int[] arr1 =new int[arr.length];
       for(int i = 0;i<arr.length;i++) {
    	   arr1[i] = arr[i];
       }
       System.out.println(Arrays.toString(arr1));
//	  4. 使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
        int goal = 22;
        boolean isflag = true;
        for(int i = 0;i<arr1.length;i++) {
        	if(arr[i]==goal) {
        		System.out.println("位置为"+i);
        		isflag = false;
        		break;
        	}
        }
        if(isflag) {
        	System.out.println("没有找到");
        }
//	  5. 数组中常见的异常有哪些？请举例说明

}
}
