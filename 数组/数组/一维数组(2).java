/**
 * 
 */
package com.atguigu.java;
import java.util.Scanner;
/**
 * @Description
 * @author zych1108
 * @version
 * @date 2021年5月24日下午2:16:00
 */
/*⑤数组元素的默认初始化值
 *       >数组元素是整型：0
         >数组元素是浮点型：0.0
         >数组元素是char型：数字0或‘\u0000’,而非'0'   ///但是运行显示不出0
         >数组元素是boolean型：false
         
         >数组元素是引用数据类型时：null
 *⑥数组的内存解析
 * 
 */
public class ArrayTest1 {
  public static void main(String[] args) {
	//5.数组元素的默认初始化值
     int[] arr =new int[4];
     for(int i = 0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
     
     float[] arr1 =new float[4];
     for(int i = 0;i<arr1.length;i++) {
    	 System.out.println(arr1[i]);
     }
  
     char[] arr2 =new char[4];
     for(int i = 0;i<arr2.length;i++) {
    	 System.out.println("---"+arr2[i]+"***");
     }
  
     //引用数据类型
     String[] arr3 =new String[4];
     for(int i = 0;i<arr1.length;i++) {
    	 System.out.println(arr3[i]);
     }
     
//                                练习1
//     升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调、卫生间、厨房齐全。
//     屋内均是IT行业人士，喜欢安静。所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
//     •public class ArrayTest {
//     •public static void main(String[] args) {
//     •int[] arr = new int[]{8,2,1,0,3};
//     •int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
//     •String tel = "";
//     •for(int i = 0;i < index.length;i++){
//     •tel += arr[index[i]];
//     •}
//     •System.out.println("联系方式："+ tel);//1801
//     •}
//     •}
    
/*
* 2. 从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。 成绩>=最高分-10 等级为’A’ 成绩>=最高分-20 等级为’B’
* 成绩>=最高分-30 等级为’C’ 其余等级为’D’ 提示：先读入学生人数，根据人数创建int数组， 存放学生成绩。
*/
     //1.使用scanner，读取学生个数
     Scanner scan = new Scanner(System.in);
     System.out.print("请输入学生个数：");
     int stunum = scan.nextInt();
     //2.创建数组，存储学生成绩，动态初始化
     int[] score = new int[stunum];
     //3.给数组中的元素赋值
     for(int i = 0;i<stunum;i++) {
    	 System.out.print("请输入第"+i+"个学生的成绩：");
    	 score[i]=scan.nextInt();
     }
     //4.获取数组中元素的最大值：最高分
     int maxScore=0;
     for(int i = 0;i<stunum;i++) {
    	 if(maxScore<score[i]){
    		 maxScore=score[i];
    	 }
     }
     System.out.println("最高分为："+maxScore);
     //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩。
     for(int i = 0;i<stunum;i++) {
    	 if(score[i]>=maxScore-10) {
    		 System.out.println("第"+i+"个学生的等级为：A");
    	 }else if(score[i]>=maxScore-20) {
    		 System.out.println("第"+i+"个学生的等级为：B");
    	 }else if(score[i]>=maxScore-30) {
    		 System.out.println("第"+i+"个学生的等级为：C");
    	 }else{
    		 System.out.println("第"+i+"个学生的等级为：D");
    	 }
     } 
  }
}
