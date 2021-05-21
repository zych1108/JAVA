#  day02



## 1.变量的使用

1. java定义变量的格式：数据类型 变量名 = 变量值;

2. 说明：
   ① 变量必须先声明，后使用
   ② 变量都定义在其作用域内。在作用域内，它是有效的。换句话说，出了作用域，就失效了
   ③ 同一个作用域内，不可以声明两个同名的变量

*/

```java
class VariableTest {
	public static void main(String[] args) {
		//变量的定义
		int myAge = 12;
		//变量的使用
		System.out.println(myAge);
		
		//编译错误：使用myNumber之前并未定义过myNumber
		//System.out.println(myNumber);

		//变量的声明
		int myNumber;
		
		//编译错误：使用myNumber之前并未赋值过myNumber
		//System.out.println(myNumber);

		//变量的赋值
		myNumber = 1001;
		//编译不通过
		//System.out.println(myClass);

		//不可以在同一个作用域内定义同名的变量
		//int myAge = 22;
		
	}

	public void method(){
		int myClass = 1;
	}
}

//class VariableTest {}//逆向思维，反证法
```

##  2. Java定义的数据类型

/*
Java定义的数据类型

一、变量按照数据类型来分：

```java
基本数据类型：
	整型：byte \ short \ int \ long
	浮点型：float \ double
	字符型：char
	布尔型：boolean
```


```java
引用数据类型：
	类(class)
	接口(interface)
	数组(array)
```

二、变量在类中声明的位置：
		成员变量  vs  局部变量

```java
class VariableTest1 {
	public static void main(String[] args) {
		//1. 整型：byte(1字节=8bit) \ short(2字节) \ int(4字节) \ long(8字节)
		//① byte范围：-128 ~ 127
		//
		byte b1 = 12;
		byte b2 = -128;
		//b2 = 128;//编译不通过
		System.out.println(b1);
		System.out.println(b2);
		// ② 声明long型变量，必须以"l"或"L"结尾
		// ③ 通常，定义整型变量时，使用int型。
		short s1 = 128;
		int i1 = 1234;
		long l1 = 3414234324L;
		System.out.println(l1);

		//2. 浮点型：float(4字节) \ double(8字节)
		//① 浮点型，表示带小数点的数值
		//② float表示数值的范围比long还大

		double d1 = 123.3;
		System.out.println(d1 + 1);
		//③ 定义float类型变量时，变量要以"f"或"F"结尾
		float f1 = 12.3F;
		System.out.println(f1);
		//④ 通常，定义浮点型变量时，使用double型。

		//3. 字符型：char (1字符=2字节)
		//① 定义char型变量，通常使用一对'',内部只能写一个字符
		char c1 = 'a';
		//编译不通过
		//c1 = 'AB';
		System.out.println(c1);

		char c2 = '1';
		char c3 = '中';
		char c4 = 'ス';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		//② 表示方式：1.声明一个字符 2.转义字符 3.直接使用 Unicode 值来表示字符型常量
		char c5 = '\n';//换行符
		c5 = '\t';//制表符
		System.out.print("hello" + c5);
		System.out.println("world");

		char c6 = '\u0043';
		System.out.println(c6);

		//4.布尔型：boolean
		//① 只能取两个值之一：true 、 false
		//② 常常在条件判断、循环结构中使用
		boolean bb1 = true;
		System.out.println(bb1);

		boolean isMarried = true;
		if(isMarried){
			System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
		}else{
			System.out.println("你可以多谈谈女朋友！");
		}

	}
}

```

##  3.基本数据类型之间的运算规则

/*
基本数据类型之间的运算规则：

前提：这里讨论只是7种基本数据类型变量间的运算。不包含boolean类型的。

1. 自动类型提升：
    结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
	byte 、char 、short --> int --> long --> float --> double 

	特别的：当byte、char、short三种类型的变量做运算时，结果为int型
	
2. 强制类型转换：见VariableTest3.java

说明：此时的容量大小指的是，表示数的范围的大和小。比如：float容量要大于long的容量
*/

```java
class VariableTest2 {
	public static void main(String[] args) {
		
		byte b1 = 2;
		int i1 = 129;
		//编译不通过
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);//123.0

		//***************特别地*********************
		char c1 = 'a';//97
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);

		short s2 = 10;
		//char c2  = c1 + s2;//编译不通过

		byte b2 = 10;
		//char c3 = c1 + b2;//编译不通过

		//short s3 = b2 + s2;//编译不通过

		//short s4 = b1 + b2;//编译不通过
		//****************************************

	}
}

```

/*
强制类型转换：自动类型提升运算的逆运算。
1.需要使用强转符：()
2.注意点：强制类型转换，可能导致精度损失。

*/

```java
class VariableTest3 {
	public static void main(String[] args) {
		
		double d1 = 12.9;
		//精度损失举例1
		int i1 = (int)d1;//截断操作
		System.out.println(i1);
		
		//没有精度损失
		long l1 = 123;
		short s2 = (short)l1;
		
		//精度损失举例2
		int i2 = 128;
		byte b = (byte)i2;
		System.out.println(b);//-128

	}
}

```

##  4. String类型变量的使用

/*
String类型变量的使用

1. String属于引用数据类型,翻译为：字符串
2. 声明String类型变量时，使用一对""
3. String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
4. 运算的结果仍然是String类型

*/

```java
class StringTest {
	public static void main(String[] args) {
		
		String s1 = "Hello World!";

		System.out.println(s1);

		String s2 = "a";
		String s3 = "";

		//char c = '';//编译不通过

		//***********************
		int number = 1001;
		String numberStr = "学号：";
		String info = numberStr + number;// +：连接运算
		boolean b1 = true;
		String info1 = info + b1;// +：连接运算
		System.out.println(info1);

		//***********************
		//练习1
		char c = 'a';//97   A:65
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//hello10a

		//练习2
		//*	*
		System.out.println("*	*");
		System.out.println('*' + '\t' + '*');
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ('\t' + "*"));


		//***********************

		//String str1 = 123;//编译不通过
		String str1 = 123 + "";
		System.out.println(str1);//"123"
		
		//int num1 = str1;
		//int num1 = (int)str1;//"123"

		int num1 = Integer.parseInt(str1);
		System.out.println(num1);//123
	}
}

```

