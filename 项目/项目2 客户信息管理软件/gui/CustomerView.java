/**
 * 
 */
package com.atguigu.p2.gui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * @Description  CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author zych1108
 * @version
 * @date 2021年6月2日下午3:06:36
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	
	
	public CustomerView() {
		Customer customer = new Customer("王涛",'男',23,"123333","we@dd.com");
		customerList.addCustomer(customer);
	}
	/**
	 * @Description用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
	 */
	public void enterMainMenu() {
		boolean isflag = true;
		while(isflag) {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println();
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出");
			System.out.println();
			System.out.print("                     请选择(1-5)：");
		
			//读入用户的选择
			char menu = CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();//方法中调用方法 不用加对象
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				//System.out.println("退出");
				System.out.print("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isflag = false;
				}
			}
		}
	} 
	
	/**
	 * @Description 添加客户的操作
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话：");
		String phone = CMUtility.readString(13);
		System.out.println("邮箱：");
		String email = CMUtility.readString(30);
		
		//将上述数据封装到对象中
		Customer customer =new Customer(name,gender,age,phone,email);
		
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("---------------------添加成功---------------------");
		}else {
			System.out.println("--------------目录已满，添加失败---------------------");
		}
	} 
	
    /**
     * @Description 修改客户的操作
     */
	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer cust; 
		int number;
		
		for(;;) {
			System.out.println("请选择待修改客户编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;//结束当前方法。
			}
			
		    cust = customerList.getCustomer(number-1);
			if(cust == null) {
				System.out.println("无法找到指定客户！");
			}else {
				break;
			}
		}
		
		//修改客户信息
		System.out.print("姓名("+cust.getName()+")：");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别("+cust.getGender()+")：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄("+cust.getAge()+")：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话("+cust.getPhone()+")：");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.print("邮箱("+cust.getEmail()+")：");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newcust = new Customer(name,gender,age,phone,email);
		
		boolean isReplaced = customerList.replaceCustomer(number-1, newcust);
		if(isReplaced) {
			System.out.println("---------------------修改完成---------------------");
		}else {
			System.out.println("---------------------修改失败---------------------");
		}
	}
	
	/**
	 * @Description删除客户
	 */
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		int number;
		for(;;) {
			System.out.print("请选择待删除客户编号(-1退出)：");
		    number = CMUtility.readInt();
			
			if(number == -1) {
				return;
		    }
			
			Customer cust = customerList.getCustomer(number-1);
			if(cust == null) {
				System.out.println("无法找到指定客户！");
			}else {
				break;
			}
		}
		
		//找到了指定用户 进行删除
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y') {
			boolean delectsuccess = customerList.deleteCustomer(number-1);
			if(delectsuccess) {
				System.out.println("---------------------删除成功---------------------");
			}else {
				System.out.println("---------------------删除失败---------------------");
			}
		}else {
			return;
		}
		
		
	}
	
	/**
	 * @Description 显示客户列表的操作
	 */
	private void listAllCustomers() {
		System.out.println();
		System.out.println("---------------------------客户列表---------------------------");
		
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i<custs.length;i++) {
				Customer cust = custs[i];
				System.out.println((i + 1)+"\t"+cust.getName()+"\t"+ cust.getGender()+"\t"
				                   +cust.getAge()+"\t\t"+cust.getPhone()+"\t\t"+cust.getEmail());
			}
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}
	
	/**
	 * @Description用途：创建CustomerView实例，并调用 enterMainMenu()方法以执行程序。
	 */
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
		
	
	}

	
}
